package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

@DependsOn(Client.Skills_enabled::class)
class Skills : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { field<Client.Skills_enabled>().klass == it }
}