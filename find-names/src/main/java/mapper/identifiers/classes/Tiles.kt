package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Client.Tiles_renderFlags::class)
class Tiles : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it == field<Client.Tiles_renderFlags>().klass }
}