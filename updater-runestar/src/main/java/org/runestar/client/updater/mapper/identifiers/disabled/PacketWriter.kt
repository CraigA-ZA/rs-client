package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.*
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(AbstractSocket::class)
class PacketWriter : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<AbstractSocket>() } }

//    @DependsOn(AbstractSocket::class)
//    class socket0 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<AbstractSocket>() }
//    }
//
//    @MethodParameters()
//    @DependsOn(AbstractSocket::class)
//    class getSocket : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<AbstractSocket>() }
//    }
//
//    @MethodParameters("socket")
//    @DependsOn(AbstractSocket::class)
//    class setSocket : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(type<AbstractSocket>()) }
//    }
//
//    @DependsOn(socket0::class)
//    @MethodParameters()
//    class removeSocket : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.size in 0..1 }
//                .and { it.instructions.any { it.opcode == PUTFIELD && it.fieldId == field<socket0>().id } }
//                .and { it.instructions.any { it.opcode == ACONST_NULL } }
//                .and { it.instructions.none { it.isMethod } }
//    }
//
//    @DependsOn(Packet::class)
//    class packet : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Packet>() }
//    }
//
//    @DependsOn(PacketBit::class)
//    class bit : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<PacketBit>() }
//    }
//
//    @DependsOn(IterableNodeDeque::class)
//    class bitNodes : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeDeque>() }
//    }
//
//    @DependsOn(Isaac::class)
//    class isaac : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Isaac>() }
//    }
//
//    @MethodParameters()
//    @DependsOn(AbstractSocket.close::class)
//    class close : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<AbstractSocket.close>().id } }
//    }
//
//    @DependsOn(ServerProt::class)
//    class serverPacket0 : UniqueMapper.InConstructor.Field(PacketWriter::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<ServerProt>() }
//    }
//
//    class serverPacket0Length : OrderMapper.InConstructor.Field(PacketWriter::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
}