package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

class Task : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.any { Modifier.isVolatile(it.access) && it.type == Any::class.type } }

    class result : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { Modifier.isVolatile(it.access) && it.type == Any::class.type }
    }

    class objectArgument : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { !Modifier.isVolatile(it.access) && it.type == Any::class.type }
    }

    class status : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { Modifier.isVolatile(it.access) && it.type == Type.INT_TYPE }
    }

    class next : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Task>() }
    }

    @DependsOn(TaskHandler.newTask::class)
    class type : OrderMapper.InMethod.Field(TaskHandler.newTask::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD }
    }

    @DependsOn(TaskHandler.newTask::class)
    class intArgument : OrderMapper.InMethod.Field(TaskHandler.newTask::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD }
    }
}