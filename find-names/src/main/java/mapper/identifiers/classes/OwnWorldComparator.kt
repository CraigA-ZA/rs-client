package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.wrappers.Class2

//@DependsOn(Client.worldId::class)
//class OwnWorldComparator : IdentityMapper.Class() {
//    override val predicate = predicateOf<Class2> { it.interfaces.contains(Comparator::class.type) }
//            .and { it.instanceMethods.flatMap { it.instructions.asIterable() }
//                    .any { it.opcode == Opcodes.GETSTATIC && it.fieldId == field<Client.worldId>().id } }
//}