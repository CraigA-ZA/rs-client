package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.identifiers.SpriteIdsField
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type

class GraphicsDefaults : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.size >= 11 }
            .and { it.instanceFields.all { it.type == Type.INT_TYPE } }
            .and { it.instanceMethods.size == 1 }

    @MethodParameters("archive")
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { true }
    }

    class compass : SpriteIdsField(0)
    class mapedge : SpriteIdsField(1)
    class mapscene : SpriteIdsField(2)
    class headiconspk : SpriteIdsField(3)
    class headiconsprayer : SpriteIdsField(4)
    class headiconshint : SpriteIdsField(5)
    class mapmarker : SpriteIdsField(6)
    class cross : SpriteIdsField(7)
    class mapdots : SpriteIdsField(8)
    class scrollbar : SpriteIdsField(9)
    class modicons : SpriteIdsField(10)
}