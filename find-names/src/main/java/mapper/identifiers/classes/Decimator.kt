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

class Decimator : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.count { it.type == INT_TYPE.withDimensions(2) } == 1 }

    class resample : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
    }

    class inputRate : OrderMapper.InConstructor.Field(Decimator::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class outputRate : OrderMapper.InConstructor.Field(Decimator::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class table : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE.withDimensions(2) }
    }

    @MethodParameters("rate")
    class scaleRate : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.instructions.none { it.opcode == Opcodes.BIPUSH && it.intOperand == 6 } }
    }

    @MethodParameters("position")
    class scalePosition : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.BIPUSH && it.intOperand == 6 } }
    }
}