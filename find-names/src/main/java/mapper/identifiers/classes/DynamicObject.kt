package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(Entity::class, SeqType::class)
class DynamicObject : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Entity>() }
            .and { it.instanceMethods.size == 1 }
            .and { it.instanceFields.count { it.type == type<SeqType>() } == 1 }

    @DependsOn(SeqType::class)
    class seqType : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<SeqType>() }
    }

    class id : OrderMapper.InConstructor.Field(DynamicObject::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class type : OrderMapper.InConstructor.Field(DynamicObject::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class orientation : OrderMapper.InConstructor.Field(DynamicObject::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class plane : OrderMapper.InConstructor.Field(DynamicObject::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }
    class x : OrderMapper.InConstructor.Field(DynamicObject::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class y : OrderMapper.InConstructor.Field(DynamicObject::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class frame : OrderMapper.InConstructor.Field(DynamicObject::class, 6) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class cycleStart : OrderMapper.InConstructor.Field(DynamicObject::class, 7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(Entity.getModel::class)
    class getModel : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Entity.getModel>().mark }
    }
}