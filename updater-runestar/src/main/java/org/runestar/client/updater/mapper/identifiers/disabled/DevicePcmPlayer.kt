package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import javax.sound.sampled.SourceDataLine

class DevicePcmPlayer : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { it.instanceFields.any { it.type == SourceDataLine::class.type } }

//    class format : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == AudioFormat::class.type }
//    }
//
//    class line : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == SourceDataLine::class.type }
//    }
//
//    @MethodParameters()
//    class discard : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::flush.name } }
//    }
//
//    @MethodParameters()
//    class close : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::close.name } }
//    }
//
//    @MethodParameters()
//    class write : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::write.name } }
//    }
//
//    @MethodParameters()
//    class position : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::available.name } }
//    }
//
//    @MethodParameters("bufferSize")
//    class open : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodName == SourceDataLine::start.name } }
//    }
//
//    class byteSamples : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
//    }
//
//    class capacity2 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
//    }
//
//    @MethodParameters()
//    class init : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.isEmpty() }
//                .and { it.instructions.any { it.opcode == Opcodes.I2F } }
//    }
}