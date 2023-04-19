package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Entity
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Entity::class)
class FloorDecoration : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 4 }

//    @DependsOn(Entity::class)
//    class entity : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Entity>() }
//    }
//
//    @DependsOn(Scene.newFloorDecoration::class)
//    class x : MethodPutField(Scene.newFloorDecoration::class, 0, INT_TYPE)
//
//    @DependsOn(Scene.newFloorDecoration::class)
//    class y : MethodPutField(Scene.newFloorDecoration::class, 1, INT_TYPE)
//
//    @DependsOn(Scene.newFloorDecoration::class)
//    class tileHeight : MethodPutField(Scene.newFloorDecoration::class, 2, INT_TYPE)
//
//    @DependsOn(Scene.newFloorDecoration::class)
//    class tag : MethodPutField(Scene.newFloorDecoration::class, 0, LONG_TYPE)
//
//    @DependsOn(Scene.newFloorDecoration::class)
//    class flags : MethodPutField(Scene.newFloorDecoration::class, 3, INT_TYPE)
}