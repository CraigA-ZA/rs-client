package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import org.objectweb.asm.Type

// name length ??
class LoginType : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } == 1 }
            .and { it.instanceFields.count { it.type == String::class.type } == 1 }
            .and { it.instanceMethods.size == 1 }
}