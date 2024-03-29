package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(Headbar.type::class)
class HeadbarType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.type == field<Headbar.type>().type }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == BIPUSH && it.intOperand == 6 } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == BIPUSH && it.intOperand == 6 } }
    }

    class int1 : OrderMapper.InConstructor.Field(HeadbarType::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class int2 : OrderMapper.InConstructor.Field(HeadbarType::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class int3 : OrderMapper.InConstructor.Field(HeadbarType::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class int4 : OrderMapper.InConstructor.Field(HeadbarType::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class int5 : OrderMapper.InConstructor.Field(HeadbarType::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class spritefront : OrderMapper.InConstructor.Field(HeadbarType::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class spriteback : OrderMapper.InConstructor.Field(HeadbarType::class, 6) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class width : OrderMapper.InConstructor.Field(HeadbarType::class, 7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class widthPadding : OrderMapper.InConstructor.Field(HeadbarType::class, 8) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(Sprite::class, spritefront::class)
    class getFrontSprite : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Sprite>() }
                .and { it.instructions.any { it.isField && it.fieldId == field<spritefront>().id } }
    }

    @MethodParameters()
    @DependsOn(Sprite::class, spriteback::class)
    class getBackSprite : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Sprite>() }
                .and { it.instructions.any { it.isField && it.fieldId == field<spriteback>().id } }
    }
}