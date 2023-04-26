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
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import java.lang.reflect.Modifier

class AbstractRasterProvider : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { Modifier.isAbstract(it.access) }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 1 }

    @MethodParameters("x", "y", "width", "height")
    class draw : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE) }
    }

    @MethodParameters("x", "y")
    class drawFull : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE) }
                .and { it.arguments.size in 2..3 }
    }

    class pixels : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == IntArray::class.type }
    }

    @MethodParameters()
    class apply : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.isEmpty() }
    }

    @DependsOn(apply::class)
    class width : OrderMapper.InMethod.Field(apply::class, 0, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }

    @DependsOn(apply::class)
    class height : OrderMapper.InMethod.Field(apply::class, 1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
    }
}