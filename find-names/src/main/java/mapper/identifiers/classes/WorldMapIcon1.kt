package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper

@DependsOn(AbstractWorldMapIcon::class)
class WorldMapIcon1 : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<AbstractWorldMapIcon>() }
            .and { it.instanceFields.size == 4 }

    @DependsOn(WorldMapLabel::class)
    class label0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<WorldMapLabel>() }
    }
}