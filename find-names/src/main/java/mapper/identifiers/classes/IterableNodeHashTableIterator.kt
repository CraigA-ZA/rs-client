package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2

@DependsOn(IterableNodeHashTable::class)
class IterableNodeHashTableIterator : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.contains(Iterator::class.type) }
            .and { it.instanceFields.count { it.type == type<IterableNodeHashTable>() } == 1 }

    @DependsOn(IterableNodeHashTable::class)
    class hashTable : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeHashTable>() }
    }
}