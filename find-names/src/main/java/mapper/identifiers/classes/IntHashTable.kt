package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes

@DependsOn(AbstractArchive.decodeIndex::class)
class IntHashTable : OrderMapper.InMethod.Class(AbstractArchive.decodeIndex::class, 1, 3) {
    override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.NEW && it.typeType in it.jar }

    class array : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { true }
    }

    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { true }
    }
}