package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(WorldMapArea::class)
class WorldMapAreaData : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<WorldMapArea>() }
}