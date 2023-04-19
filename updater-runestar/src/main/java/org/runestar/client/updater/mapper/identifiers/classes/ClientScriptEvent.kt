package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.UniqueMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(Component::class, Node::class)
class ClientScriptEvent : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == type<Component>() } == 2 }

    class opbase : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == String::class.type }
    }

    class boolean1 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BOOLEAN_TYPE }
    }

    class args0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Any::class.type.withDimensions(1) }
    }

    //TODO
//    class component : ScriptEventFieldConst(-2147483645)
//    class dragTarget : ScriptEventFieldConst(-2147483642)
//    class opIndex : ScriptEventFieldConst(-2147483644)
//    class keyPressed : ScriptEventFieldConst(-2147483640)
//    class keyTyped : ScriptEventFieldConst(-2147483639)
//    class mouseX : ScriptEventFieldConst(-2147483647)
//    class mouseY : ScriptEventFieldConst(-2147483646)

    @MethodParameters("type")
    class setType : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
    }

    @DependsOn(setType::class)
    class type0 : UniqueMapper.InMethod.Field(setType::class) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

    @MethodParameters("args")
    class setArgs : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Any::class.type.withDimensions(1)) }
    }
}