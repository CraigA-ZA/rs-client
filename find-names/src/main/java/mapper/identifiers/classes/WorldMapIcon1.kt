package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2

@DependsOn(AbstractWorldMapIcon::class)
class WorldMapIcon1 : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<AbstractWorldMapIcon>() }
            .and { it.instanceFields.size == 4 }

    @DependsOn(WorldMapLabel::class)
    class label0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<WorldMapLabel>() }
    }
}