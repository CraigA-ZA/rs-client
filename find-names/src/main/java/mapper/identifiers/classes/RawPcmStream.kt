package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(PcmStream::class)
class RawPcmStream : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<PcmStream>() }
            .and { it.instanceFields.size == 15 }

    class start : OrderMapper.InConstructor.Field(RawPcmStream::class, 0) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size == 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class end : OrderMapper.InConstructor.Field(RawPcmStream::class, 1) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size == 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }
}