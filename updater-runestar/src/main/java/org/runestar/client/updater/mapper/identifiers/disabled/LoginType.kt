package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

// name length ??
class LoginType : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } == 1 }
            .and { it.instanceFields.count { it.type == String::class.type } == 1 }
            .and { it.instanceMethods.size == 1 }
}