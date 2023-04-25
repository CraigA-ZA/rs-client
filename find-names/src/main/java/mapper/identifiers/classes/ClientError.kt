package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper

class ClientError : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == RuntimeException::class.type }
            .and { it.instanceFields.count { it.type == Throwable::class.type } == 1 }

    class cause : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Throwable::class.type }
    }

    class message : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }
}