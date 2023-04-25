package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(Task::class)
class TaskHandler : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<Task>() } == 2 }

    class thread : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Thread::class.type }
    }

    @DependsOn(Task::class)
    class newTask : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Task>() }
                .and { it.arguments.startsWith(INT_TYPE, INT_TYPE, INT_TYPE, Any::class.type) }
    }

    @DependsOn(Task::class)
    class newSocketTask : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Task>() }
                .and { it.arguments.startsWith(String::class.type, INT_TYPE) }
    }

    @DependsOn(Task::class)
    class newThreadTask : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Task>() }
                .and { it.arguments.startsWith(Runnable::class.type, INT_TYPE) }
    }

    class isClosed : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == BOOLEAN_TYPE }
    }

    @MethodParameters()
    class close : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == "join" } }
    }

    @DependsOn(Task::class)
    class current : OrderMapper.InConstructor.Field(TaskHandler::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == type<Task>() }
    }

    @DependsOn(Task::class)
    class task0 : OrderMapper.InConstructor.Field(TaskHandler::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == type<Task>() }
    }
}