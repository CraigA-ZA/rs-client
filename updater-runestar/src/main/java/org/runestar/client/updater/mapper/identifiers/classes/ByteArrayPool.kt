package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2

class ByteArrayPool : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.staticFields.count { it.type == BYTE_TYPE.withDimensions(2) } >= 3}
}