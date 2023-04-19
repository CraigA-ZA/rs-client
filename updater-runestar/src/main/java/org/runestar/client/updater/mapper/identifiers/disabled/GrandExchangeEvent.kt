package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(GrandExchangeOffer::class)
class GrandExchangeEvent : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<GrandExchangeOffer>() } }

//    @DependsOn(GrandExchangeOffer::class)
//    class grandExchangeOffer : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<GrandExchangeOffer>() }
//    }
//
//    class world : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
//    }
//
//    class string1 : OrderMapper.InConstructor.Field(GrandExchangeEvent::class, 0, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
//    }
//
//    class string2 : OrderMapper.InConstructor.Field(GrandExchangeEvent::class, 1, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
//    }
}