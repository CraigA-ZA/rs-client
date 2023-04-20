package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.identifiers.SpriteMaskConstructorField
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE

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