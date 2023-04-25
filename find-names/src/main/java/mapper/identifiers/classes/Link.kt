package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper

class Link : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.instanceFields.size == 2 }
            .and { c -> c.instanceFields.all { it.type == c.type } }
            .and { it.instanceMethods.size == 1 }
            .and { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }

    class remove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { true }
    }
}