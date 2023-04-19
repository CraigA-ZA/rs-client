package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.AbstractArchive
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

//@DependsOn(AbstractArchive.decodeIndex::class)
//class IntHashTable : OrderMapper.InMethod.Class(AbstractArchive.decodeIndex::class, 1, 3) {
//    override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.NEW && it.typeType in it.jar }
//
//    class array : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { true }
//    }
//
//    class get : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { true }
//    }
//}