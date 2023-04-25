package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

class VorbisFloor : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 1 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 5 }

    class multiplier : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
    }

    class subclassBooks : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE.withDimensions(2) }
    }

    class partitionClassList : OrderMapper.InConstructor.Field(VorbisFloor::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class classDimensions : OrderMapper.InConstructor.Field(VorbisFloor::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class classSubClasses : OrderMapper.InConstructor.Field(VorbisFloor::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class classMasterbooks : OrderMapper.InConstructor.Field(VorbisFloor::class, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class xList : OrderMapper.InConstructor.Field(VorbisFloor::class, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }
}