package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*
import java.lang.reflect.Modifier

@DependsOn(PcmStream::class)
class PcmStreamMixer : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<PcmStream>() }
            .and { it.instanceFields.size == 4 }

    @MethodParameters()
    @DependsOn(NodeDeque.last::class)
    class firstSubStream : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<PcmStream>() }
                .and { it.arguments.isEmpty() }
                .and { it.instructions.any { it.isMethod && it.methodId == method<NodeDeque.last>().id } }
    }

    @MethodParameters()
    @DependsOn(NodeDeque.previous::class)
    class nextSubStream : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<PcmStream>() }
                .and { it.arguments.isEmpty() }
                .and { it.instructions.any { it.isMethod && it.methodId == method<NodeDeque.previous>().id } }
    }

    @DependsOn(firstSubStream::class, NodeDeque::class)
    class subStreams : UniqueMapper.InMethod.Field(firstSubStream::class) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == type<NodeDeque>() }
    }

    @MethodParameters("subStream")
    @DependsOn(PcmStream::class, Node.remove::class)
    class removeSubStream : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(type<PcmStream>()) }
                .and { it.instructions.any { it.isMethod && it.methodMark == method<Node.remove>().mark } }
    }

    @MethodParameters("subStream")
    @DependsOn(PcmStream::class, Node.remove::class)
    class addSubStream : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(type<PcmStream>()) }
                .and { it.instructions.none { it.isMethod && it.methodMark == method<Node.remove>().mark } }
    }

    @MethodParameters("buffer", "start", "end")
    class updateSubStreams : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(IntArray::class.type, INT_TYPE, INT_TYPE) }
                .and { !Modifier.isFinal(it.access) }
    }

    @MethodParameters("length")
    class skipSubStreams : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(INT_TYPE) }
                .and { !Modifier.isFinal(it.access) }
    }
}