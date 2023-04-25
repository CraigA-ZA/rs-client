package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(Node::class)
class IterableNodeHashTable : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<Node>().withDimensions(1) } == 1 }
            .and { it.instanceFields.count { it.type == type<Node>() } == 2 }
            .and { it.interfaces.contains(Iterable::class.type) }

    @DependsOn(Node::class)
    class buckets : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Node>().withDimensions(1) }
    }

    class index : OrderMapper.InConstructor.Field(IterableNodeHashTable::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class size : OrderMapper.InConstructor.Field(IterableNodeHashTable::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @DependsOn(Node::class)
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Node>() }
                .and { it.arguments.startsWith(Type.LONG_TYPE) }
                .and { it.arguments.size in 1..2 }
    }

    @DependsOn(Node::class)
    class put : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<Node>(), Type.LONG_TYPE) }
                .and { it.arguments.size in 2..3 }
    }

    @DependsOn(Node::class)
    class first : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Node>() }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.none { it.opcode == Opcodes.ISUB } }
    }

    @DependsOn(Node::class, get::class)
    class next : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Node>() }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.opcode == Opcodes.ISUB } }
                .and { it != method<get>() }
    }

    @MethodParameters()
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size in 0..1 }
    }

    @DependsOn(Node::class, next::class)
    class current : OrderMapper.InMethod.Field(next::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.isField && it.fieldType == type<Node>() }
    }

    @DependsOn(current::class, Node::class)
    class currentGet : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Node>() && it != field<current>() }
    }
}