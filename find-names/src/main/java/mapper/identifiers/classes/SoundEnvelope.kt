package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

class SoundEnvelope : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 9 }
            .and { it.instanceFields.size == 11 }

    class segments : OrderMapper.InConstructor.Field(SoundEnvelope::class, 0, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class durations : OrderMapper.InConstructor.Field(SoundEnvelope::class, 0, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE.withDimensions(1) }
    }

    class phases : OrderMapper.InConstructor.Field(SoundEnvelope::class, 1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE.withDimensions(1) }
    }

    @MethodParameters()
    @DependsOn(Packet::class)
    class reset : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.size in 0..1 }
                .and { it.returnType == VOID_TYPE }
                .and { !it.arguments.startsWith(type<Packet>()) }
    }

    @MethodParameters("n")
    class doStep : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(INT_TYPE) }
    }

    @DependsOn(Packet::class)
    @MethodParameters("packet")
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == Opcodes.NEWARRAY } }
    }

    @DependsOn(Packet::class)
    @MethodParameters("packet")
    class decodeSegments : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == Opcodes.NEWARRAY } }
    }

    @DependsOn(decode::class)
    class form : OrderMapper.InMethod.Field(decode::class, 0, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(decode::class)
    class start : OrderMapper.InMethod.Field(decode::class, 1, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(decode::class)
    class end : OrderMapper.InMethod.Field(decode::class, 2, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(reset::class)
    class ticks : OrderMapper.InMethod.Field(reset::class, 0, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(reset::class)
    class phaseIndex : OrderMapper.InMethod.Field(reset::class, 1, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(reset::class)
    class step : OrderMapper.InMethod.Field(reset::class, 2, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(reset::class)
    class amplitude : OrderMapper.InMethod.Field(reset::class, 3, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(reset::class)
    class max : OrderMapper.InMethod.Field(reset::class, 4, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }
}