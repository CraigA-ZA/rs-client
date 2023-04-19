package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Instruction2

class VorbisMapping : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 2 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 2 }

    class submaps : OrderMapper.InConstructor.Field(VorbisMapping::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class mappingMux : OrderMapper.InConstructor.Field(VorbisMapping::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class submapFloor : OrderMapper.InConstructor.Field(VorbisMapping::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE.withDimensions(1) }
    }

    class submapResidue : OrderMapper.InConstructor.Field(VorbisMapping::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE.withDimensions(1) }
    }
}