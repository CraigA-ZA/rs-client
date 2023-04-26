package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.mark
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE
import org.runestar.client.common.startsWith

class Coord : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { it.instanceMethods.any { it.mark == Any::hashCode.mark } }

//    @MethodParameters()
//    class packed : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
//                .and { it.instructions.any { it.opcode == Opcodes.IOR } }
//    }

    @DependsOn(toString0::class)
    class y : OrderMapper.InMethod.Field(toString0::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(toString0::class)
    class x : OrderMapper.InMethod.Field(toString0::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(toString0::class)
    class z : OrderMapper.InMethod.Field(toString0::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters("separator")
    class toString0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == String::class.type }
                .and { it.arguments == listOf(String::class.type) }
    }

    @MethodParameters("other")
    class equals0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.arguments == listOf(type<Coord>()) }
    }


}