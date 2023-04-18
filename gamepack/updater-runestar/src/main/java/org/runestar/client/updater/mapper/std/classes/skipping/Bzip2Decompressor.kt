package org.runestar.client.updater.mapper.std.classes.skipping

import org.runestar.client.updater.mapper.IdentityMapper
import org.runestar.client.updater.mapper.DependsOn
import org.runestar.client.updater.mapper.predicateOf
import org.runestar.client.updater.mapper.Class2
import org.runestar.client.updater.mapper.std.classes.Client

@DependsOn(Client.Bzip2Decompressor_state::class)
class Bzip2Decompressor : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { field<Client.Bzip2Decompressor_state>().klass == it }
}