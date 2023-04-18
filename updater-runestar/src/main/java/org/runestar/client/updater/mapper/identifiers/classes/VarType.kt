package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.common.startsWith
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.AllUniqueMapper
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.prev
import org.runestar.client.updater.mapper.predicateutilities.prevWithin
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(TextureProvider.setBrightness::class)
class VarType : AllUniqueMapper.Class() {
    override val predicate = predicateOf<Instruction2> { it.isMethod && it.methodId == method<TextureProvider.setBrightness>().id }
            .prev { it.opcode == LDC && it.ldcCst == 0.9 }
            .prevWithin(30) { it.opcode == GETFIELD }

    override fun resolve(instruction: Instruction2): Class2 {
        return instruction.jar.get(instruction.fieldOwner)
    }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == PUTFIELD } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == PUTFIELD } }
    }

    class type : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }
}