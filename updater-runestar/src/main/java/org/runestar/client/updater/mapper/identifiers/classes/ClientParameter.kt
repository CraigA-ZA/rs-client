package org.runestar.client.updater.mapper.identifiers.classes//package org.runestar.client.updater.mapper.std.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Field2
import org.objectweb.asm.Opcodes
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

//TODO
//class ClientParameter : IdentityMapper.Class() {
//    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
//            .and { it.superType == Any::class.type }
//            .and { it.classInitializer != null }
//            .and { it.classInitializer!!.instructions.any { it.opcode == Opcodes.LDC && it.ldcCst == "15" } }
//
//    class id : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == String::class.type }
//    }
//}