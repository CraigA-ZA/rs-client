package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2

class ClientError : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == RuntimeException::class.type }
            .and { it.instanceFields.count { it.type == Throwable::class.type } == 1 }

    class cause : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Throwable::class.type }
    }

    class message : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == String::class.type }
    }
}