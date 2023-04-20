package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

@DependsOn(DualNode::class)
class DualNodeDeque : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == type<DualNode>() } }

    class sentinel : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { true }
    }

    //TODO
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.instructions.any { it.opcode == Opcodes.GOTO } }
//    }
//    @DependsOn(DualNode::class, DualNode.previousDual::class)
//    class removeLast : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<DualNode>() }
//                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 1 }
//                .and { it.instructions.any { it.isMethod } }
//    }

    @DependsOn(DualNode::class, DualNode.previousDual::class)
    class last : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<DualNode>() }
                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 1 }
                .and { it.instructions.none { it.isMethod } }
    }


    @DependsOn(DualNode.previousDual::class)
    class addFirst : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 3 }
    }

    @DependsOn(DualNode.previousDual::class)
    class addLast : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.filter { it.isField && it.fieldId == field<DualNode.previousDual>().id }.count() == 4 }
    }
}