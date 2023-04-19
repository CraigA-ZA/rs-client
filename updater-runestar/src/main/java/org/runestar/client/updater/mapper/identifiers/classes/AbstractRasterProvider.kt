package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2
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

//    @MethodParameters()
//    class apply : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.size in 0..1 }
//    }

//    @DependsOn(apply::class)
//    class width : OrderMapper.InMethod.Field(apply::class, 0, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
//    }
//
//    @DependsOn(apply::class)
//    class height : OrderMapper.InMethod.Field(apply::class, 1, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == Type.INT_TYPE }
//    }
    //TODO fix
}