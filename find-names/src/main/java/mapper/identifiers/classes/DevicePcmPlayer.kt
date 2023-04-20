package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import javax.sound.sampled.AudioFormat
import javax.sound.sampled.SourceDataLine

class DevicePcmPlayer : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { it.instanceFields.any { it.type == SourceDataLine::class.type } }

    class format : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == AudioFormat::class.type }
    }

    class line : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == SourceDataLine::class.type }
    }

    @MethodParameters()
    class discard : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::flush.name } }
    }

    @MethodParameters()
    class close : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::close.name } }
    }

    @MethodParameters()
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::write.name } }
    }

    @MethodParameters()
    class position : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::available.name } }
    }

    @MethodParameters("bufferSize")
    class open : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::start.name } }
    }

    class byteSamples : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
    }

    class capacity2 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
    }

    @MethodParameters()
    class init : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.isEmpty() }
                .and { it.instructions.any { it.opcode == Opcodes.I2F } }
    }
}