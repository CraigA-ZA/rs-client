package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.DualNode
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(DualNode::class, IterableNodeHashTable::class)
class StructType : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == type<IterableNodeHashTable>() } }

//    @DependsOn(IterableNodeHashTable::class)
//    class params : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeHashTable>() }
//    }
//
//    @MethodParameters()
//    class postDecode : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.isEmpty() }
//    }
//
//    @DependsOn(Packet::class)
//    class decode : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.none { it.opcode == PUTFIELD } }
//    }
//
//    @DependsOn(Packet::class)
//    class decode0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.any { it.opcode == PUTFIELD } }
//    }
//
//    class getIntParam : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//    }
//
//    class getStringParam : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
//    }
}