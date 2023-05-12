package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Client.Players_targetIndices::class)
class Players : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { field<Client.Players_targetIndices>().klass == it }
}