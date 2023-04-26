package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE

@DependsOn(DualNode::class)
class VarBitType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }

    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GOTO } }
                .and {it.arguments.count()  == 1}
    }

    class decodeNext : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GOTO } }
                .and {it.arguments.count()  == 2}
    }



    @DependsOn(decodeNext::class)
    class baseVar : OrderMapper.InMethod.Field(decodeNext::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(decodeNext::class)
    class startBit : OrderMapper.InMethod.Field(decodeNext::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(decodeNext::class)
    class endBit : OrderMapper.InMethod.Field(decodeNext::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }
}