package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(Node::class)
class ObjectNode : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == Any::class.type } }
            .and { it.instanceMethods.isEmpty() }

    class obj : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Any::class.type }
    }
}