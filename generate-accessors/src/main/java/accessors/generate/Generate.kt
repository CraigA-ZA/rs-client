package org.runestar.client.raw.accessors

import accessors.generate.*
import accessors.generate.base.Accessor
import accessors.generate.base.MethodExecution
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.PropertyAccessor
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.common.collect.Multimap
import com.google.common.collect.MultimapBuilder
import com.squareup.javapoet.*
import org.jetbrains.annotations.NotNull
import org.objectweb.asm.Type
import shared.Constants
import shared.UtilFunctions
import shared.model.IdClass
import java.net.URL
import java.net.URLClassLoader
import java.nio.file.Paths
import javax.lang.model.element.Modifier
import kotlin.reflect.jvm.jvmName
import java.lang.reflect.Modifier as RModifier

fun main() {
    Generate().run()
}

class Generate {

    private companion object {
        const val INDENT = "\t"
        const val SETTER_PARAM_NAME = "value"
        val VOID_OBJECT_TYPENAME: TypeName = TypeName.get(Void::class.java)
        const val CONSTRUCTOR_ARG_PREFIX = "arg"
        const val OUTPUT_PKG = "runestar.generated"
        const val CALLBACK_FIELD_INIT = "new MethodExecution.Implementation()"
        private val ACCESSOR_TYPENAME: ClassName = ClassName.get(Accessor::class.java)
        private val METHOD_EXECUTION_TYPENAME: ClassName = ClassName.get(MethodExecution::class.java)
        private val jsonMapper = ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
    }

    private val names: List<IdClass> = jsonMapper.readValue(Constants.NAMES_JSON.toFile(), object : TypeReference<List<IdClass>>() {});

    val hooks = names.map { c ->
        val fields = c.fields.map { f ->
            FieldHook(f.field, f.owner, f.name, f.access, f.descriptor, 1)
        }
        val methods = c.methods.map { m ->
            val desc = m.descriptor
            MethodHook(m.method, m.owner, m.name, m.access, m.parameters, desc, 0)
        }
        val constructors = findConstructors()
        val cons = constructors[c.name].toList()
        ClassHook(c.className, c.name, c.superName, c.access, c.interfaces, fields, methods, cons)
    }

    private val typeTransforms = hooks.associate { it.name to "X" + it.`class` }

    private fun findConstructors(): Multimap<String, ConstructorHook> {
        val classNodes = UtilFunctions.loadJarASM(Constants.DEOB_OUTPUT_JAR_PATH).values;
//        val opDescs = jsonMapper.readValue<Map<String, String>>(opDescsJson.toFile())
        val constructors = MultimapBuilder.hashKeys().arrayListValues().build<String, ConstructorHook>()
        classNodes.forEach { c ->
            c.methods.forEach { m ->
                if (m.name == "<init>") {
                    val desc = m.desc
                    constructors.put(c.name, ConstructorHook(m.access, desc))
                }
            }
        }
        return constructors
    }


