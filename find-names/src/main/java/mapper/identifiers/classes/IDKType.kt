package mapper.identifiers.classes

import mapper.*
import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.*
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(DualNode::class)
class IDKType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == ShortArray::class.type } == 4 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 2 }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 1 }

    class head : UniqueMapper.InConstructor.Field(IDKType::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.BIPUSH && it.intOperand == 41 } }
    }

    @DependsOn(decode0::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it != method<decode0>() }
    }

    @DependsOn(decode0::class)
    class recol_s : OrderMapper.InMethod.Field(decode0::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == SASTORE }
                .prevWithin(7) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
    }

    @DependsOn(decode0::class)
    class recol_d : OrderMapper.InMethod.Field(decode0::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == SASTORE }
                .prevWithin(7) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
    }

    @DependsOn(decode0::class)
    class retex_s : OrderMapper.InMethod.Field(decode0::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == SASTORE }
                .prevWithin(7) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
    }

    @DependsOn(decode0::class)
    class retex_d : OrderMapper.InMethod.Field(decode0::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == SASTORE }
                .prevWithin(7) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
    }

    @DependsOn(decode0::class)
    class models : OrderMapper.InMethod.Field(decode0::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == ISTORE }
                .nextWithin(7) { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class bodyPart : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
    }

    @DependsOn(UnlitModel::class, models::class)
    class getModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<UnlitModel>() }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<models>().id } }
    }

    @DependsOn(UnlitModel::class, head::class)
    class getChatHeadModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<UnlitModel>() }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<head>().id } }
    }

    @DependsOn(models::class)
    class loadModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<models>().id } }
    }

    @DependsOn(head::class)
    class loadChatHeadModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<head>().id } }
    }
}