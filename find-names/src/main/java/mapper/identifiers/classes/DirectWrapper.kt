package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2

@DependsOn(Wrapper::class)
class DirectWrapper : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Wrapper>() }
            .and { it.instanceFields.any { it.type == Any::class.type } }

    class obj : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Any::class.type }
    }

    @MethodParameters()
    @DependsOn(Wrapper.get::class)
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<Wrapper.get>().mark }
    }

    @MethodParameters()
    @DependsOn(Wrapper.get::class, Wrapper.isSoft::class)
    class isSoft : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<Wrapper.isSoft>().mark }
    }
}