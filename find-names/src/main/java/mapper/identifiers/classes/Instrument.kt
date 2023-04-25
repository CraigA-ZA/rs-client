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
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(SoundEnvelope::class)
class Instrument : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<SoundEnvelope>() } >= 6 }

    class oscillatorVolume : OrderMapper.InConstructor.Field(Instrument::class, 0, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class oscillatorPitch : OrderMapper.InConstructor.Field(Instrument::class, 1, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class oscillatorDelays : OrderMapper.InConstructor.Field(Instrument::class, 2, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class delayTime : OrderMapper.InConstructor.Field(Instrument::class, 0, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class delayDecay : OrderMapper.InConstructor.Field(Instrument::class, 1, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class duration : OrderMapper.InConstructor.Field(Instrument::class, 2, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class offset : OrderMapper.InConstructor.Field(Instrument::class, 3, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(type<Packet>()) }
    }

    class synthesize : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == IntArray::class.type }
    }

    class evaluateWave : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
    }

    @DependsOn(AudioFilter::class)
    class filter : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<AudioFilter>() }
    }
}