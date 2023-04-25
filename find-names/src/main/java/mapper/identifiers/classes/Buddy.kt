package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

@DependsOn(User::class)
class Buddy : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<User>() }
            .and { it.instanceFields.count() >= 3 }

    class world0 : OrderMapper.InConstructor.Field(Buddy::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class set : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 2..3 }
    }

    @DependsOn(set::class)
    class int2 : OrderMapper.InMethod.Field(set::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(world0::class, int2::class)
    class rank : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it != field<world0>() && it != field<int2>() }
    }

    @MethodParameters()
    class world : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
    }

    @MethodParameters()
    class hasWorld : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
    }
}