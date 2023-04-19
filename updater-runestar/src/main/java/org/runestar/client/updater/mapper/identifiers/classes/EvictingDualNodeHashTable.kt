package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(IterableDualNodeQueue::class, DualNode::class, IterableNodeHashTable::class)
class EvictingDualNodeHashTable : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<DualNode>() } == 1 }
            .and { it.instanceFields.count { it.type == type<IterableDualNodeQueue>() } == 1 }
            .and { it.instanceFields.count { it.type == type<IterableNodeHashTable>() } == 1 }

    @DependsOn(IterableNodeHashTable::class)
    class hashTable : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeHashTable>() }
    }

    @DependsOn(IterableDualNodeQueue::class)
    class deque : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<IterableDualNodeQueue>() }
    }

    @MethodParameters()
    @DependsOn(IterableNodeHashTable::class, IterableNodeHashTable.clear::class)
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == method<IterableNodeHashTable.clear>().id } }
    }


    @MethodParameters("value", "key")
    @DependsOn(DualNode::class)
    class put : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<DualNode>(), Type.LONG_TYPE) }
    }

    @MethodParameters("key")
    class remove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.LONG_TYPE) }
    }

    @MethodParameters("key")
    @DependsOn(DualNode::class)
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<DualNode>() }
                .and { it.arguments.startsWith(Type.LONG_TYPE) }
    }

    @DependsOn(clear::class)
    class capacity : OrderMapper.InMethod.Field(clear::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }

    @DependsOn(clear::class)
    class remainingCapacity : OrderMapper.InMethod.Field(clear::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }
}