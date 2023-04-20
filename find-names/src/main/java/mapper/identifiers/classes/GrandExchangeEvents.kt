package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.runestar.client.common.startsWith

class GrandExchangeEvents : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == List::class.type } }

    class events : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == List::class.type }
    }

    class sort : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments.startsWith(Comparator::class.type) }
    }
}