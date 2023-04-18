package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(ClientProt::class)
class ClientProt0 : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { klass<ClientProt>().interfaces.contains(it.type) }
}