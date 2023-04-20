package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2

class ClientError : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == RuntimeException::class.type }
            .and { it.instanceFields.count { it.type == Throwable::class.type } == 1 }

    class cause : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Throwable::class.type }
    }

    class message : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == String::class.type }
    }
}