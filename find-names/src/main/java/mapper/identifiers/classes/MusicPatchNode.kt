package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2

@DependsOn(Node::class, MusicPatch::class)
class MusicPatchNode : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<MusicPatch>() } }

    @DependsOn(MusicPatch::class)
    class patch : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<MusicPatch>() }
    }

    @DependsOn(RawPcmStream::class)
    class stream : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<RawPcmStream>() }
    }

    @DependsOn(RawSound::class)
    class rawSound : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<RawSound>() }
    }
}