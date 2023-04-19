package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Method2
import org.runestar.client.updater.mapper.predicateutilities.mark
import java.awt.event.KeyListener

class KeyHandler : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(KeyListener::class.type) }

//    @MethodParameters("keyEvent")
//    class keyPressed : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == KeyListener::keyPressed.mark }
//    }
//
//    @MethodParameters("keyEvent")
//    class keyReleased : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == KeyListener::keyReleased.mark }
//    }
//
//    @MethodParameters("keyEvent")
//    class keyTyped : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == KeyListener::keyTyped.mark }
//    }
}