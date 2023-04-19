package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(PcmPlayer::class)
class SoundSystem : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(Runnable::class.type) }
            .and { it.instanceFields.any { it.type == type<PcmPlayer>().withDimensions(1) } }

    class players : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<PcmPlayer>().withDimensions(1) }
    }
}