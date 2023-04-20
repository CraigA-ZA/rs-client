package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

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