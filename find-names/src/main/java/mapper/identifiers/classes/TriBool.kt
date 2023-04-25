package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import java.lang.reflect.Modifier

class TriBool : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.superType == Any::class.type }
            .and { a -> a.staticFields.count { it.type == a.type } == 3 }
            .and { a -> a.staticFields.filter { it.type == a.type }.all { Modifier.isPublic(it.access) } }
}