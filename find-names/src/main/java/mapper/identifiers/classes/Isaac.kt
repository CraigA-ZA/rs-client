package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

@DependsOn(PacketBit.isaac0::class)
class Isaac : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.type == field<PacketBit.isaac0>().type }
}