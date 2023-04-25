package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(Entity::class, SeqType::class)
class GraphicsObject : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Entity>() }
            .and { it.instanceMethods.size == 2 }
            .and { it.instanceFields.count { it.type == type<SeqType>() } == 1 }

    @DependsOn(SeqType::class)
    class seqType : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<SeqType>() }
    }

    class frame : OrderMapper.InConstructor.Field(GraphicsObject::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class frameCycle : OrderMapper.InConstructor.Field(GraphicsObject::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class id : OrderMapper.InConstructor.Field(GraphicsObject::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class plane : OrderMapper.InConstructor.Field(GraphicsObject::class, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class x : OrderMapper.InConstructor.Field(GraphicsObject::class, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class y : OrderMapper.InConstructor.Field(GraphicsObject::class, 5) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class height : OrderMapper.InConstructor.Field(GraphicsObject::class, 6) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class cycleStart : OrderMapper.InConstructor.Field(GraphicsObject::class, 7) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class isFinished : OrderMapper.InConstructor.Field(GraphicsObject::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }

    @MethodParameters("cycles")
    class advance : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
    }

    @MethodParameters()
    @DependsOn(Entity.getModel::class)
    class getModel : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Entity.getModel>().mark }
    }
}