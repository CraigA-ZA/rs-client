package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.common.startsWith
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2

class GrandExchangeEvents : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == List::class.type } }

    class events : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == List::class.type }
    }

    class sort : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments.startsWith(Comparator::class.type) }
    }
}