package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.PcmStream
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(PcmStream::class)
class PcmStreamMixer : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<PcmStream>() }
            .and { it.instanceFields.size == 4 }

//    @MethodParameters()
//    @DependsOn(NodeDeque.last::class)
//    class firstSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<PcmStream>() }
//                .and { it.arguments.isEmpty() }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<NodeDeque.last>().id } }
//    }
//
//    @MethodParameters()
//    @DependsOn(NodeDeque.previous::class)
//    class nextSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<PcmStream>() }
//                .and { it.arguments.isEmpty() }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<NodeDeque.previous>().id } }
//    }
//
//    @DependsOn(firstSubStream::class, NodeDeque::class)
//    class subStreams : UniqueMapper.InMethod.Field(firstSubStream::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == type<NodeDeque>() }
//    }
//
//    @MethodParameters("subStream")
//    @DependsOn(PcmStream::class, Node.remove::class)
//    class removeSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(type<PcmStream>()) }
//                .and { it.instructions.any { it.isMethod && it.methodMark == method<Node.remove>().mark } }
//    }
//
//    @MethodParameters("subStream")
//    @DependsOn(PcmStream::class, Node.remove::class)
//    class addSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(type<PcmStream>()) }
//                .and { it.instructions.none { it.isMethod && it.methodMark == method<Node.remove>().mark } }
//    }
//
//    @MethodParameters("buffer", "start", "end")
//    class updateSubStreams : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(IntArray::class.type, INT_TYPE, INT_TYPE) }
//                .and { !Modifier.isFinal(it.access) }
//    }
//
//    @MethodParameters("length")
//    class skipSubStreams : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(INT_TYPE) }
//                .and { !Modifier.isFinal(it.access) }
//    }
}