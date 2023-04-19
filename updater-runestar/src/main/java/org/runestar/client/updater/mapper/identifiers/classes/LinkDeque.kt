package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Link::class)
class LinkDeque : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { it != klass<Link>() }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.all { it.type == type<Link>() } }
}