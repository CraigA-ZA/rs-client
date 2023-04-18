package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2
import org.objectweb.asm.Opcodes.GETFIELD
import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE

class ClientPreferences : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == Integer::class.type } == 6 }
            .and { it.instanceFields.count { it.type == Map::class.type } == 6 }

    class windowMode : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }

    class parameters : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == LinkedHashMap::class.type }
    }

    @MethodParameters()
    @DependsOn(Packet::class)
    class toBuffer : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<Packet>() }
    }

    @DependsOn(toBuffer::class)
    class roofsHidden : OrderMapper.InMethod.Field(toBuffer::class, 0, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
    }

    @DependsOn(toBuffer::class)
    class titleMusicDisabled : OrderMapper.InMethod.Field(toBuffer::class, 1, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
    }

    @DependsOn(toBuffer::class)
    class hideUsername : OrderMapper.InMethod.Field(toBuffer::class, 2, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
    }

    class rememberedUsername : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == String::class.type }
    }
}