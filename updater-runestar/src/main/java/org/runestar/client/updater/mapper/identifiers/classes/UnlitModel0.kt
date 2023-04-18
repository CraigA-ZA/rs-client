package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

class UnlitModel0 : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.interfaces.isEmpty() }
            .and { it.constructors.size == 1 }
            .and { it.constructors.get(0).exceptions.none { it == "java/lang/Throwable"}}
            .and { a -> a.staticFields.none { it.type == a.type } }
}