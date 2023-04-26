package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

class VorbisResidue : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 6 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 1 }

    class type : OrderMapper.InConstructor.Field(VorbisResidue::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class begin : OrderMapper.InConstructor.Field(VorbisResidue::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class end : OrderMapper.InConstructor.Field(VorbisResidue::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class partitionSize : OrderMapper.InConstructor.Field(VorbisResidue::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class classifications : OrderMapper.InConstructor.Field(VorbisResidue::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class classbook : OrderMapper.InConstructor.Field(VorbisResidue::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class cascade : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == IntArray::class.type }
    }
}