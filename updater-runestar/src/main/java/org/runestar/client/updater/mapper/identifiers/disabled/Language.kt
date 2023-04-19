package org.runestar.client.updater.mapper.identifiers.disabled//package org.runestar.client.updater.mapper.std.classes
//
//import org.objectweb.asm.Opcodes.*
//import org.runestar.client.updater.mapper.classmembers.Class2
//import org.runestar.client.updater.mapper.annotations.DependsOn
//import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
//import org.runestar.client.updater.mapper.predicateutilities.and
//import org.runestar.client.updater.mapper.predicateutilities.predicateOf
//
//@DependsOn(Enumerated::class)
//class Language : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<Enumerated>()) }
//            .and { it.classInitializer?.instructions?.any { it.opcode == LDC && it.ldcCst == "Spanish" } ?: false }
//}