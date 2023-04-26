package mapper.identifiers.classes

import mapper.abstractclasses.AllUniqueMapper
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.prevWithin
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes

class Huffman : AllUniqueMapper.Class() {
    override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.LDC && it.ldcCst == "huffman" }
            .prevWithin(4) { it.opcode == Opcodes.NEW }
}