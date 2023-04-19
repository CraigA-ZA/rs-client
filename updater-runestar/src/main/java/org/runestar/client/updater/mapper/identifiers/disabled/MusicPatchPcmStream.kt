package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(PcmStream::class)
class MusicPatchPcmStream : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<PcmStream>() }
            .and { it.instanceFields.size == 3 }

//    @DependsOn(NodeDeque::class)
//    class queue : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<NodeDeque>() }
//    }
//
//    @DependsOn(PcmStreamMixer::class)
//    class mixer : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<PcmStreamMixer>() }
//    }
//
//    @DependsOn(MidiPcmStream::class)
//    class superStream : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<MidiPcmStream>() }
//    }
}