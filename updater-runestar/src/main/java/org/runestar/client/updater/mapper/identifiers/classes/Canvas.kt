package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.mark
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2
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