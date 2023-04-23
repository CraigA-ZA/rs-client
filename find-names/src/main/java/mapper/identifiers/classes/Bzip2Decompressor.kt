package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2

@DependsOn(Bzip2State::class)
class Bzip2Decompressor : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.fields.count { it.type == type<Bzip2State>() } == 1 }
}