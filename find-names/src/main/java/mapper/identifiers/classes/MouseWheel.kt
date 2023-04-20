package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

@DependsOn(MouseWheelHandler::class)
class MouseWheel : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.type in klass<MouseWheelHandler>().interfaces }

    @MethodParameters()
    class useRotation : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
    }
}
