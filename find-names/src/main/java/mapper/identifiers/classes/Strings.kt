package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2

class Strings : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.staticFields.count { it.type == String::class.type } > 20 }
}