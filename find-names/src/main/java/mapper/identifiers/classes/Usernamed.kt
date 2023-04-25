package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper
import java.lang.reflect.Modifier

@DependsOn(Username::class)
class Usernamed : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { Modifier.isInterface(it.access) }
            .and { it.instanceMethods.size == 1 }
            .and { it.instanceMethods.first().returnType == type<Username>() }

    class username : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { true }
    }
}