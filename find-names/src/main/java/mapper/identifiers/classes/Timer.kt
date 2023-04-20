package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

class Timer : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == Type.LONG_TYPE } == 5 }
            .and { it.instanceFields.count { it.type == Type.BOOLEAN_TYPE } == 1 }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments == listOf(type<Packet>()) }
    }
}