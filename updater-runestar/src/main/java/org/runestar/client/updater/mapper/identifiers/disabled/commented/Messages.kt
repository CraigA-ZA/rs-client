package org.runestar.client.updater.mapper.identifiers.disabled.commented

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

//@DependsOn(Client.Messages_hashTable::class)
//class Messages : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
//            .and { it.staticFields.contains(field<Client.Messages_hashTable>()) }
//}