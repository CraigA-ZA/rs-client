package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

class ClientProt : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.isNotEmpty() }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { it.staticFields.size >= 20 }

    class id : OrderMapper.InConstructor.Field(ClientProt::class, 0, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD }
    }

    class length : OrderMapper.InConstructor.Field(ClientProt::class, 1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD }
    }
}