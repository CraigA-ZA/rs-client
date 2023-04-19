package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2

class VorbisFloor : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 1 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 5 }

    class multiplier : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }

    class subclassBooks : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE.withDimensions(2) }
    }

    class partitionClassList : OrderMapper.InConstructor.Field(VorbisFloor::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class classDimensions : OrderMapper.InConstructor.Field(VorbisFloor::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class classSubClasses : OrderMapper.InConstructor.Field(VorbisFloor::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class classMasterbooks : OrderMapper.InConstructor.Field(VorbisFloor::class, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class xList : OrderMapper.InConstructor.Field(VorbisFloor::class, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }
}