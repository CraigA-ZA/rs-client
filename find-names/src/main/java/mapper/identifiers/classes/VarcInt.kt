package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

@DependsOn(Varcs::class)
class VarcInt : OrderMapper.InConstructor.Class(Varcs::class, 0, 2) {

    override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE }

    override fun resolve(instruction: Instruction2): Class2 {
        return instruction.jar[instruction.fieldOwner]
    }

    class persist : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
    }
}