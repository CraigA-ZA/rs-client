package mapper.abstractclasses

import mapper.wrappers.ClassWrapper
import mapper.wrappers.ElementMatcher
import mapper.wrappers.JarWrapper
import mapper.wrappers.MethodWrapper
import mapper.*
import mapper.predicateutilities.Predicate
import mapper.wrappers.*
import java.lang.reflect.Modifier
import kotlin.reflect.KClass

abstract class IdentityMapper<T> : Mapper<T>() {

    override fun match(jar: JarWrapper): T {
        return options(jar).filter { predicate(it) }.single()
    }

    protected abstract fun options(jar: JarWrapper): Sequence<T>

    protected abstract val predicate: Predicate<T>

    abstract class Class : IdentityMapper<ClassWrapper>(), ElementMatcher.Class {
        override fun options(jar: JarWrapper): Sequence<ClassWrapper> {
            return jar.classes.filter { it.name.length <= 2 || it.name == "client" }.asSequence()
        }
    }

    abstract class Field : IdentityMapper<FieldWrapper>(), ElementMatcher.Field {
        override fun options(jar: JarWrapper): Sequence<FieldWrapper> {
            return jar.classes.asSequence().flatMap { it.fields.asSequence() }
        }
    }

    abstract class Method : IdentityMapper<MethodWrapper>(), ElementMatcher.Method {
        override fun options(jar: JarWrapper): Sequence<MethodWrapper> {
            return jar.classes.asSequence().flatMap { it.methods.asSequence() }
        }
    }

    abstract class StaticField : Field() {
        override fun options(jar: JarWrapper): Sequence<FieldWrapper> {
            return super.options(jar).filter { Modifier.isStatic(it.access) }
        }
    }

    abstract class InstanceField() : Field() {

        @Suppress("UNCHECKED_CAST")
        private val enclosing = javaClass.enclosingClass.kotlin as KClass<out Mapper<ClassWrapper>>

        override fun options(jar: JarWrapper): Sequence<FieldWrapper> {
            return super.options(jar).filter { context.classes[enclosing] == it.klass && !Modifier.isStatic(it.access)}
        }
    }

    abstract class StaticMethod() : Method() {
        override fun options(jar: JarWrapper): Sequence<MethodWrapper> {
            return super.options(jar).filter { Modifier.isStatic(it.access) && !it.isClassInitializer }
        }
    }

    abstract class InstanceMethod() : Method() {

        @Suppress("UNCHECKED_CAST")
        private val enclosing = javaClass.enclosingClass.kotlin as KClass<out Mapper<ClassWrapper>>

        override fun options(jar: JarWrapper): Sequence<MethodWrapper> {
            return super.options(jar).filter { context.classes[enclosing] == it.klass && !Modifier.isStatic(it.access) && !it.isConstructor }
        }
    }
}