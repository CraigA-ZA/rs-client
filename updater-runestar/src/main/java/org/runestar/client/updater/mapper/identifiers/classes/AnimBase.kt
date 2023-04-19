package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.ConstructorPutField
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(Node::class)
class AnimBase : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE.withDimensions(1) } == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE.withDimensions(2) } == 1 }

    class id : ConstructorPutField(AnimBase::class, 0, INT_TYPE)

    class transformCount : ConstructorPutField(AnimBase::class, 1, INT_TYPE)

    class transformTypes : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == IntArray::class.type }
    }

    class transformLabels : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE.withDimensions(2) }
    }
}