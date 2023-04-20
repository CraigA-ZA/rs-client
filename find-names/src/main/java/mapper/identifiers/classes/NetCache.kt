package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

@DependsOn(Client.NetCache_archives::class)
class NetCache : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { field<Client.NetCache_archives>().klass == it }
}