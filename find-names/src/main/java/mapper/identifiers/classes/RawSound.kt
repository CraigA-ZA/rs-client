package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(AbstractSound::class)
class RawSound : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<AbstractSound>() }

    class samples : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
    }

    class sampleRate : OrderMapper.InConstructor.Field(RawSound::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 5 }
    }

    class start : OrderMapper.InConstructor.Field(RawSound::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 5 }
    }

    class end : OrderMapper.InConstructor.Field(RawSound::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 5 }
    }

    @MethodParameters("decimator")
    class resample : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { true }
    }
}