package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

//@DependsOn(Client.NetCache_archives::class)
//class NetCache : IdentityMapper.Class() {
//    override val predicate = predicateOf<Class2> { field<Client.NetCache_archives>().klass == it }
//}