package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import java.util.concurrent.Callable

class SecureRandomCallable : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.interfaces == listOf(Callable::class.type) }
            .and { it.instanceFields.isEmpty() }
}