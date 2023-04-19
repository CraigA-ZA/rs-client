package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(PcmStream::class)
class RawPcmStream : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<PcmStream>() }
            .and { it.instanceFields.size == 15 }

//    class start : OrderMapper.InConstructor.Field(RawPcmStream::class, 0) {
//        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 3 }
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class end : OrderMapper.InConstructor.Field(RawPcmStream::class, 1) {
//        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 3 }
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
}