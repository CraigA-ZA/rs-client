package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Link::class)
class LinkDeque : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.interfaces.isEmpty() }
            .and { it != klass<Link>() }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.all { it.type == type<Link>() } }
}