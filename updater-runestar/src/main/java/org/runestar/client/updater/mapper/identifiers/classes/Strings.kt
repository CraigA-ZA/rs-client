package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

class Strings : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.staticFields.count { it.type == String::class.type } > 20 }
}