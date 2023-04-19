package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2

class CollisionMap : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 4 }
            .and { it.instanceFields.count { it.type == INT_TYPE.withDimensions(2) } == 1 }
            .and { it.instanceFields.size == 5 }

//    class flags : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE.withDimensions(2) }
//    }

//    class xInset : OrderMapper.InConstructor.Field(CollisionMap::class, 0, 4) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }

//    class yInset : OrderMapper.InConstructor.Field(CollisionMap::class, 1, 4) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }

//    class xSize : OrderMapper.InConstructor.Field(CollisionMap::class, -2, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
//    }

//    class ySize : OrderMapper.InConstructor.Field(CollisionMap::class, -1, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
//    }
//
//    @MethodParameters()
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE && it.arguments.isEmpty() }
//    }
}