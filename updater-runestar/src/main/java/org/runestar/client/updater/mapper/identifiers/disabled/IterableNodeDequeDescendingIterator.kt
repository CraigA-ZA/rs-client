package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Node
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Node::class, IterableNodeDeque::class)
class IterableNodeDequeDescendingIterator : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.contains(Iterator::class.type) }
            .and { it.instanceFields.count { it.type == type<Node>() } == 2 }
            .and { it.instanceFields.count { it.type == type<IterableNodeDeque>() } == 1 }
            .and { it.instanceFields.size == 3 }

//    @DependsOn(IterableNodeDeque::class)
//    class deque : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeDeque>() }
//    }

    // current

    // last
}