    fun run() {
        val outputDir = Paths.get("client-api/src/main/java/")
        hooks.forEach { c ->
            val typeBuilder = TypeSpec.interfaceBuilder(typeTransforms[c.name])
                    .addSuperinterface(ACCESSOR_TYPENAME)
                    .addModifiers(Modifier.PUBLIC)
                    .addJavadoc(classModifiersToString(c.access))
            if (c.`super` in typeTransforms) {
                typeBuilder.addSuperinterface(ClassName.get(OUTPUT_PKG, typeTransforms[c.`super`]))
            } else if (c.`super` != Any::class.jvmName) {
                typeBuilder.addJavadoc(" extends {@link ${c.`super`}}")
            }
//            c.interfaceDescriptors.forEach { desc ->
//                typeBuilder.addSuperinterface(poetType(desc))
//            }
            c.fields.forEach { f ->
                val fieldTypeName = poetType(f.descriptor)
                val fieldModifiersString = fieldModifiersToString(f.access)
                typeBuilder.addMethod(
                        MethodSpec.methodBuilder(f.getterMethod)
                                .addModifiers(Modifier.ABSTRACT, Modifier.PUBLIC)
                                .addJavadoc(fieldModifiersString)
                                .returns(fieldTypeName)
                                .build()
                )
                if (!RModifier.isFinal(f.access)) {
                    typeBuilder.addMethod(
                            MethodSpec.methodBuilder(f.setterMethod)
                                    .addModifiers(Modifier.ABSTRACT, Modifier.PUBLIC)
                                    .addParameter(fieldTypeName, SETTER_PARAM_NAME)
                                    .addJavadoc(fieldModifiersString)
                                    .build()
                    )
                }
            }
            c.methods.filter { it.parameters != null }.forEach { m ->
                val returnDesc = m.returnDescriptor
                typeBuilder.addMethod(
                        MethodSpec.methodBuilder(m.method)
                                .addModifiers(Modifier.ABSTRACT, Modifier.PUBLIC)
                                .addJavadoc(methodModifiersToString(m.access))
                                .returns(poetType(returnDesc))
                                .addParameters(
                                        m.actualParameters.map {
                                            ParameterSpec.builder(poetType(it.descriptor), it.name).build()
                                        }
                                )
                                .build()
                )
                if (!RModifier.isInterface(c.access) && !RModifier.isAbstract(m.access)) {
                    val instanceType = if (RModifier.isStatic(m.access)) VOID_OBJECT_TYPENAME else poetType(c.descriptor)
                    val returnType = poetType(returnDesc, true)
                    val callbackType = ParameterizedTypeName.get(METHOD_EXECUTION_TYPENAME, instanceType, returnType)
                    typeBuilder.addField(
                            FieldSpec.builder(callbackType, m.method)
                                    .initializer(CALLBACK_FIELD_INIT)
                                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                                    .addAnnotation(NotNull::class.java)
                                    .addJavadoc(seeMethodTag(c, m))
                                    .build()
                    )
                }
            }
            if (c.name == "client") {
                hooks.filter { !RModifier.isAbstract(it.access) }.forEach { hc ->
                    hc.constructors.forEach { hcon ->
                        typeBuilder.addMethod(
                                MethodSpec.methodBuilder(hc.constructorName)
                                        .addModifiers(Modifier.ABSTRACT, Modifier.PUBLIC)
                                        .addJavadoc(constructorModifiersToString(hcon.access))
                                        .returns(poetType(hc.descriptor))
                                        .addParameters(
                                                hcon.argumentDescriptors.mapIndexed { i, desc ->
                                                    ParameterSpec.builder(poetType(desc), "$CONSTRUCTOR_ARG_PREFIX$i").build()
                                                }
                                        )
                                        .build()
                        )
                    }
                }
            }
            JavaFile.builder(OUTPUT_PKG, typeBuilder.build())
                    .indent(INDENT)
                    .build()
                    .writeTo(outputDir)
        }
//        project.addCompileSourceRoot(outputDir.toString())
    }

    private fun poetType(descriptor: String, wrapPrimitives: Boolean = false): TypeName {
        val type = Type.getType(descriptor)
        val baseType = type.baseType
        val baseName: TypeName = if (typeTransforms.containsKey(baseType.className)) {
            ClassName.get(OUTPUT_PKG, typeTransforms[baseType.className])
        } else {
            val classLoader: ClassLoader = URLClassLoader(arrayOf(URL("file:" + Constants.VANILLA_GAMEPACK_DIR)))
            val klass = classLoader.loadClassFromDescriptor(baseType.descriptor)
            val klassName = TypeName.get(klass)
            if (type.arrayDimensions == 0 && wrapPrimitives) {
                klassName.box()
            } else {
                klassName
            }
        }
        var name = baseName
        repeat(type.arrayDimensions) {
            name = ArrayTypeName.of(name)
        }
        return name
    }

    private fun seeMethodTag(classHook: ClassHook, methodHook: MethodHook): String {
        val argList = methodHook.actualParameters.map {
            val type = Type.getType(it.descriptor)
            val baseType = type.baseType
            if (baseType.className in typeTransforms) {
                typeTransforms.getValue(baseType.className) + ("[]".repeat(type.arrayDimensions))
            } else {
                ClassLoader.getSystemClassLoader().loadClassFromDescriptor(type.descriptor).simpleName
            }
        }
        return "@see X${classHook.`class`}#${methodHook.method}(${argList.joinToString()})"
    }
}