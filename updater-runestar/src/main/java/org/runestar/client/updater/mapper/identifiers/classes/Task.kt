package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import java.lang.reflect.Modifier

class Task : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.any { Modifier.isVolatile(it.access) && it.type == Any::class.type } }

    class result : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { Modifier.isVolatile(it.access) && it.type == Any::class.type }
    }

    class objectArgument : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { !Modifier.isVolatile(it.access) && it.type == Any::class.type }
    }

    class status : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { Modifier.isVolatile(it.access) && it.type == Type.INT_TYPE }
    }

    class next : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<Task>() }
    }

    @DependsOn(TaskHandler.newTask::class)
    class type : OrderMapper.InMethod.Field(TaskHandler.newTask::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }

    @DependsOn(TaskHandler.newTask::class)
    class intArgument : OrderMapper.InMethod.Field(TaskHandler.newTask::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD }
    }
}