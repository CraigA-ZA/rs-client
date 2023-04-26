package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(AbstractSound::class)
class RawSound : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<AbstractSound>() }

    class samples : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == ByteArray::class.type }
    }

    class sampleRate : OrderMapper.InConstructor.Field(RawSound::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size == 5 }
    }

    class start : OrderMapper.InConstructor.Field(RawSound::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size == 5 }
    }

    class end : OrderMapper.InConstructor.Field(RawSound::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size == 5 }
    }

    @MethodParameters("decimator")
    class resample : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { true }
    }
}