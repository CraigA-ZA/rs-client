package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE
import java.lang.reflect.Modifier

@DependsOn(DualNode::class)
class Entity : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 1 }
            .and { Modifier.isAbstract(it.access) }
            .and { it.instanceMethods.none { Modifier.isAbstract(it.access) } }

    class height : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }

    @MethodParameters()
    class getModel : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType in it.jar }
    }

    @MethodParameters("yaw", "cameraPitchSine", "cameraPitchCosine", "cameraYawSine", "cameraYawCosine", "x", "y", "z", "tag")
    class draw : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
    }
}