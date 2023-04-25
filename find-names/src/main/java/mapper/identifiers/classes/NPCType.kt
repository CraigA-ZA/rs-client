package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.nextWithin
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(Npc.type::class)
class NPCType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { field<Npc.type>().type == it.type }

    class name : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }

    class op : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Array<String>::class.type }
    }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == Opcodes.BIPUSH && it.intOperand == 17 } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == Opcodes.BIPUSH && it.intOperand == 17 } }
    }

    @DependsOn(Client.getNPCType::class)
    class id : OrderMapper.InMethod.Field(Client.getNPCType::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE && it.fieldOwner == type<NPCType>() }
    }

    @MethodParameters("s1", "n1", "s2", "n2")
    @DependsOn(Model::class)
    class getModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Model>() }
    }

    @DependsOn(getModel::class)
    class resizeh : OrderMapper.InMethod.Field(getModel::class, -1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }

    @DependsOn(getModel::class)
    class resizev : OrderMapper.InMethod.Field(getModel::class, -2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    class transform : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<NPCType>() }
    }

    @DependsOn(transform::class)
    class transforms : UniqueMapper.InMethod.Field(transform::class) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(transform::class)
    class transformVarbit : OrderMapper.InMethod.Field(transform::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }

    @DependsOn(transform::class)
    class transformVarp : OrderMapper.InMethod.Field(transform::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }

//    @DependsOn(decode0::class)
//    class combatLevel : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.BIPUSH && it.intOperand == 95 }
//                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }

    //TODO
//    @DependsOn(decode0::class)
//    class drawMapDot : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.BIPUSH && it.intOperand == 93 }
//                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
//    }

    @DependsOn(decode0::class)
    class isInteractable : UniqueMapper.InMethod.Field(decode0::class) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.BIPUSH && it.intOperand == 107 }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }

//    @DependsOn(decode0::class)
//    class headIconPrayer : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.BIPUSH && it.intOperand == 102 }
//                .nextWithin(2) { it.node is JumpInsnNode }
//                .nextWithin(12) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }

    class size : OrderMapper.InConstructor.Field(NPCType::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

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
    class models : OrderMapper.InMethod.Field(decode0::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

//    @DependsOn(getChatHeadModel::class)
//    class head : OrderMapper.InMethod.Field(getChatHeadModel::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == IntArray::class.type }
//    }

//    class readyanim : OrderMapper.InConstructor.Field(NPCType::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }

//    class turnleftanim : OrderMapper.InConstructor.Field(NPCType::class, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }
//
//    class turnrightanim : OrderMapper.InConstructor.Field(NPCType::class, 3) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }
//
//    class walkanim : OrderMapper.InConstructor.Field(NPCType::class, 4) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }
//
//    class walkbackanim : OrderMapper.InConstructor.Field(NPCType::class, 5) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }
//
//    class walkleftanim : OrderMapper.InConstructor.Field(NPCType::class, 6) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }
//
//    class walkrightanim : OrderMapper.InConstructor.Field(NPCType::class, 7) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }

    @MethodParameters()
    class postDecode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.isEmpty() }
    }

    @DependsOn(IterableNodeHashTable::class)
    class params : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<IterableNodeHashTable>() }
    }

    class getIntParam : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE, Type.INT_TYPE) }
    }

    class getStringParam : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == String::class.type }
                .and { it.arguments == listOf(Type.INT_TYPE, String::class.type) }
    }

//    @MethodParameters()
//    @DependsOn(UnlitModel::class)
//    class getChatHeadModel : InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<UnlitModel>() }
//    }

    class isFollower : OrderMapper.InConstructor.Field(NPCType::class, -1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }

    class ambient : OrderMapper.InConstructor.Field(NPCType::class, 11) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class contrast : OrderMapper.InConstructor.Field(NPCType::class, 12) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }
}