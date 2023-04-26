package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(Node::class)
class IterableNodeDeque : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.contains(Iterable::class.type) }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.all { it.type == type<Node>() } }
    @DependsOn(Node::class)
    class sentinel : OrderMapper.InConstructor.Field(IterableNodeDeque::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.isField && it.fieldType == type<Node>() }
    }

    @DependsOn(Node::class, sentinel::class)
    class current : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Node>() && it != field<sentinel>() }
    }

    @MethodParameters("node")
    @DependsOn(Node::class, Node.next::class)
    class addFirst : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<Node>()) }
                .and { it.instructions.count { it.isField && it.fieldId == field<Node.next>().id } == 5 }
    }

    @MethodParameters("node")
    @DependsOn(Node::class, Node.next::class)
    class addLast : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<Node>()) }
                .and { it.instructions.count { it.isField && it.fieldId == field<Node.next>().id } == 4 }
    }

    @MethodParameters("node")
    @DependsOn(Node::class, Node.next::class)
    class previousOrLast : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Node>() }
                .and { it.arguments.startsWith(type<Node>()) }
    }

    @MethodParameters
    @DependsOn(Node::class, previousOrLast::class)
    class last : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Node>() }
                .and { it.instructions.any { it.isMethod && it.methodId == method<previousOrLast>().id } }
    }

    @MethodParameters
    @DependsOn(Node::class, previousOrLast::class, last::class, Node.remove::class)
    class previous : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Node>() }
                .and { it.instructions.none { it.isMethod && it.methodId == method<Node.remove>().id } }
                .and { it != method<previousOrLast>() }
                .and { it != method<last>() }
    }

    @MethodParameters()
    class clear0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.opcode == Opcodes.IF_ACMPEQ } }
    }
}