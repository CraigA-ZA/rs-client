package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Client.NetCache_archives::class)
class NetCache : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { field<Client.NetCache_archives>().klass == it }
}