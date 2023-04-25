package mapper.identifiers.classes

import mapper.*
import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(DualNode::class)
class FloorUnderlayType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.instanceFields.size == 5 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == PUTFIELD } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == PUTFIELD } }
    }

    class rgb : UniqueMapper.InConstructor.Field(FloorUnderlayType::class) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD }
    }

    //TODO
//    @MethodParameters()
//    class postDecode : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.size in 0..1 }
//                .and { it.instructions.any { it.isMethod } }
//    }

//    @MethodParameters("rgb")
//    @DependsOn(postDecode::class)
//    class setHsl : UniqueMapper.InMethod.Method(postDecode::class) {
//        override val predicate = predicateOf<Instruction2> { it.isMethod }
//    }

//    @DependsOn(setHsl::class)
//    class saturation : OrderMapper.InMethod.Field(setHsl::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD }
//    }
//
//    @DependsOn(setHsl::class)
//    class lightness : OrderMapper.InMethod.Field(setHsl::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD }
//    }
//
//    @DependsOn(setHsl::class)
//    class hue : UniqueMapper.InMethod.Field(setHsl::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == RETURN }
//                .prev { it.opcode == PUTFIELD }
//    }
//
//    @DependsOn(setHsl::class)
//    class hueMultiplier : UniqueMapper.InMethod.Field(setHsl::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == RETURN }
//                .prevWithin(10) { it.opcode == GETFIELD }
//    }
}