package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(IterableNodeHashTable::class, IterableDualNodeQueue::class, DualNode::class)
class DemotingHashTable : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<IterableNodeHashTable>() } == 1 }
            .and { it.instanceFields.count { it.type == type<IterableDualNodeQueue>() } == 1 }
            .and { it.instanceFields.none { it.type == type<DualNode>() } }

    class hashTable : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeHashTable>() }
    }

    class queue : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<IterableDualNodeQueue>() }
    }

    //TODO
//    @MethodParameters()
//    @DependsOn(IterableDualNodeQueue.clear::class)
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<IterableDualNodeQueue.clear>().id } }
//    }

//    class capacity : OrderMapper.InConstructor.Field(DemotingHashTable::class, 0, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }

//    class remaining : OrderMapper.InConstructor.Field(DemotingHashTable::class, 1, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
//    }

    @MethodParameters("key")
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Any::class.type }
    }

    @MethodParameters("key")
    class remove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Type.LONG_TYPE) }
    }

    @MethodParameters("wrapper")
    @DependsOn(Wrapper::class)
    class removeWrapper : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(type<Wrapper>()) }
    }

    @MethodParameters("value", "key")
    class put1 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size in 2..3 }
                .and { it.arguments.startsWith(Any::class.type, Type.LONG_TYPE) }
                .and { it.instructions.count { it.isMethod } == 1 }
    }

    @MethodParameters("value", "key", "size")
    class put : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Any::class.type, Type.LONG_TYPE, Type.INT_TYPE) }
                .and { it.instructions.count { it.isMethod } > 1 }
    }

    @MethodParameters("softeningLevel")
    class demote : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
                .and { it.instructions.any { it.opcode == Opcodes.LADD } }
    }
}