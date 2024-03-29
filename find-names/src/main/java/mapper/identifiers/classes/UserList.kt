package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.*
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith
import java.lang.reflect.Modifier

@DependsOn(User::class)
class UserList : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<User>().withDimensions(1) } }

    @MethodParameters()
    class newInstance : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { Modifier.isAbstract(it.access) }
                .and { it.returnType == type<User>() }
    }

    @MethodParameters("size")
    class newTypedArray : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { Modifier.isAbstract(it.access) }
                .and { it.returnType == type<User>().withDimensions(1) }
    }

    class array : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<User>().withDimensions(1) }
    }

    class comparator : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Comparator::class.type }
    }

    @MethodParameters()
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.instructions.any { it.isMethod && it.methodId == HashMap<*, *>::clear.id } }
    }

    class size0 : OrderMapper.InConstructor.Field(UserList::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class capacity : OrderMapper.InConstructor.Field(UserList::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters("index")
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<User>() }
                .and { it.instructions.any { it.opcode == NEW && it.typeType == ArrayIndexOutOfBoundsException::class.type } }
    }

    @MethodParameters()
    class sort : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE && it.instructions.any { it.isMethod && it.methodName == "sort" } }
    }

    class usernamesMap : OrderMapper.InConstructor.Field(UserList::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == HashMap::class.type }
    }

    class previousUsernamesMap : OrderMapper.InConstructor.Field(UserList::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == HashMap::class.type }
    }

    @MethodParameters("user")
    class mapRemove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<User>()) }
                .and { it.instructions.any { it.isMethod && it.methodName == "remove" } }
    }

    @MethodParameters("user")
    class mapPut : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<User>()) }
                .and { it.instructions.any { it.isMethod && it.methodName == "put" } }
    }

    @MethodParameters("username")
    class contains : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<Username>()) }
                .and { it.instructions.any { it.isMethod && it.methodName == "containsKey" } }
    }

    @MethodParameters()
    @DependsOn(capacity::class)
    class isFull : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.isField && it.fieldId == field<capacity>().id } }
    }

    @MethodParameters()
    class size : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.none { it.opcode == IINC } }
    }

    @MethodParameters("user", "username", "previousUsername")
    class changeName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 3..4 }
                .and { it.arguments.startsWith(type<User>(), type<Username>(), type<Username>()) }
    }

    @MethodParameters("user")
    class indexOf : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<User>()) }
                .and { it.instructions.any { it.opcode == ICONST_M1 } }
    }

    @MethodParameters("username")
    @DependsOn(usernamesMap::class)
    class getByCurrentUsername : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<User>() }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<Username>()) }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<usernamesMap>().id } }
    }

    @MethodParameters("previousUsername")
    @DependsOn(previousUsernamesMap::class)
    class getByPreviousUsername : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<User>() }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<Username>()) }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<previousUsernamesMap>().id } }
    }

    @MethodParameters("username")
    @DependsOn(getByPreviousUsername::class)
    class getByUsername : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<User>() }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<Username>()) }
                .and { it.instructions.any { it.isMethod && it.methodId == method<getByPreviousUsername>().id } }
    }

    @MethodParameters("user")
    class arrayAddLast : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<User>()) }
                .and { it.instructions.none { it.isMethod } }
    }

    @MethodParameters("username", "previousUsername")
    class addLast : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<User>() }
                .and { it.arguments.size in 2..3 }
                .and { it.instructions.any { it.opcode == NEW && it.typeType == IllegalStateException::class.type } }
    }

    @MethodParameters("username")
    @DependsOn(addLast::class)
    class addLastNoPreviousUsername : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<User>() }
                .and { it.arguments.size in 1..2 }
                .and { it.instructions.any { it.isMethod && it.methodId == method<addLast>().id } }
    }

    @MethodParameters("index")
    class arrayRemove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.instructions.any { it.isMethod && it.methodName == "arraycopy" } }
    }

    @MethodParameters("user")
    @DependsOn(arrayRemove::class)
    class remove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.instructions.any { it.isMethod && it.methodId == method<arrayRemove>().id } }
    }

    @MethodParameters("username")
    @DependsOn(remove::class)
    class removeByUsername : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.instructions.any { it.isMethod && it.methodId == method<remove>().id } }
    }

    @MethodParameters()
    @DependsOn(comparator::class)
    class removeComparator : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { !it.arguments.startsWith(Comparator::class.type) }
                .and { it.instructions.any { it.opcode == PUTFIELD && it.fieldId == field<comparator>().id } }
    }

    @MethodParameters("c")
    @DependsOn(comparator::class)
    class addComparator : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(Comparator::class.type) }
    }
}