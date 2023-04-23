package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

//@DependsOn(Client.Login_username::class)
//class Login : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { field<Client.Login_username>().klass == it }
//}
//TODO