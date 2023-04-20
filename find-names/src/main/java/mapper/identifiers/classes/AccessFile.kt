package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.*
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import java.io.RandomAccessFile

class AccessFile : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == RandomAccessFile::class.type } == 1 }

    class file : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == RandomAccessFile::class.type }
    }

    class capacity : OrderMapper.InConstructor.Field(AccessFile::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.LONG_TYPE }
    }

    class index : OrderMapper.InConstructor.Field(AccessFile::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.LONG_TYPE }
    }

    @MethodParameters("sync")
    class closeSync : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == RandomAccessFile::close.id } }
    }

    @MethodParameters()
    @DependsOn(closeSync::class)
    class close : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == method<closeSync>().id } }
    }

    @MethodParameters("index")
    class seek : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.LONG_TYPE) }
                .and { it.instructions.any { it.isMethod && it.methodId == RandomAccessFile::seek.id } }
    }

    @MethodParameters()
    class length : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.LONG_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == RandomAccessFile::length.id } }
    }

    @MethodParameters("dst", "dstIndex", "length")
    class read : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type, Type.INT_TYPE, Type.INT_TYPE) }
    }

    @MethodParameters("src", "srcIndex", "length")
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type, Type.INT_TYPE, Type.INT_TYPE) }
    }
}