package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

@DependsOn(Actor::class)
class Npc : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Actor>() }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } < 10 }

//    class type : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type in it.jar }
//    }

//    @MethodParameters
//    @DependsOn(Actor.isVisible::class)
//    class isVisible : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<Actor.isVisible>().mark }
//    }
    //TODO

    @MethodParameters
    @DependsOn(Entity.getModel::class)
    class getModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<Entity.getModel>().mark }
    }
}