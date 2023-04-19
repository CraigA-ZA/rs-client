package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.mark
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

class MouseHandler : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(MouseListener::class.type) }

//    @MethodParameters("mouseEvent")
//    class mouseMoved : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == MouseMotionListener::mouseMoved.mark }
//    }
//
//    @MethodParameters("mouseEvent")
//    class mousePressed : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == MouseListener::mousePressed.mark }
//    }
//
//    @MethodParameters("mouseEvent")
//    class mouseReleased : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == MouseListener::mouseReleased.mark }
//    }
//
//    @MethodParameters("mouseEvent")
//    class mouseClicked : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == MouseListener::mouseClicked.mark }
//    }
//
//    @MethodParameters("mouseEvent")
//    class mouseEntered : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == MouseListener::mouseEntered.mark }
//    }
//
//    @MethodParameters("mouseEvent")
//    class mouseExited : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == MouseListener::mouseExited.mark }
//    }
//
//    @MethodParameters("mouseEvent")
//    class mouseDragged : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == MouseMotionListener::mouseDragged.mark }
//    }
//
//    @MethodParameters("mouseEvent")
//    class getButton : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//    }
}