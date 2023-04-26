package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

@DependsOn(Varcs::class)
class VarcInt : OrderMapper.InConstructor.Class(Varcs::class, 0, 2) {

    override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE }

    override fun resolve(instruction: InstructionWrapper): ClassWrapper {
        return instruction.jar[instruction.fieldOwner]
    }

    class persist : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == BOOLEAN_TYPE }
    }
}