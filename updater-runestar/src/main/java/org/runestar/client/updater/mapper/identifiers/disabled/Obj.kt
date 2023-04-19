package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Type.INT_TYPE

@DependsOn(Entity::class)
class Obj : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Entity>() }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }

//    @MethodParameters
//    @DependsOn(Entity.getModel::class)
//    class getModel : InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<Entity.getModel>().mark }
//    }
//
//    @DependsOn(getModel::class)
//    class id : OrderMapper.InMethod.Field(getModel::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
//    }
//
//    @DependsOn(getModel::class)
//    class quantity : OrderMapper.InMethod.Field(getModel::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
//    }
}