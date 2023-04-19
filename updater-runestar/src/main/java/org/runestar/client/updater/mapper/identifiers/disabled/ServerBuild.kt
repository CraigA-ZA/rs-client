package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Opcodes

class ServerBuild : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { it.superType == Any::class.type }
            .and { it.classInitializer != null }
            .and { it.classInitializer!!.instructions.any { it.opcode == Opcodes.LDC && it.ldcCst == "BUILDLIVE" } }

//    class id : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
//    }
//
//    class name : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == String::class.type }
//    }
}