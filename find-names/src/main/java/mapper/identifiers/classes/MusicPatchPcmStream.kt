package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper

@DependsOn(PcmStream::class)
class MusicPatchPcmStream : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<PcmStream>() }
            .and { it.instanceFields.size == 3 }

    @DependsOn(NodeDeque::class)
    class queue : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<NodeDeque>() }
    }

    @DependsOn(PcmStreamMixer::class)
    class mixer : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<PcmStreamMixer>() }
    }

    @DependsOn(MidiPcmStream::class)
    class superStream : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<MidiPcmStream>() }
    }
}