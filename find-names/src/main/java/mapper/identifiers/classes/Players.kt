package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

//@DependsOn(Client.Players_targetIndices::class)
//class Players : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { field<Client.Players_targetIndices>().klass == it }
//}