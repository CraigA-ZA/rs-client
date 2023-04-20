package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import org.objectweb.asm.Type

@DependsOn(Rasterizer2D::class)
class Rasterizer3D : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Rasterizer2D>() }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } >= 6 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 1 }
            .and { it.instanceFields.count { it.type == ByteArray::class.type } == 0 }
}