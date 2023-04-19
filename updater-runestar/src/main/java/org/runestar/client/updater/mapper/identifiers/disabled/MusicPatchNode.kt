package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Node
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Node::class, MusicPatch::class)
class MusicPatchNode : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<MusicPatch>() } }

//    @DependsOn(MusicPatch::class)
//    class patch : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<MusicPatch>() }
//    }
//
//    @DependsOn(RawPcmStream::class)
//    class stream : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<RawPcmStream>() }
//    }
//
//    @DependsOn(RawSound::class)
//    class rawSound : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<RawSound>() }
//    }
}