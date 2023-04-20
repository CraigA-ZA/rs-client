package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Method2

class Link : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.instanceFields.size == 2 }
            .and { c -> c.instanceFields.all { it.type == c.type } }
            .and { it.instanceMethods.size == 1 }
            .and { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }

    class remove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { true }
    }
}