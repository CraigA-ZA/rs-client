package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.FLOAT_TYPE
import org.objectweb.asm.Type.INT_TYPE

class VorbisCodebook : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 2 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 3 }

    class dimensions : OrderMapper.InConstructor.Field(VorbisCodebook::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class multiplicands : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == FLOAT_TYPE.withDimensions(2) }
    }

    class entries : OrderMapper.InConstructor.Field(VorbisCodebook::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class lengths : OrderMapper.InConstructor.Field(VorbisCodebook::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE.withDimensions(1) }
    }

    class mults : OrderMapper.InConstructor.Field(VorbisCodebook::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE.withDimensions(1) }
    }
}