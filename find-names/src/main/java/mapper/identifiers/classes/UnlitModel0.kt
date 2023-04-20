package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2

class UnlitModel0 : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.interfaces.isEmpty() }
            .and { it.constructors.size == 1 }
            .and { it.constructors.get(0).exceptions.none { it == "java/lang/Throwable"}}
            .and { a -> a.staticFields.none { it.type == a.type } }
}