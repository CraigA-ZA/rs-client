package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Rasterizer2D::class)
class Rasterizer3D : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Rasterizer2D>() }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } >= 6 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 1 }
            .and { it.instanceFields.count { it.type == ByteArray::class.type } == 0 }
}