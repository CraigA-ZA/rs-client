package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Entity::class)
class Wall : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 6 }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 2 }
            .and { it.instanceFields.size == 9 }
            .and { it.instanceMethods.isEmpty() }

//    @DependsOn(Scene.newWall::class)
//    class tag : MethodPutField(Scene.newWall::class, 0, LONG_TYPE)
//
//    @DependsOn(Scene.newWall::class)
//    class flags : MethodPutField(Scene.newWall::class, 0, INT_TYPE)
//
//    @DependsOn(Scene.newWall::class)
//    class x : MethodPutField(Scene.newWall::class, 1, INT_TYPE)
//
//    @DependsOn(Scene.newWall::class)
//    class y : MethodPutField(Scene.newWall::class, 2, INT_TYPE)
//
//    @DependsOn(Scene.newWall::class)
//    class tileHeight : MethodPutField(Scene.newWall::class, 3, INT_TYPE)
//
//    @DependsOn(Scene.newWall::class, Entity::class)
//    class entity1 : OrderMapper.InMethod.Field(Scene.newWall::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<Entity>() }
//    }
//
//    @DependsOn(Scene.newWall::class, Entity::class)
//    class entity2 : OrderMapper.InMethod.Field(Scene.newWall::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<Entity>() }
//    }
//
//    @DependsOn(Scene.newWall::class)
//    class orientationA : MethodPutField(Scene.newWall::class, 4, INT_TYPE)
//
//    @DependsOn(Scene.newWall::class)
//    class orientationB : MethodPutField(Scene.newWall::class, 5, INT_TYPE)
}