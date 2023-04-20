package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.mark
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import java.awt.Canvas
import java.awt.Component

class Canvas : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Canvas::class.type }

    class component : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Component::class.type }
    }

    @MethodParameters("g")
    class paint : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == Canvas::paint.mark }
    }

    @MethodParameters("g")
    class update : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == Canvas::update.mark }
    }
}