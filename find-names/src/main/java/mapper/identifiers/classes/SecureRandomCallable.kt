package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import java.util.concurrent.Callable

class SecureRandomCallable : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces == listOf(Callable::class.type) }
            .and { it.instanceFields.isEmpty() }
}