package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

@DependsOn(Client.Tiles_renderFlags::class)
class Tiles : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it == field<Client.Tiles_renderFlags>().klass }
}