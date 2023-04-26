package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper

@DependsOn(NodeHashTable::class)
class SoundCache : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 4 }
            .and { it.instanceFields.count { it.type == type<NodeHashTable>() } == 2 }
}