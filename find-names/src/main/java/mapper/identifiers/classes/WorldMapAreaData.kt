package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

@DependsOn(WorldMapArea::class)
class WorldMapAreaData : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<WorldMapArea>() }
}