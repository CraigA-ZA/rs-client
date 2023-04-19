package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.AllUniqueMapper
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.*
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2

@DependsOn(Node::class)
class ReflectionCheck : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == Array<java.lang.reflect.Field>::class.type } }
            .and { it.instanceFields.any { it.type == Array<java.lang.reflect.Method>::class.type } }

    class fields : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Array<java.lang.reflect.Field>::class.type }
    }

    class methods : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Array<java.lang.reflect.Method>::class.type }
    }

    class arguments : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BYTE_TYPE.withDimensions(3) }
    }

    class size : AllUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.NEW && it.typeType == type<ReflectionCheck>() }
                .nextWithin(15) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class id : AllUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.NEW && it.typeType == type<ReflectionCheck>() }
                .nextWithin(15) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class operations : AllUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.NEW && it.typeType == type<ReflectionCheck>() }
                .nextWithin(15) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class creationErrors : AllUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.NEW && it.typeType == type<ReflectionCheck>() }
                .nextWithin(15) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class intReplaceValues : AllUniqueMapper.Field() {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.NEW && it.typeType == type<ReflectionCheck>() }
                .nextWithin(15) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
                .nextWithin(20) { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }
}