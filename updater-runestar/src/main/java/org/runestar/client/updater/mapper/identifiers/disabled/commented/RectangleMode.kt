package org.runestar.client.updater.mapper.identifiers.disabled.commented

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import java.lang.reflect.Modifier

//@DependsOn(Component.rectangleMode::class)
//class RectangleMode : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { it.type == field<Component.rectangleMode>().type }
//
//    class id : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { Modifier.isPublic(it.access) }
//    }
//
//    class id2 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { !Modifier.isPublic(it.access) }
//    }
//}