package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.DualNode
import org.runestar.client.updater.mapper.identifiers.classes.IterableNodeHashTable
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(IterableNodeHashTable::class, DualNode::class)
class ClientScript : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.any { it.type == type<IterableNodeHashTable>().withDimensions(1) } }

//    class stringOperands : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Array<String>::class.type }
//    }
//
//    @DependsOn(IterableNodeHashTable::class)
//    class switches : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeHashTable>().withDimensions(1) }
//    }

//    class localIntCount : ScriptField(0, INT_TYPE)
//    class localStringCount : ScriptField(1, INT_TYPE)
//    class intArgumentCount : ScriptField(2, INT_TYPE)
//    class stringArgumentCount : ScriptField(3, INT_TYPE)
//
//    class opcodes : ScriptField( 0, IntArray::class.type)
//    class intOperands : ScriptField( 1, IntArray::class.type)
}