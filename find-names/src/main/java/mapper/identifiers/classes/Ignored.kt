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

@DependsOn(User::class)
class Ignored : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<User>() }
            .and { it.instanceFields.count() == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 1 }

    class id : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }

    @MethodParameters("other")
    class compareTo00 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
                .and { it.arguments == listOf(type<Ignored>()) }
    }
}