package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type

@DependsOn(Clock::class)
class NanoClock : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Clock>() }
            .and { it.instanceFields.size == 1 }

    class lastTimeNano : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { true }
    }

    @MethodParameters()
    class mark : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
    }

    @MethodParameters("cycleMs", "minSleepMs")
    class wait : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
    }
}