package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE

class CollisionMap : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 4 }
            .and { it.instanceFields.count { it.type == INT_TYPE.withDimensions(2) } == 1 }
            .and { it.instanceFields.size == 5 }

    class flags : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE.withDimensions(2) }
    }

    class xInset : OrderMapper.InConstructor.Field(CollisionMap::class, 0, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class yInset : OrderMapper.InConstructor.Field(CollisionMap::class, 1, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class xSize : OrderMapper.InConstructor.Field(CollisionMap::class, -2, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }

    class ySize : OrderMapper.InConstructor.Field(CollisionMap::class, -1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters()
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE && it.arguments.isEmpty() }
    }
}