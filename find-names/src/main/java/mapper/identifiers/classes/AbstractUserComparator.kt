package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import org.runestar.client.common.startsWith
import java.lang.reflect.Modifier

@DependsOn(User::class)
class AbstractUserComparator : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { Modifier.isAbstract(it.access) }
            .and { it.interfaces.contains(Comparator::class.type) }
            .and { it.instanceMethods.any { it.arguments.startsWith(type<User>(), type<User>()) } }
}