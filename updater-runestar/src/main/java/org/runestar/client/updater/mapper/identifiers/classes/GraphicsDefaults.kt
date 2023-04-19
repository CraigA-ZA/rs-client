package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Method2

class GraphicsDefaults : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.size >= 11 }
            .and { it.instanceFields.all { it.type == Type.INT_TYPE } }
            .and { it.instanceMethods.size == 1 }

    @MethodParameters("archive")
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { true }
    }
//TODO
//    class compass : SpriteIdsField(0)
//    class mapedge : SpriteIdsField(1)
//    class mapscene : SpriteIdsField(2)
//    class headiconspk : SpriteIdsField(3)
//    class headiconsprayer : SpriteIdsField(4)
//    class headiconshint : SpriteIdsField(5)
//    class mapmarker : SpriteIdsField(6)
//    class cross : SpriteIdsField(7)
//    class mapdots : SpriteIdsField(8)
//    class scrollbar : SpriteIdsField(9)
//    class modicons : SpriteIdsField(10)
}