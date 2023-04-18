//package org.runestar.client.updater.mapper.std.classes
//
//import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
//import org.runestar.client.updater.mapper.predicateutilities.and
//import org.runestar.client.updater.mapper.predicateutilities.predicateOf
//import org.runestar.client.updater.mapper.predicateutilities.getType
//import org.runestar.client.updater.mapper.classmembers.Class2
//import org.runestar.client.updater.mapper.wrappers.Field2
//import org.objectweb.asm.Opcodes
//
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