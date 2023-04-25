package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper

@DependsOn(Wrapper::class)
class DirectWrapper : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Wrapper>() }
            .and { it.instanceFields.any { it.type == Any::class.type } }

    class obj : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Any::class.type }
    }

    @MethodParameters()
    @DependsOn(Wrapper.get::class)
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Wrapper.get>().mark }
    }

    @MethodParameters()
    @DependsOn(Wrapper.get::class, Wrapper.isSoft::class)
    class isSoft : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Wrapper.isSoft>().mark }
    }
}