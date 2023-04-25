package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper

class Strings : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.staticFields.count { it.type == String::class.type } > 20 }
}