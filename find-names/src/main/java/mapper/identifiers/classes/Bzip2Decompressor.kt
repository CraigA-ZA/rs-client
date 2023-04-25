package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Bzip2State::class)
class Bzip2Decompressor : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.fields.count { it.type == type<Bzip2State>() } == 1 }
}