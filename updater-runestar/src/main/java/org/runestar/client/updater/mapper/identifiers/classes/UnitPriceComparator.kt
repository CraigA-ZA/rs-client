package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

//@DependsOn(GrandExchangeOffer.unitPrice::class)
//class UnitPriceComparator : IdentityMapper.Class() {
//    override val predicate = predicateOf<Class2> { it.interfaces.contains(Comparator::class.type) }
//            .and { it.instanceMethods.flatMap { it.instructions.asIterable() }
//                    .any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<GrandExchangeOffer.unitPrice>().id } }
//}