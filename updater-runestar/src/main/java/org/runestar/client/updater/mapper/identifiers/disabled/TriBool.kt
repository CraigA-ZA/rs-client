package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import java.lang.reflect.Modifier

class TriBool : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.superType == Any::class.type }
            .and { a -> a.staticFields.count { it.type == a.type } == 3 }
            .and { a -> a.staticFields.filter { it.type == a.type }.all { Modifier.isPublic(it.access) } }
}