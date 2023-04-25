package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.runestar.client.common.startsWith

class GrandExchangeEvents : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == List::class.type } }

    class events : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == List::class.type }
    }

    class sort : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(Comparator::class.type) }
    }
}