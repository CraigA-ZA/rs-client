package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.identifiers.ConstructorPutField
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import org.objectweb.asm.Type

@DependsOn(AnimBase::class)
class AnimFrame : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<AnimBase>() } == 1 }

    @DependsOn(AnimBase::class)
    class base : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<AnimBase>() }
    }

    class transformCount : ConstructorPutField(AnimFrame::class, 0, Type.INT_TYPE)
    class transforms : ConstructorPutField(AnimFrame::class, 0, IntArray::class.type)

    class xs : ConstructorPutField(AnimFrame::class, 1, IntArray::class.type)
    class ys : ConstructorPutField(AnimFrame::class, 2, IntArray::class.type)
    class zs : ConstructorPutField(AnimFrame::class, 3, IntArray::class.type)

    class transparency : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BOOLEAN_TYPE }
    }
}