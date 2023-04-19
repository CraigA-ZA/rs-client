package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
//import org.runestar.client.updater.mapper.identifiers.ScriptField
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(IterableNodeHashTable::class, DualNode::class)
class ClientScript : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.any { it.type == type<IterableNodeHashTable>().withDimensions(1) } }

    class stringOperands : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Array<String>::class.type }
    }

    @DependsOn(IterableNodeHashTable::class)
    class switches : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeHashTable>().withDimensions(1) }
    }

    //TODO
//    class localIntCount : ScriptField(0, Type.INT_TYPE)
//    class localStringCount : ScriptField(1, Type.INT_TYPE)
//    class intArgumentCount : ScriptField(2, Type.INT_TYPE)
//    class stringArgumentCount : ScriptField(3, Type.INT_TYPE)
//
//    class opcodes : ScriptField( 0, IntArray::class.type)
//    class intOperands : ScriptField( 1, IntArray::class.type)
}