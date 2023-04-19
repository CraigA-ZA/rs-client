package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(Username::class)
class User : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(Comparable::class.type) }
            .and { it.instanceFields.count() == 2 }
            .and { it.instanceFields.count { it.type == type<Username>() } == 2 }

    @MethodParameters("other")
    class compareTo0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.startsWith(type<User>()) }
    }

    @MethodParameters("username", "previousUsername")
    class set : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<Username>(), type<Username>()) }
    }

    @DependsOn(set::class)
    class username0 : OrderMapper.InMethod.Field(set::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Username>() }
    }

    @DependsOn(set::class)
    class previousUsername : OrderMapper.InMethod.Field(set::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Username>() }
    }

    @MethodParameters()
    @DependsOn(username0::class)
    class name : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
                .and { it.instructions.any { it.isField && it.fieldId == field<username0>().id } }
    }

    @MethodParameters()
    @DependsOn(previousUsername::class)
    class previousName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
                .and { it.instructions.any { it.isField && it.fieldId == field<previousUsername>().id } }
    }

    @MethodParameters()
    @DependsOn(Username::class)
    class username : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<Username>() }
    }
}