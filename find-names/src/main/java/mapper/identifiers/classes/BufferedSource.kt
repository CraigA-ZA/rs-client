package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
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
import java.io.IOException
import java.io.InputStream

class BufferedSource : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.interfaces.contains(Runnable::class.type) }
            .and { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == InputStream::class.type } == 1 }

    class thread : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Thread::class.type }
    }

    class inputStream : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == InputStream::class.type }
    }

    class exception : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == IOException::class.type }
    }

    class buffer : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == ByteArray::class.type }
    }

    @MethodParameters()
    class close : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == "join" } }
    }

    class position : OrderMapper.InConstructor.Field(BufferedSource::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class limit : OrderMapper.InConstructor.Field(BufferedSource::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class capacity : OrderMapper.InConstructor.Field(BufferedSource::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters("length")
    class isAvailable : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
    }

    @MethodParameters("dst", "dstIndex", "length")
    class read : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type) }
    }

    @MethodParameters()
    class available : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.none { it.opcode == Opcodes.IREM } }
    }

    @MethodParameters()
    class readUnsignedByte : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.opcode == Opcodes.IREM } }
    }
}