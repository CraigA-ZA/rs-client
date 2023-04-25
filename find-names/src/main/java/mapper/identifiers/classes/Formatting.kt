package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import org.objectweb.asm.Opcodes

class Formatting : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.isEmpty() && it.instanceMethods.isEmpty() }
            .and { it.classInitializer != null && it.classInitializer!!.instructions.any { it.opcode == Opcodes.LDC && it.ldcCst == "->" } }
}