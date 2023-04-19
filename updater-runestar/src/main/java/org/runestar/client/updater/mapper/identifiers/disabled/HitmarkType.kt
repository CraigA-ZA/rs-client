package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.DualNode
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(DualNode::class)
class HitmarkType : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.count { it.type == String::class.type } == 1 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } >= 14 }

//    @DependsOn(Packet::class)
//    class decode : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.none { it.opcode == BIPUSH && it.intOperand == 17 } }
//    }
//
//    @DependsOn(Packet::class)
//    class decode0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.any { it.opcode == BIPUSH && it.intOperand == 17 } }
//    }
//
//    @MethodParameters()
//    @DependsOn(Font::class)
//    class getFont : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<Font>() }
//    }
//
//    @MethodParameters("n")
//    class getString : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
//    }
//
//    @MethodParameters()
//    class transform : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<HitmarkType>() }
//    }
//
//    class transforms : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == IntArray::class.type }
//    }
//
//    class fontId : ConstructorPutField(HitmarkType::class, 0, INT_TYPE)
//    class transformVarbit : ConstructorPutField(HitmarkType::class, 12, INT_TYPE)
//    class transformVarp : ConstructorPutField(HitmarkType::class, 13, INT_TYPE)
//
//    class format : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == String::class.type }
//    }
}