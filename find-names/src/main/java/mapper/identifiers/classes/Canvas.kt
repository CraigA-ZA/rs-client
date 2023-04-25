package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.mark
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import java.awt.Canvas
import java.awt.Component

class Canvas : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Canvas::class.type }

    class component : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Component::class.type }
    }

    @MethodParameters("g")
    class paint : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == Canvas::paint.mark }
    }

    @MethodParameters("g")
    class update : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == Canvas::update.mark }
    }
}