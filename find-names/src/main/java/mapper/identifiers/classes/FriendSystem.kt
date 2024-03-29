package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(LoginType::class)
class FriendSystem : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<LoginType>() } }

    class loginType : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<LoginType>() }
    }

    @DependsOn(FriendsList::class)
    class friendsList : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<FriendsList>() }
    }

    @DependsOn(IgnoreList::class)
    class ignoreList : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<IgnoreList>() }
    }

    @MethodParameters()
    @DependsOn(UserList.clear::class, FriendsList::class)
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodOwner == type<FriendsList>() && it.methodType == method<UserList.clear>().type } }
    }

    @DependsOn(ignoreList::class)
    @MethodParameters("name")
    class removeIgnore : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(String::class.type) }
                .and { it.instructions.any { it.isField && it.fieldId == field<ignoreList>().id } }
    }

    @DependsOn(friendsList::class)
    @MethodParameters("name")
    class removeFriend : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(String::class.type) }
                .and { it.instructions.any { it.isField && it.fieldId == field<friendsList>().id } }
    }
}