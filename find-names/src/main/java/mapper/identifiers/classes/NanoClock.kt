package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

@DependsOn(Clock::class)
class NanoClock : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Clock>() }
            .and { it.instanceFields.size == 1 }

    class lastTimeNano : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { true }
    }

    @MethodParameters()
    class mark : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
    }

    @MethodParameters("cycleMs", "minSleepMs")
    class wait : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
    }
}