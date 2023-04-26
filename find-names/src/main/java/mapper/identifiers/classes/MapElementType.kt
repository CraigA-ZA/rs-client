package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(DualNode::class)
class MapElementType : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.instanceFields.count { it.type == String::class.type } == 2 }

    class iop : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Array<String>::class.type }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == Opcodes.BIPUSH && it.intOperand == 16 } }
    }

    @MethodParameters("packet", "opcode")
    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == Opcodes.BIPUSH && it.intOperand == 16 } }
    }

//    @MethodParameters("id")
//    @DependsOn(Sprite::class)
//    class getSprite0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<Sprite>() }
//                .and { it.arguments.startsWith(INT_TYPE) }
//    }

//    @MethodParameters("b")
//    @DependsOn(Sprite::class)
//    class getSprite : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<Sprite>() }
//                .and { it.arguments.startsWith(BOOLEAN_TYPE) }
//    }

//    @DependsOn(decode0::class)
//    class opbase : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.BIPUSH && it.intOperand == 17 }
//                .nextWithin(7) { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
//    }

//    @DependsOn(decode0::class)
//    class label : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.ICONST_3 }
//                .nextWithin(7) { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
//    }

//    @DependsOn(decode0::class)
//    class labelcolor : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.ICONST_4 }
//                .nextWithin(7) { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
//    }

//    @DependsOn(decode0::class)
//    class name : UniqueMapper.InMethod.Field(decode0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.ICONST_3 }
//                .nextWithin(7) { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
//    }

    class sprite1 : OrderMapper.InConstructor.Field(MapElementType::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class sprite2 : OrderMapper.InConstructor.Field(MapElementType::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class labelsize : OrderMapper.InConstructor.Field(MapElementType::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class category : OrderMapper.InConstructor.Field(MapElementType::class, 7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }
}