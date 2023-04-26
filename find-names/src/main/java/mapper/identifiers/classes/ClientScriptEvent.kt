package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.identifiers.ScriptEventFieldConst
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(Component::class, Node::class)
class ClientScriptEvent : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.interfaces.isEmpty() }
            .and { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == type<Component>() } == 2 }

    class opbase : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }

    class boolean1 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Type.BOOLEAN_TYPE }
    }

    class args0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Any::class.type.withDimensions(1) }
    }

    class component : ScriptEventFieldConst(-2147483645)
    class dragTarget : ScriptEventFieldConst(-2147483642)
    class opIndex : ScriptEventFieldConst(-2147483644)
    class keyPressed : ScriptEventFieldConst(-2147483640)
    class keyTyped : ScriptEventFieldConst(-2147483639)
    class mouseX : ScriptEventFieldConst(-2147483647)
    class mouseY : ScriptEventFieldConst(-2147483646)

    @MethodParameters("type")
    class setType : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
    }

    @DependsOn(setType::class)
    class type0 : UniqueMapper.InMethod.Field(setType::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD }
    }

    @MethodParameters("args")
    class setArgs : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Any::class.type.withDimensions(1)) }
    }
}