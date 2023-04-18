package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2
import org.objectweb.asm.Type.VOID_TYPE

@DependsOn(DualNode::class)
class DualNodeDeque : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == type<DualNode>() } }

    class sentinel : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { true }
    }

//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.opcode == GOTO } }
//    }

    @DependsOn(DualNode::class, DualNode.previousDual::class)
    class last : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<DualNode>() }
                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 1 }
                .and { it.instructions.none { it.isMethod } }
    }

//    @DependsOn(DualNode::class, DualNode.previousDual::class)
//    class removeLast : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<DualNode>() }
//                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 1 }
//                .and { it.instructions.any { it.isMethod } }
//    }

    @DependsOn(DualNode.previousDual::class)
    class addFirst : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 3 }
    }

    @DependsOn(DualNode.previousDual::class)
    class addLast : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 4 }
    }
}