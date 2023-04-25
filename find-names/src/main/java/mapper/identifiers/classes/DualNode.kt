package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(Node::class)
class DualNode : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { it.instanceFields.size >= 2 }
            .and { c -> c.instanceFields.count { it.type == c.type } == 2 }

    @MethodParameters()
    class removeDual : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
    }

    @DependsOn(removeDual::class)
    class nextDual : OrderMapper.InMethod.Field(removeDual::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == GETFIELD }
    }

    @DependsOn(nextDual::class)
    class previousDual : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.id != field<nextDual>().id }
                .and { it.type == type<DualNode>() }
    }

    class keyDual : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == LONG_TYPE }
    }
}