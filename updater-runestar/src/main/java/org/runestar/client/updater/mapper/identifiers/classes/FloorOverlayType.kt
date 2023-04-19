package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(DualNode::class)
class FloorOverlayType : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 9 }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 1 }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == Opcodes.BIPUSH && it.intOperand == 8 } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == Opcodes.BIPUSH && it.intOperand == 8 } }
    }

    //TODO
//    @MethodParameters
//    class postDecode : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.size in 0..1 }
//                .and { it.instructions.count { it.isMethod } == 2 }
//    }

    class texture : OrderMapper.InConstructor.Field(FloorOverlayType::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters("rgb")
    class setHsl : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(INT_TYPE) }
    }

    @DependsOn(setHsl::class)
    class hue : OrderMapper.InMethod.Field(setHsl::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

    @DependsOn(setHsl::class)
    class saturation : OrderMapper.InMethod.Field(setHsl::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

    @DependsOn(setHsl::class)
    class lightness : OrderMapper.InMethod.Field(setHsl::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

    class rgb : OrderMapper.InConstructor.Field(FloorOverlayType::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

    class rgb2 : OrderMapper.InConstructor.Field(FloorOverlayType::class, -1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

//    @DependsOn(postDecode::class)
//    class hue2 : OrderMapper.InMethod.Field(postDecode::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
//    }
//
//    @DependsOn(postDecode::class)
//    class saturation2 : OrderMapper.InMethod.Field(postDecode::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
//    }
//
//    @DependsOn(postDecode::class)
//    class lightness2 : OrderMapper.InMethod.Field(postDecode::class, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
//    }
}