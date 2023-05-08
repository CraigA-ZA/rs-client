package accessors.generate

import org.objectweb.asm.Type

internal val ClassHook.interfaceDescriptors: List<String> get() = interfaces.map { "L$it;" }

internal val ConstructorHook.argumentDescriptors: List<String> get() = Type.getArgumentTypes(descriptor).map { it.descriptor }

internal val MethodHook.argumentDescriptors: List<String> get() = Type.getArgumentTypes(descriptor).map { it.descriptor }

internal val MethodHook.returnDescriptor: String get() = Type.getReturnType(descriptor).descriptor

internal val MethodHook.actualParameters: List<ParameterHook> get() {
    return argumentDescriptors.take(checkNotNull(parameters).size).mapIndexed { i, desc ->
        ParameterHook(checkNotNull(parameters)[i], desc)
    }
}

internal data class ParameterHook(val name: String, val descriptor: String)


data class ClassHook(
        val `class`: String,
        val name: String,
        val `super`: String,
        val access : Int,
        val interfaces: List<String>,
        val fields: List<FieldHook>,
        val methods: List<MethodHook>,
        val constructors: List<ConstructorHook>
) {

    val constructorName get() = "_${`class`}_"

    val descriptor get() = "L$name;"
}

data class FieldHook(
        val field: String,
        val owner: String,
        val name: String,
        val access: Int,
        val descriptor: String,
        val decoder: Long?
) {
    val getterMethod get() = "get${field.capitalize()}"

    val setterMethod get() = "set${field.capitalize()}"

    val decoderNarrowed: Number? get() = when(decoder) {
        null -> null
        else -> {
            when (descriptor) {
                "I" -> decoder.toInt()
                "J" -> decoder
                else -> error(this)
            }
        }
    }
}

data class MethodHook(
        val method: String,
        val owner: String,
        val name: String,
        val access: Int,
        val parameters: List<String>?,
        val descriptor: String,
        val finalArgument: Int?
)

data class ConstructorHook(
        val access: Int,
        val descriptor: String
)