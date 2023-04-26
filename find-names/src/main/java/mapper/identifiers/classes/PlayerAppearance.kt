package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

class PlayerAppearance : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == LONG_TYPE } >= 2 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } >= 2 }


    @DependsOn(Model::class)
    class getModel : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Model>() }
    }


    class isFemale : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == BOOLEAN_TYPE }
    }

    @DependsOn(getModel::class)
    class equipment : OrderMapper.InMethod.Field(getModel::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == IntArray::class.type }
    }

    //Not 100% how to fix this one, but its the only int thats not in the static initializer
//    class npcTransformId : InstanceField() {
//        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
//    }

    @MethodParameters()
    class getChatHeadId : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.arguments.size in 0..1 }
    }

    @MethodParameters()
    @DependsOn(UnlitModel::class)
    class getChatHeadModel : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<UnlitModel>() }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class encode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments == listOf(type<Packet>()) }
    }
}