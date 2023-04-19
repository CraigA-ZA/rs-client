package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.predicateutilities.and
import java.util.concurrent.Callable

class SecureRandomCallable : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces == listOf(Callable::class.type) }
            .and { it.instanceFields.isEmpty() }
}