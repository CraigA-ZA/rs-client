package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.ICONST_2
import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.lang.reflect.Modifier

@DependsOn(DualNode::class)
class InvType : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { !Modifier.isAbstract(it.access) }
            .and { it.instanceMethods.any { it.instructions.any { it.opcode == ICONST_2 } } }

    class size : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { true }
    }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.instructions.none { it.opcode == Opcodes.PUTFIELD } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.instructions.any { it.opcode == Opcodes.PUTFIELD } }
    }
}