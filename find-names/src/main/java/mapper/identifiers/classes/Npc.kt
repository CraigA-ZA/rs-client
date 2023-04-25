package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(Actor::class)
class Npc : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Actor>() }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } < 10 }

    @MethodParameters
    @DependsOn(Actor.isVisible::class)
    class isVisible : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Actor.isVisible>().mark }
    }

    //TODO
    @DependsOn(Npc.isVisible::class)
    class type : OrderMapper.InMethod.Field(Npc.isVisible::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.GETFIELD}
    }

    @MethodParameters
    @DependsOn(Entity.getModel::class)
    class getModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Entity.getModel>().mark }
    }
}