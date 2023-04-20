package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

@DependsOn(Node::class, AbstractSound::class)
class PcmStream : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<AbstractSound>() } }

    class active : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BOOLEAN_TYPE }
    }

    @DependsOn(PcmStream::class)
    class after : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<PcmStream>() }
    }

    //TODO
//    @MethodParameters()
//    @DependsOn(PcmStreamMixer.firstSubStream::class)
//    class firstSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<PcmStreamMixer.firstSubStream>().mark }
//    }
//
//    @MethodParameters()
//    @DependsOn(PcmStreamMixer.nextSubStream::class)
//    class nextSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<PcmStreamMixer.nextSubStream>().mark }
//    }

    @MethodParameters("buffer", "start", "end")
    class fill : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(IntArray::class.type, Type.INT_TYPE, Type.INT_TYPE) }
                .and { Modifier.isAbstract(it.access) }
    }

    @MethodParameters("length")
    class skip : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE && it.arguments == listOf(Type.INT_TYPE) }
    }

    @MethodParameters("buffer", "start", "end")
    class update : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(IntArray::class.type, Type.INT_TYPE, Type.INT_TYPE) }
                .and { Modifier.isFinal(it.access) }
    }

    @DependsOn(AbstractSound::class)
    class sound : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<AbstractSound>() }
    }
}