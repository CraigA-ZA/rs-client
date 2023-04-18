package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.StaticUniqueMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.nextWithin
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

class MiniMenuEntry : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.instanceFields.count { it.type == String::class.type } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 5}
            .and { it.instanceFields.size == 7 }

    @DependsOn(Client.menuArguments1::class)
    class argument1 : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == GETSTATIC && it.fieldId == field<Client.menuArguments1>().id }
                .nextWithin(10) { it.opcode == PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuArguments2::class)
    class argument2 : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == GETSTATIC && it.fieldId == field<Client.menuArguments2>().id }
                .nextWithin(10) { it.opcode == PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuOpcodes::class)
    class opcode : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == GETSTATIC && it.fieldId == field<Client.menuOpcodes>().id }
                .nextWithin(10) { it.opcode == PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuArguments0::class)
    class argument0 : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == GETSTATIC && it.fieldId == field<Client.menuArguments0>().id }
                .nextWithin(10) { it.opcode == PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuActions::class)
    class action : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == GETSTATIC && it.fieldId == field<Client.menuActions>().id }
                .nextWithin(10) { it.opcode == PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == String::class.type }
    }
}