package mapper.abstractclasses

import com.google.common.collect.BiMap
import com.google.common.collect.HashBiMap
import mapper.wrappers.ClassWrapper
import mapper.wrappers.ElementMatcher
import mapper.wrappers.JarWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type
import mapper.*
import mapper.wrappers.*
import kotlin.reflect.KClass

abstract class Mapper<T> : ElementMatcher<T> {

    lateinit var context: Context

    inline fun <reified T: Mapper<ClassWrapper>> klass(): ClassWrapper {
        return context.classes.getValue(T::class)
    }

    inline fun <reified T: Mapper<ClassWrapper>> type(): Type {
        return klass<T>().type
    }

    inline fun <reified T: Mapper<FieldWrapper>> field(): FieldWrapper {
        return context.fields.getValue(T::class)
    }

    inline fun <reified T: Mapper<MethodWrapper>> method(): MethodWrapper {
        return context.methods.getValue(T::class)
    }

    fun map(jar: JarWrapper) {
        val t = match(jar)
        val klass = this::class
        @Suppress("UNCHECKED_CAST")
        when (this) {
            is ElementMatcher.Class -> {
                klass as KClass<out Mapper<ClassWrapper>>
                t as ClassWrapper
                if(context.classes.inverse().containsKey(t)) {
                    println(context.classes.inverse().filter { entry -> entry.key == t})
                }
                check(!context.classes.inverse().containsKey(t))
                context.classes[klass] = t
            }
            is ElementMatcher.Field -> {
                klass as KClass<out Mapper<FieldWrapper>>
                t as FieldWrapper
                if(context.fields.inverse().containsKey(t)) {
                    println("Fuck")
                    println(context.fields.inverse().filter { entry -> entry.key == t})
                }
                check(!context.fields.inverse().containsKey(t))
                context.fields[klass] = t
            }
            is ElementMatcher.Method -> {
                klass as KClass<out Mapper<MethodWrapper>>
                t as MethodWrapper
                check(!context.methods.inverse().containsKey(t))
                context.methods[klass] = t
            }
            else -> error(this)
        }
    }

    class Context {

        val classes: BiMap<KClass<out Mapper<ClassWrapper>>, ClassWrapper> = HashBiMap.create()

        val fields: BiMap<KClass<out Mapper<FieldWrapper>>, FieldWrapper> = HashBiMap.create()

        val methods: BiMap<KClass<out Mapper<MethodWrapper>>, MethodWrapper> = HashBiMap.create()
    }
}

