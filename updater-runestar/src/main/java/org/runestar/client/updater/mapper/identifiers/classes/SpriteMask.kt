package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.identifiers.SpriteMaskConstructorField
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(DualNode::class)
class SpriteMask : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 2 }
            .and { it.instanceMethods.size == 1 }
    class width : SpriteMaskConstructorField(INT_TYPE, 0)
    class height : SpriteMaskConstructorField(INT_TYPE, 1)
    class xWidths : SpriteMaskConstructorField(IntArray::class.type, 0)
    class xStarts : SpriteMaskConstructorField(IntArray::class.type, 1)

    @MethodParameters("x", "y")
    class contains : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
    }
}