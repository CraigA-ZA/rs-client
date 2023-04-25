package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE

@DependsOn(Node::class)
class HeadbarUpdate : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { it.instanceFields.size == 4 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }

    class cycle : OrderMapper.InConstructor.Field(HeadbarUpdate::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class health : OrderMapper.InConstructor.Field(HeadbarUpdate::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class health2 : OrderMapper.InConstructor.Field(HeadbarUpdate::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class cycleOffset : OrderMapper.InConstructor.Field(HeadbarUpdate::class, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class set : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
    }
}