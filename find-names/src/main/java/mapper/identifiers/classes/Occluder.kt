package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import org.objectweb.asm.Type

class Occluder : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceMethods.isEmpty() }
            .and { it.instanceFields.size == 18 }
            .and { it.instanceFields.all { it.type == Type.INT_TYPE } }

    //TODO
//    class minTileX : OccluderField(0)
//    class maxTileX : OccluderField(1)
//    class minTileY : OccluderField(2)
//    class maxTileY : OccluderField(3)
//    class type : OccluderField(4)
//    class minX : OccluderField(5)
//    class maxX : OccluderField(6)
//    class minZ : OccluderField(7)
//    class maxZ : OccluderField(8)
//    class minY : OccluderField(9)
//    class maxY : OccluderField(10)
}