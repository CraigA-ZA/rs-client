package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.mark
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper
import java.awt.event.KeyListener

class KeyHandler : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.interfaces.contains(KeyListener::class.type) }

    @MethodParameters("keyEvent")
    class keyPressed : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == KeyListener::keyPressed.mark }
    }

    @MethodParameters("keyEvent")
    class keyReleased : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == KeyListener::keyReleased.mark }
    }

    @MethodParameters("keyEvent")
    class keyTyped : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == KeyListener::keyTyped.mark }
    }
}