package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import org.objectweb.asm.Type

class Login : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.instanceFields.isEmpty() }
            .and { it.interfaces.isEmpty()}
            .and {it.superType == Any::class.type}
            .and { it.instanceMethods.isEmpty()}
            .and {it.staticFields.count() >= 35}
            .and {it.staticFields.count { it.type == Type.INT_TYPE} >= 5}
}