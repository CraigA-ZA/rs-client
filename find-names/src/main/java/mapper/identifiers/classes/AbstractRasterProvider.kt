package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import java.lang.reflect.Modifier

class AbstractRasterProvider : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { Modifier.isAbstract(it.access) }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 1 }

    @MethodParameters("x", "y", "width", "height")
    class draw : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE) }
    }

    @MethodParameters("x", "y")
    class drawFull : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE) }
                .and { it.arguments.size in 2..3 }
    }

    class pixels : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == IntArray::class.type }
    }

    //TODO
//    @MethodParameters()
//    class apply : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.size in 0..1 }
//    }

//    @DependsOn(apply::class)
//    class width : OrderMapper.InMethod.Field(apply::class, 0, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
//    }

//    @DependsOn(apply::class)
//    class height : OrderMapper.InMethod.Field(apply::class, 1, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
//    }
}