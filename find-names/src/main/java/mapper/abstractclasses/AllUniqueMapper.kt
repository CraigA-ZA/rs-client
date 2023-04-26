package mapper.abstractclasses

import mapper.predicateutilities.Predicate
import mapper.wrappers.*

abstract class AllUniqueMapper<T> : Mapper<T>(), InstructionResolver<T> {

    override fun match(jar: JarWrapper): T {
        return jar.classes.asSequence()
                .flatMap { it.methods.asSequence() }
                .flatMap { it.instructions }
                .filter(predicate)
                .mapTo(HashSet()) { resolve(it) }
                .single()
    }

    abstract val predicate: Predicate<InstructionWrapper>

    abstract class Class : AllUniqueMapper<ClassWrapper>(), ElementMatcher.Class, InstructionResolver.Class

    abstract class Field : AllUniqueMapper<FieldWrapper>(), ElementMatcher.Field, InstructionResolver.Field

    abstract class Method : AllUniqueMapper<MethodWrapper>(), ElementMatcher.Method, InstructionResolver.Method
}