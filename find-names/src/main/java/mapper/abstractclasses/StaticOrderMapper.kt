package mapper.abstractclasses

import mapper.predicateutilities.Predicate
import mapper.wrappers.*
import java.lang.reflect.Modifier

abstract class StaticOrderMapper<T>(val position: Int) : Mapper<T>(), InstructionResolver<T> {

    override fun match(jar: JarWrapper): T {
        val n = position.takeUnless { it < 0 } ?: position * -1 - 1
        val instructions = jar.classes.asSequence()
                .flatMap { it.methods.asSequence() }
                .filter { Modifier.isStatic(it.access) }
                .flatMap { it.instructions }
        val relativeInstructions = if (position >= 0) {
            instructions
        } else {
            instructions.toList().asReversed().asSequence()
        }
        val instructionMatches = relativeInstructions.filter(predicate).toList()
        instructionMatches.mapTo(HashSet()) { it.method }.single()
        return resolve(instructionMatches[n])
    }

    abstract val predicate: Predicate<InstructionMapper>

    abstract class Class(position: Int) : StaticOrderMapper<ClassWrapper>(position), ElementMatcher.Class, InstructionResolver.Class

    abstract class Field(position: Int) : StaticOrderMapper<FieldWrapper>(position), ElementMatcher.Field, InstructionResolver.Field

    abstract class Method(position: Int) : StaticOrderMapper<MethodWrapper>(position), ElementMatcher.Method, InstructionResolver.Method
}