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

@DependsOn(AccessFile::class)
class BufferedFile : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<AccessFile>() } == 1 }

    @DependsOn(AccessFile::class)
    class accessFile : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<AccessFile>() }
    }

    @MethodParameters()
    @DependsOn(AccessFile.close::class)
    class close : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == method<AccessFile.close>().id } }
    }

    class capacity : OrderMapper.InConstructor.Field(BufferedFile::class, 3, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.LONG_TYPE }
    }

    class readBuffer : OrderMapper.InConstructor.Field(BufferedFile::class, 0, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == ByteArray::class.type }
    }

    class writeBuffer : OrderMapper.InConstructor.Field(BufferedFile::class, 1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == ByteArray::class.type }
    }

    @MethodParameters()
    class length : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.LONG_TYPE }
    }

    @MethodParameters("index")
    class seek : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.LONG_TYPE) }
    }

    @MethodParameters("dst", "dstIndex", "length")
    @DependsOn(AccessFile.read::class)
    class read : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type) }
                .and { it.instructions.any { it.isMethod && it.methodId == method<AccessFile.read>().id } }
    }

    @MethodParameters("dst")
    class readFill : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type) }
                .and { it.arguments.size in 1..2 }
    }

    @MethodParameters("src", "srcIndex", "length")
    @DependsOn(AccessFile.write::class)
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type) }
                .and { it.instructions.any { it.isMethod && it.methodId == method<AccessFile.write>().id } }
    }

    @MethodParameters()
    @DependsOn(AccessFile.write::class)
    class flush : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.isMethod && it.methodId == method<AccessFile.write>().id } }
    }

    @MethodParameters()
    @DependsOn(AccessFile.read::class)
    class load : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.isMethod && it.methodId == method<AccessFile.read>().id } }
    }
}