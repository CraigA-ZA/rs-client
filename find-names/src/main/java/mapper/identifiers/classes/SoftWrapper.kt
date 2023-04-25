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
import java.lang.ref.SoftReference

@DependsOn(Wrapper::class)
class SoftWrapper : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Wrapper>() }
            .and { it.instanceFields.any { it.type == SoftReference::class.type } }

    class ref : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == SoftReference::class.type }
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