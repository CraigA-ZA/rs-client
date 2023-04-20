package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.Class2
import mapper.wrappers.Field2

@DependsOn(PcmPlayer::class)
class SoundSystem : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(Runnable::class.type) }
            .and { it.instanceFields.any { it.type == type<PcmPlayer>().withDimensions(1) } }

    class players : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<PcmPlayer>().withDimensions(1) }
    }
}