package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.identifiers.classes.ClientProt0

@DependsOn(ClientProt0::class)
class LoginProt : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<ClientProt0>()) }
            .and { it.instanceFields.size == 1 }

//    class id : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
//    }
}