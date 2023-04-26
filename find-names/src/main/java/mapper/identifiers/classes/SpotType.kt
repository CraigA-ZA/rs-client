package mapper.identifiers.classes

import mapper.*
import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.*
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE

@DependsOn(DualNode::class)
class SpotType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == ShortArray::class.type } == 4 }
            .and { it.instanceFields.count { it.type == INT_TYPE } >= 8 }
            .and { it.instanceFields.all { it.type == INT_TYPE || it.type == ShortArray::class.type } }

    @MethodParameters("packet", "n")
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.opcode == BIPUSH && it.intOperand == 40 } }
    }

    @MethodParameters("packet")
    @DependsOn(decode0::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it != method<decode0>() }
    }


    @DependsOn(Client.getSpotType::class)
    class id : OrderMapper.InMethod.Field(Client.getSpotType::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<SpotType>() }
    }

    class sequence : OrderMapper.InConstructor.Field(SpotType::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(Model::class)
    class getModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Model>() }
                .and { it.arguments.count() == 1}
    }

    @DependsOn(Model::class)
    class getSharedModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Model>() }
                .and { it.arguments.count() == 0}
    }

//     in degrees, 0, 180, 270
    @DependsOn(getModel::class)
    class orientation : OrderMapper.InMethod.Field(getModel::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

//    @DependsOn(decode0::class)
//    class resizeh : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == ICONST_4 }
//                .nextWithin(10) { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    @DependsOn(decode0::class)
//    class resizev : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == ICONST_5 }
//                .nextWithin(10) { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//    @DependsOn(getModel::class)
//    class recol_s : OrderMapper.InMethod.Field(getModel::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == SALOAD }
//                .prevIn(2) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
//    }
//
//    @DependsOn(getModel::class)
//    class recol_d : OrderMapper.InMethod.Field(getModel::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == SALOAD }
//                .prevIn(2) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
//    }
//
//    @DependsOn(getModel::class)
//    class retex_s : OrderMapper.InMethod.Field(getModel::class, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == SALOAD }
//                .prevIn(2) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
//    }
//
//    @DependsOn(getModel::class)
//    class retex_d : OrderMapper.InMethod.Field(getModel::class, 3) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == SALOAD }
//                .prevIn(2) { it.opcode == GETFIELD && it.fieldType == ShortArray::class.type }
//    }

    @DependsOn(decode0::class)
    class model : OrderMapper.InMethod.Field(decode0::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class ambient : OrderMapper.InConstructor.Field(SpotType::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class contrast : OrderMapper.InConstructor.Field(SpotType::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }
}