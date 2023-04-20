package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

@DependsOn(Node::class)
class PlatformInfo : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == Type.BOOLEAN_TYPE } == 2 }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } >= 15  }

    @MethodParameters("packet")
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments.size == 1 }
    }

    @MethodParameters()
    class size : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments.isEmpty() }
    }
}