package mapper.abstractclasses

import mapper.predicateutilities.Predicate
import mapper.predicateutilities.predicateOf
import mapper.wrappers.*
import kotlin.reflect.KClass

abstract class UniqueMapper<T> : Mapper<T>(), InstructionResolver<T> {

    abstract val method: MethodWrapper

    override fun match(jar: JarWrapper): T {
        return method.instructions.filter(predicate).mapTo(HashSet()) { resolve(it) }.single()
    }

    abstract val predicate: Predicate<InstructionWrapper>

    abstract class InMethod<T>(val methodMapper: KClass<out Mapper<MethodWrapper>>) : UniqueMapper<T>() {

        override val method get() = context.methods.getValue(methodMapper)

        abstract class Class(
                methodMapper: KClass<out Mapper<MethodWrapper>>
        ) : InMethod<ClassWrapper>(methodMapper), ElementMatcher.Class, InstructionResolver.Class

        abstract class Field(
                methodMapper: KClass<out Mapper<MethodWrapper>>
        ) : InMethod<FieldWrapper>(methodMapper), ElementMatcher.Field, InstructionResolver.Field

        abstract class Method(
                methodMapper: KClass<out Mapper<MethodWrapper>>
        ) : InMethod<MethodWrapper>(methodMapper), ElementMatcher.Method, InstructionResolver.Method
    }

    abstract class InConstructor<T>(val classMapper: KClass<out Mapper<ClassWrapper>>) : UniqueMapper<T>() {

        override val method: MethodWrapper
            get() {
            return context.classes.getValue(classMapper).constructors.single(constructorPredicate)
        }

        open val constructorPredicate = predicateOf<MethodWrapper> { true }

        abstract class Class(
                classMapper: KClass<out Mapper<ClassWrapper>>
        ) : InConstructor<ClassWrapper>(classMapper), ElementMatcher.Class, InstructionResolver.Class

        abstract class Field(
                classMapper: KClass<out Mapper<ClassWrapper>>
        ) : InConstructor<FieldWrapper>(classMapper), ElementMatcher.Field, InstructionResolver.Field

        abstract class Method(
                classMapper: KClass<out Mapper<ClassWrapper>>
        ) : InConstructor<MethodWrapper>(classMapper), ElementMatcher.Method, InstructionResolver.Method
    }

    abstract class InClassInitializer<T>(val classMapper: KClass<out Mapper<ClassWrapper>>) : UniqueMapper<T>() {

        override val method: MethodWrapper
            get() {
            return context.classes.getValue(classMapper).classInitializer!!
        }

        abstract class Class(
                classMapper: KClass<out Mapper<ClassWrapper>>
        ) : InClassInitializer<ClassWrapper>(classMapper), ElementMatcher.Class, InstructionResolver.Class

        abstract class Field(
                classMapper: KClass<out Mapper<ClassWrapper>>
        ) : InClassInitializer<FieldWrapper>(classMapper), ElementMatcher.Field, InstructionResolver.Field

        abstract class Method(
                classMapper: KClass<out Mapper<ClassWrapper>>
        ) : InClassInitializer<MethodWrapper>(classMapper), ElementMatcher.Method, InstructionResolver.Method
    }
}