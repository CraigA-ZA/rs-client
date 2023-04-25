package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.identifiers.MethodPutField
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.LONG_TYPE

@DependsOn(Entity::class)
class FloorDecoration : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 4 }

    @DependsOn(Entity::class)
    class entity : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Entity>() }
    }

    @DependsOn(Scene.newFloorDecoration::class)
    class x : MethodPutField(Scene.newFloorDecoration::class, 0, INT_TYPE)

    @DependsOn(Scene.newFloorDecoration::class)
    class y : MethodPutField(Scene.newFloorDecoration::class, 1, INT_TYPE)

    @DependsOn(Scene.newFloorDecoration::class)
    class tileHeight : MethodPutField(Scene.newFloorDecoration::class, 2, INT_TYPE)

    @DependsOn(Scene.newFloorDecoration::class)
    class tag : MethodPutField(Scene.newFloorDecoration::class, 0, LONG_TYPE)

    @DependsOn(Scene.newFloorDecoration::class)
    class flags : MethodPutField(Scene.newFloorDecoration::class, 3, INT_TYPE)
}