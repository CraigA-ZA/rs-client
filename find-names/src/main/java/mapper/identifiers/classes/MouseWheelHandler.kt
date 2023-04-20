package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.mark
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE
import java.awt.event.MouseWheelListener

class MouseWheelHandler : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(MouseWheelListener::class.type) }

    class rotation : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(MouseWheel.useRotation::class)
    class useRotation : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<MouseWheel.useRotation>().mark }
    }

    @MethodParameters("component")
    class addTo : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == "addMouseWheelListener" } }
    }

    @MethodParameters("component")
    class removeFrom : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == "removeMouseWheelListener" } }
    }

    @MethodParameters("mouseWheelEvent")
    class mouseWheelMoved : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == MouseWheelListener::mouseWheelMoved.mark }
    }
}