package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.Predicate
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

class Username : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.interfaces.contains(Comparable::class.type) }
            .and { it.instanceFields.count() == 2 }
            .and { it.instanceFields.count { it.type == String::class.type } == 2 }

    class name0 : OrderMapper.InConstructor.Field(Username::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size > 1 }
    }

    class cleanName0 : OrderMapper.InConstructor.Field(Username::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size > 1 }
    }

    @MethodParameters()
    @DependsOn(name0::class)
    class name : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == String::class.type }
                .and { it.name == field<name0>().name }
    }

    @MethodParameters()
    @DependsOn(cleanName0::class)
    class cleanName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == String::class.type }
                .and { it.name == field<cleanName0>().name }
    }

    @MethodParameters("other")
    class compareTo0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.startsWith(type<Username>()) }
    }

    @MethodParameters()
    class hasCleanName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.name != "equals" }
    }
}