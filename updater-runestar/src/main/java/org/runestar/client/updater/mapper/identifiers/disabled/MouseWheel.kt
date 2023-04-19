package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(MouseWheelHandler::class)
class MouseWheel : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.type in klass<MouseWheelHandler>().interfaces }

//    @MethodParameters()
//    class useRotation : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
//    }
}
