package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.identifiers.ConstructorPutField
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(AnimBase::class)
class AnimFrame : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<AnimBase>() } == 1 }

    @DependsOn(AnimBase::class)
    class base : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<AnimBase>() }
    }

    class transformCount : ConstructorPutField(AnimFrame::class, 0, INT_TYPE)
    class transforms : ConstructorPutField(AnimFrame::class, 0, IntArray::class.type)

    class xs : ConstructorPutField(AnimFrame::class, 1, IntArray::class.type)
    class ys : ConstructorPutField(AnimFrame::class, 2, IntArray::class.type)
    class zs : ConstructorPutField(AnimFrame::class, 3, IntArray::class.type)

    class transparency : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
    }
}