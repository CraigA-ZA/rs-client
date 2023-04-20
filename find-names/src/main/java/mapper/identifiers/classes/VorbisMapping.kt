package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.Class2
import mapper.wrappers.Instruction2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

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