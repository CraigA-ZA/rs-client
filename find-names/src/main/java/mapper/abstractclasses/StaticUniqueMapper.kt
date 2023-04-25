package mapper.abstractclasses

import mapper.predicateutilities.Predicate
import mapper.wrappers.*
import java.lang.reflect.Modifier

abstract class StaticUniqueMapper<T>() : Mapper<T>(), InstructionResolver<T> {

    override fun match(jar: JarWrapper): T {
        return jar.classes.asSequence()
                .flatMap { it.methods.asSequence() }
                .filter { Modifier.isStatic(it.access) }
                .flatMap { it.instructions }
                .filter(predicate)
                .mapTo(HashSet()) { resolve(it) }
                .single()
    }

    abstract val predicate: Predicate<InstructionMapper>

    abstract class Class : StaticUniqueMapper<ClassWrapper>(), ElementMatcher.Class, InstructionResolver.Class

    abstract class Field : StaticUniqueMapper<FieldWrapper>(), ElementMatcher.Field, InstructionResolver.Field

    abstract class Method : StaticUniqueMapper<MethodWrapper>(), ElementMatcher.Method, InstructionResolver.Method
}