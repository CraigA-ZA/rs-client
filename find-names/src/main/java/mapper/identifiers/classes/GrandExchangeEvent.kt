package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(GrandExchangeOffer::class)
class GrandExchangeEvent : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<GrandExchangeOffer>() } }

    @DependsOn(GrandExchangeOffer::class)
    class grandExchangeOffer : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<GrandExchangeOffer>() }
    }

    class world : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
    }

    class string1 : OrderMapper.InConstructor.Field(GrandExchangeEvent::class, 0, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    class string2 : OrderMapper.InConstructor.Field(GrandExchangeEvent::class, 1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }
}