package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

//@DependsOn(Client.Bzip2Decompressor_state::class)
//class Bzip2Decompressor : IdentityMapper.Class() {
//    override val predicate = predicateOf<Class2> { field<Client.Bzip2Decompressor_state>().klass == it }
//}