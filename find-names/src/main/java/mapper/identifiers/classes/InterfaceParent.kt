package mapper.identifiers.classes

import mapper.*
import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.*
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE

@DependsOn(Node::class)
class InterfaceParent : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 2 }

//    @DependsOn(NodeHashTable.first::class)
//    class type : StaticUniqueMapper.Field() {
//        override val predicate = predicateOf<Instruction2> { it.opcode == INVOKEVIRTUAL && it.methodId == method<NodeHashTable.first>().id }
//                .nextIn(1) { it.opcode == CHECKCAST && it.typeType == type<InterfaceParent>() }
//                .nextWithin(23) { it.opcode == ICONST_3 }
//                .prevWithin(10) { it.opcode == GETFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<InterfaceParent>() }
//    }

//    @DependsOn(type::class)
//    class itf : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE && it != field<type>() }
//    }
    //TODO

    class keep : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
    }
}