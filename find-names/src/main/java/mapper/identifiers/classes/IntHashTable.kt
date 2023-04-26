package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes

@DependsOn(AbstractArchive.decodeIndex::class)
class IntHashTable : OrderMapper.InMethod.Class(AbstractArchive.decodeIndex::class, 1, 3) {
    override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.NEW && it.typeType in it.jar }

    class array : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { true }
    }

    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { true }
    }
}