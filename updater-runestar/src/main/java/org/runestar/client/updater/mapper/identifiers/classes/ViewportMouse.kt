package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

//@DependsOn(Client.ViewportMouse_isInViewport::class)
//class ViewportMouse : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { field<Client.ViewportMouse_isInViewport>().klass == it }
//}