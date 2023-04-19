package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(Node::class)
class VorbisSample : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == ByteArray::class.type } == 1 }
            .and { it.instanceFields.count { it.type == BYTE_TYPE.withDimensions(2) } == 1 }

    @DependsOn(RawSound::class)
    class toRawSound : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<RawSound>() }
    }

    class decodeMeta : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(ByteArray::class.type) }
    }

    @DependsOn(decodeMeta::class)
    class sampleRate : OrderMapper.InMethod.Field(decodeMeta::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(decodeMeta::class)
    class sampleCount : OrderMapper.InMethod.Field(decodeMeta::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(decodeMeta::class)
    class start : OrderMapper.InMethod.Field(decodeMeta::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(decodeMeta::class)
    class end : OrderMapper.InMethod.Field(decodeMeta::class, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    class samples : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
    }

    class audioBlocks : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BYTE_TYPE.withDimensions(2) }
    }

    class decodeAudio : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == FLOAT_TYPE.withDimensions(1) }
    }
}