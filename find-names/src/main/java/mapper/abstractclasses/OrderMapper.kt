package mapper.abstractclasses

import mapper.predicateutilities.Predicate
import mapper.predicateutilities.predicateOf
import mapper.wrappers.*
import kotlin.reflect.KClass

abstract class OrderMapper<T>(val position: Int, val maxMatches: Int = Int.MAX_VALUE) : Mapper<T>(), InstructionResolver<T> {

    abstract val method: MethodWrapper

    override fun match(jar: JarWrapper): T {
        val n = position.takeUnless { it < 0 } ?: position * -1 - 1
        val insns = if (position >= 0) method.instructions else method.instructions.toList().asReversed().asSequence()
        val matches = insns.filter(predicate).toList()
        check(matches.size <= maxMatches)
        return resolve(matches[n])
    }

    abstract val predicate: Predicate<InstructionMapper>

    abstract class InMethod<T>(val methodMapper: KClass<out Mapper<MethodWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE) : OrderMapper<T>(position, maxMatches) {

        override val method get() = context.methods.getValue(methodMapper)

        abstract class Class(
                methodMapper: KClass<out Mapper<MethodWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InMethod<ClassWrapper>(methodMapper, position, maxMatches), ElementMatcher.Class, InstructionResolver.Class

        abstract class Field(
                methodMapper: KClass<out Mapper<MethodWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InMethod<FieldWrapper>(methodMapper, position, maxMatches), ElementMatcher.Field, InstructionResolver.Field

        abstract class Method(
                methodMapper: KClass<out Mapper<MethodWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InMethod<MethodWrapper>(methodMapper, position, maxMatches), ElementMatcher.Method, InstructionResolver.Method
    }

    abstract class InConstructor<T>(val classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE) : OrderMapper<T>(position, maxMatches) {

        override val method: MethodWrapper
            get() {
            return context.classes.getValue(classMapper).constructors.single(constructorPredicate)
        }

        open val constructorPredicate = predicateOf<MethodWrapper> { true }

        abstract class Class(
                classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InConstructor<ClassWrapper>(classMapper, position, maxMatches), ElementMatcher.Class, InstructionResolver.Class

        abstract class Field(
                classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InConstructor<FieldWrapper>(classMapper, position, maxMatches), ElementMatcher.Field, InstructionResolver.Field

        abstract class Method(
                classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InConstructor<MethodWrapper>(classMapper, position, maxMatches), ElementMatcher.Method, InstructionResolver.Method
    }

    abstract class InClassInitializer<T>(val classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE) : OrderMapper<T>(position, maxMatches) {

        override val method: MethodWrapper
            get() {
            return context.classes.getValue(classMapper).classInitializer!!
        }

        abstract class Class(
                classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InClassInitializer<ClassWrapper>(classMapper, position, maxMatches), ElementMatcher.Class, InstructionResolver.Class

        abstract class Field(
                classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InClassInitializer<FieldWrapper>(classMapper, position, maxMatches), ElementMatcher.Field, InstructionResolver.Field

        abstract class Method(
                classMapper: KClass<out Mapper<ClassWrapper>>, position: Int, maxMatches: Int = Int.MAX_VALUE
        ) : InClassInitializer<MethodWrapper>(classMapper, position, maxMatches), ElementMatcher.Method, InstructionResolver.Method
    }
}