package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(Enumerated::class)
class WorldMapSectionType : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.contains(type<Enumerated>()) }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 1 }
            .and { it.instanceFields.count { it.type == BYTE_TYPE } == 1 }
            .and { it.instanceMethods.size == 1 }

    class id : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BYTE_TYPE }
    }

    class type : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }
}