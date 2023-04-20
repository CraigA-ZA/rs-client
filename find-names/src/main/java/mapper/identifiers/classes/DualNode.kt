package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(Node::class)
class DualNode : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.size >= 2 }
            .and { c -> c.instanceFields.count { it.type == c.type } == 2 }

    @MethodParameters()
    class removeDual : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
    }

    @DependsOn(removeDual::class)
    class nextDual : OrderMapper.InMethod.Field(removeDual::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD }
    }

    @DependsOn(nextDual::class)
    class previousDual : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.id != field<nextDual>().id }
                .and { it.type == type<DualNode>() }
    }

    class keyDual : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == LONG_TYPE }
    }
}