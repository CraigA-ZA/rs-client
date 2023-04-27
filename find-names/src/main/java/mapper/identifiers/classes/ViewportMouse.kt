package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Client.ViewportMouse_isInViewport::class)
class ViewportMouse : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { field<Client.ViewportMouse_isInViewport>().klass == it }
}