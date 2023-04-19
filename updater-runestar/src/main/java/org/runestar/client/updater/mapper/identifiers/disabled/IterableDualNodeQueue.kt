package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.DualNode
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(DualNode::class)
class IterableDualNodeQueue : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.contains(Iterable::class.type) }
            .and { it.instanceFields.size >= 1 }
            .and { it.instanceFields.all { it.type == type<DualNode>() } }

//    class sentinel : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { Modifier.isPublic(it.access) }
//    }
//
//    class head : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { !Modifier.isPublic(it.access) }
//    }
//
//    @MethodParameters()
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.opcode == GOTO } }
//    }
//
//    class add : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.none { it.opcode == GOTO } }
//    }
}