package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(PacketBit.isaac0::class)
class Isaac : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.type == field<PacketBit.isaac0>().type }
}