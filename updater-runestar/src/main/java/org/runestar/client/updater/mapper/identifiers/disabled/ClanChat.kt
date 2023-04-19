package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Opcodes.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.ClanMate
import org.runestar.client.updater.mapper.identifiers.classes.UserList
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(UserList::class, ClanMate::class)
class ClanChat : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<UserList>() }
            .and { it.instanceMethods.flatMap { it.instructions.toList() }.any { it.opcode == NEW && it.typeType == type<ClanMate>() } }

//    @DependsOn(UserList.newInstance::class)
//    class newInstance : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<UserList.newInstance>().mark }
//    }
//
//    @DependsOn(UserList.newTypedArray::class)
//    class newTypedArray : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<UserList.newTypedArray>().mark }
//    }
//
//    @DependsOn(LoginType::class)
//    class loginType : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<LoginType>() }
//    }
//
//    class minKick : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == BYTE_TYPE }
//    }
//
//    class name : OrderMapper.InConstructor.Field(ClanChat::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
//    }
//
//    class owner : OrderMapper.InConstructor.Field(ClanChat::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
//    }
//
//    @MethodParameters("packet")
//    @DependsOn(Packet::class)
//    class readUpdate : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.any { it.opcode == IINC } }
//    }
//
//    @DependsOn(Usernamed::class)
//    class localUser : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Usernamed>() }
//    }
//
//    class rank : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE && Modifier.isPublic(it.access) }
//    }

//    @MethodParameters()
//    @DependsOn(ClanMate.clearIsFriend::class)
//    class clearFriends : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE && it.arguments.isEmpty() }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<ClanMate.clearIsFriend>().id } }
//    }
//
//    @MethodParameters()
//    @DependsOn(ClanMate.clearIsIgnored::class)
//    class clearIgnoreds : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE && it.arguments.isEmpty() }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<ClanMate.clearIsIgnored>().id } }
//    }
}