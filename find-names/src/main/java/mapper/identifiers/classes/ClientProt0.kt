package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(ClientProt::class)
class ClientProt0 : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { klass<ClientProt>().interfaces.contains(it.type) }
}