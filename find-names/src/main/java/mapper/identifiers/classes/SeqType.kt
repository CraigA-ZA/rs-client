package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.identifiers.ConstructorPutField
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(DualNode::class)
class SeqType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 5 }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.opcode == GOTO } }
                .and { it.instructions.none { it.opcode == BIPUSH && it.intOperand == 13 } }
                .and { it.arguments.startsWith(type<Packet>()) }
    }

    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.opcode == GOTO } }
                .and { it.instructions.any { it.opcode == BIPUSH && it.intOperand == 13 } }
    }

    class lefthand : OrderMapper.InConstructor.Field(SeqType::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class righthand : OrderMapper.InConstructor.Field(SeqType::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    class postDecode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.none { it.isMethod } }
    }

    @DependsOn(decode0::class)
    class frameLengths : OrderMapper.InMethod.Field(decode0::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(decode0::class)
    class frameIds : OrderMapper.InMethod.Field(decode0::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }



    @MethodParameters("model", "frame", "orientation")
    @DependsOn(LocType.getModelDynamic::class)
    class animateObject : UniqueMapper.InMethod.Method(LocType.getModelDynamic::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<SeqType>() }
    }

    @MethodParameters("model", "frame")
    @DependsOn(SpotType.getModel::class)
    class animateSpotAnimation : UniqueMapper.InMethod.Method(SpotType.getModel::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<SeqType>() }
    }

    @MethodParameters("model", "frame", "sequence", "sequenceFrame")
    @DependsOn(Model::class)
    class animateSequence2 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Model>() }
                .and { it.arguments.size == 4 }
                .and { it.arguments.startsWith(type<Model>(), Type.INT_TYPE, type<SeqType>(), Type.INT_TYPE) }
                .and {it.instructions.indexOfFirst { it.opcode == ALOAD } < 5 }
    }

    @MethodParameters("model", "frame")
    @DependsOn(animateSequence2::class)
    class animateSequence : UniqueMapper.InMethod.Method(animateSequence2::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<SeqType>() }
    }

    @MethodParameters("model", "frame")
    @DependsOn(Component.getModel::class)
    class animateComponent : UniqueMapper.InMethod.Method(Component.getModel::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<SeqType>() }
    }

    @DependsOn(animateComponent::class)
    class frameIds2 : OrderMapper.InMethod.Field(animateComponent::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
    }

    class frameCount : ConstructorPutField(SeqType::class, 0, Type.INT_TYPE)
}