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
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import java.lang.reflect.Modifier

@DependsOn(UserList::class, ClanMate::class)
class ClanChat : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<UserList>() }
            .and { it.instanceMethods.flatMap { it.instructions.toList() }.any { it.opcode == NEW && it.typeType == type<ClanMate>() } }

    @DependsOn(UserList.newInstance::class)
    class newInstance : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<UserList.newInstance>().mark }
    }

    @DependsOn(UserList.newTypedArray::class)
    class newTypedArray : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<UserList.newTypedArray>().mark }
    }

    @DependsOn(LoginType::class)
    class loginType : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<LoginType>() }
    }

    class minKick : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Type.BYTE_TYPE }
    }

    class name : OrderMapper.InConstructor.Field(ClanChat::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    class owner : OrderMapper.InConstructor.Field(ClanChat::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class readUpdate : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == IINC } }
    }

    @DependsOn(Usernamed::class)
    class localUser : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Usernamed>() }
    }

    class rank : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Type.INT_TYPE && Modifier.isPublic(it.access) }
    }
}