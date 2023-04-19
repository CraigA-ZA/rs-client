package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.wrappers.Instruction2

class ClientProt : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isNotEmpty() }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { it.staticFields.size >= 20 }

    class id : OrderMapper.InConstructor.Field(ClientProt::class, 0, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

    class length : OrderMapper.InConstructor.Field(ClientProt::class, 1, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }
}