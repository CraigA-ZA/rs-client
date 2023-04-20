package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

@DependsOn(ClientProt::class)
class ClientProt0 : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { klass<ClientProt>().interfaces.contains(it.type) }
}