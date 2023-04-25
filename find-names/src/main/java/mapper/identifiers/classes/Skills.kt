package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Client.Skills_enabled::class)
class Skills : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { field<Client.Skills_enabled>().klass == it }
}