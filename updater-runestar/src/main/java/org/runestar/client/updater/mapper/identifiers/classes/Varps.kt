package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes.BIPUSH
import org.objectweb.asm.Opcodes.SIPUSH
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

class Varps : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.staticFields.count { it.type == IntArray::class.type } >= 3 }
            .and { it.classInitializer?.instructions?.any { it.opcode == BIPUSH && it.intOperand == 32 } ?: false }
            .and { it.classInitializer?.instructions?.any { it.opcode == SIPUSH && it.intOperand >= 2000 } ?: false }
}