package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(AbstractWorldMapIcon::class)
class WorldMapIcon1 : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<AbstractWorldMapIcon>() }
            .and { it.instanceFields.size == 4 }

    @DependsOn(WorldMapLabel::class)
    class label0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<WorldMapLabel>() }
    }
}