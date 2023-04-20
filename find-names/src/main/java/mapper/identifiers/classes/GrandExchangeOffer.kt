package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.BYTE_TYPE
import org.objectweb.asm.Type.INT_TYPE

class GrandExchangeOffer : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == BYTE_TYPE } == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 5 }

    class state : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BYTE_TYPE }
    }

    class id : OrderMapper.InConstructor.Field(GrandExchangeOffer::class, 0) {
        override val constructorPredicate = predicateOf<Method2> { it.arguments.isNotEmpty() }
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class unitPrice : OrderMapper.InConstructor.Field(GrandExchangeOffer::class, 1) {
        override val constructorPredicate = predicateOf<Method2> { it.arguments.isNotEmpty() }
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class totalQuantity : OrderMapper.InConstructor.Field(GrandExchangeOffer::class, 2) {
        override val constructorPredicate = predicateOf<Method2> { it.arguments.isNotEmpty() }
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class currentQuantity : OrderMapper.InConstructor.Field(GrandExchangeOffer::class, 3) {
        override val constructorPredicate = predicateOf<Method2> { it.arguments.isNotEmpty() }
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class currentPrice : OrderMapper.InConstructor.Field(GrandExchangeOffer::class, 4) {
        override val constructorPredicate = predicateOf<Method2> { it.arguments.isNotEmpty() }
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters()
    class type : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
                .and { it.instructions.count { it.opcode == Opcodes.BIPUSH && it.intOperand == 8 } == 2 }
    }

    @MethodParameters()
    class status : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
                .and { it.instructions.count { it.opcode == Opcodes.BIPUSH && it.intOperand == 7 } == 1 }
                .and { it.instructions.filter { it.opcode == Opcodes.BIPUSH }.all { it.intOperand == 7 } }
    }
}