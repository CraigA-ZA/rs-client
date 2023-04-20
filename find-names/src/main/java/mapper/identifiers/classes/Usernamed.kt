package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import java.lang.reflect.Modifier

@DependsOn(Username::class)
class Usernamed : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { Modifier.isInterface(it.access) }
            .and { it.instanceMethods.size == 1 }
            .and { it.instanceMethods.first().returnType == type<Username>() }

    class username : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { true }
    }
}