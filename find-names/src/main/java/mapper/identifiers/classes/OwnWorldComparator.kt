package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import org.objectweb.asm.Opcodes

@DependsOn(Client.worldId::class)
class OwnWorldComparator : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.interfaces.contains(Comparator::class.type) }
            .and { it.instanceMethods.flatMap { it.instructions.asIterable() }
                    .any { it.opcode == Opcodes.GETSTATIC && it.fieldId == field<Client.worldId>().id } }
}