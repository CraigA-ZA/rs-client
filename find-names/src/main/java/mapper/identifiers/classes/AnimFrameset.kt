package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.withDimensions
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

@DependsOn(DualNode::class, AnimFrame::class)
class AnimFrameset : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.any { it.type == type<AnimFrame>().withDimensions(1) } }

    @DependsOn(AnimFrame::class)
    class frames : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<AnimFrame>().withDimensions(1) }
    }

    @MethodParameters("frame")
    class hasAlphaTransform : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.BOOLEAN_TYPE }
    }
}