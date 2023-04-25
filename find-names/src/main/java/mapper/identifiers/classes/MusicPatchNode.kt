package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper

@DependsOn(Node::class, MusicPatch::class)
class MusicPatchNode : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<MusicPatch>() } }

    @DependsOn(MusicPatch::class)
    class patch : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<MusicPatch>() }
    }

    @DependsOn(RawPcmStream::class)
    class stream : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<RawPcmStream>() }
    }

    @DependsOn(RawSound::class)
    class rawSound : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<RawSound>() }
    }
}