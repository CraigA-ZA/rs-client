package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2

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