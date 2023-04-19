package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Client.Skills_enabled::class)
class Skills : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { field<Client.Skills_enabled>().klass == it }
}