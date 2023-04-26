package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

class AABB : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count() == 6 }
            .and { it.instanceFields.all { it.type == Type.INT_TYPE}}
            .and { it.instanceMethods.isEmpty()}


    class xMid : OrderMapper.InConstructor.Field(AABB::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }


    class yMid : OrderMapper.InConstructor.Field(AABB::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }


    class zMid : OrderMapper.InConstructor.Field(AABB::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }


    class xMidOffset : OrderMapper.InConstructor.Field(AABB::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }


    class yMidOffset : OrderMapper.InConstructor.Field(AABB::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }


    class zMidOffset : OrderMapper.InConstructor.Field(AABB::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }
}