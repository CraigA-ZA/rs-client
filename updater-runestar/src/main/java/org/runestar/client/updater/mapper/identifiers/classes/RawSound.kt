package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(AbstractSound::class)
class RawSound : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<AbstractSound>() }

    class samples : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
    }

    class sampleRate : OrderMapper.InConstructor.Field(RawSound::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 5 }
    }

    class start : OrderMapper.InConstructor.Field(RawSound::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 5 }
    }

    class end : OrderMapper.InConstructor.Field(RawSound::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 5 }
    }

    @MethodParameters("decimator")
    class resample : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { true }
    }
}