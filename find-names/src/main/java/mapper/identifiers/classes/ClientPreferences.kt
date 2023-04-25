package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type.INT_TYPE

class ClientPreferences : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.name == "du" }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 6 }
            .and { it.instanceFields.count { it.type == Map::class.type } == 1 }

    //TODO
//    class windowMode : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
//    }


//    class parameters : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == LinkedHashMap::class.type }
//    }

    @MethodParameters()
    @DependsOn(Packet::class)
    class toBuffer : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Packet>() }
    }

//    @DependsOn(toBuffer::class)
//    class roofsHidden : OrderMapper.InMethod.Field(toBuffer::class, 0, 3) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
//    }

//    @DependsOn(toBuffer::class)
//    class titleMusicDisabled : OrderMapper.InMethod.Field(toBuffer::class, 1, 3) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
//    }

//    @DependsOn(toBuffer::class)
//    class hideUsername : OrderMapper.InMethod.Field(toBuffer::class, 2, 3) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
//    }

    class rememberedUsername : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }
}