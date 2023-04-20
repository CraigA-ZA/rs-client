package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import java.lang.reflect.Modifier

class TriBool : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.superType == Any::class.type }
            .and { a -> a.staticFields.count { it.type == a.type } == 3 }
            .and { a -> a.staticFields.filter { it.type == a.type }.all { Modifier.isPublic(it.access) } }
}