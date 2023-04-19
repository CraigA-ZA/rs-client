package org.runestar.client.updater.mapper.identifiers.classes//package org.runestar.client.updater.mapper.std.classes

import org.objectweb.asm.Opcodes.*
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Enumerated::class)
class Language : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<Enumerated>()) }
            .and { it.classInitializer?.instructions?.any { it.opcode == LDC && it.ldcCst == "Spanish" } ?: false }
}