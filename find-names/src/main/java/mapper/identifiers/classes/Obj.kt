package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

@DependsOn(Entity::class)
class Obj : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Entity>() }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }

    @MethodParameters
    @DependsOn(Entity.getModel::class)
    class getModel : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Entity.getModel>().mark }
    }

    @DependsOn(getModel::class)
    class id : OrderMapper.InMethod.Field(getModel::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(getModel::class)
    class quantity : OrderMapper.InMethod.Field(getModel::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }
}