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
import org.objectweb.asm.Type.*

class PlayerAppearance : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == LONG_TYPE } >= 2 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } >= 2 }

    //TODO
    @DependsOn(Model::class)
    class getModel : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<Model>() }
    }

//    class npcTransformId : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
//    }

    class isFemale : InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
    }

    @DependsOn(getModel::class)
    class equipment : OrderMapper.InMethod.Field(getModel::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == IntArray::class.type }
    }

//    @DependsOn(equipment::class)
//    class bodyColors : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == IntArray::class.type }
//                .and { it != field<equipment>() }
//    }

    @MethodParameters()
    class getChatHeadId : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
                .and { it.arguments.size in 0..1 }
    }

    @MethodParameters()
    @DependsOn(UnlitModel::class)
    class getChatHeadModel : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<UnlitModel>() }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class encode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments == listOf(type<Packet>()) }
    }
}