package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2

class Decimator : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.count { it.type == INT_TYPE.withDimensions(2) } == 1 }

//    class resample : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == ByteArray::class.type }
//    }
//
//    class inputRate : OrderMapper.InConstructor.Field(Decimator::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class outputRate : OrderMapper.InConstructor.Field(Decimator::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class table : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE.withDimensions(2) }
//    }
//
//    @MethodParameters("rate")
//    class scaleRate : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.instructions.none { it.opcode == BIPUSH && it.intOperand == 6 } }
//    }
//
//    @MethodParameters("position")
//    class scalePosition : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.instructions.any { it.opcode == BIPUSH && it.intOperand == 6 } }
//    }
}