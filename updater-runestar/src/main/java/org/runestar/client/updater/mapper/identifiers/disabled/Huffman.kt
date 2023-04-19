package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.AllUniqueMapper
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.prevWithin
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.objectweb.asm.Opcodes

class Huffman : AllUniqueMapper.Class() {
    override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.LDC && it.ldcCst == "huffman" }
            .prevWithin(4) { it.opcode == Opcodes.NEW }
}