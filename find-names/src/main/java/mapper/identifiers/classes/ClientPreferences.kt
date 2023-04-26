package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.Predicate
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE

class ClientPreferences : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.name == "du" }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 6 }
            .and { it.instanceFields.count { it.type == Map::class.type } == 1 }


    class parameters : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Map::class.type }
    }

    @MethodParameters()
    @DependsOn(Packet::class)
    class toBuffer : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Packet>() }
    }

    @DependsOn(toBuffer::class)
    class roofsHidden : OrderMapper.InMethod.Field(toBuffer::class, 0, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
    }

    @DependsOn(toBuffer::class)
    class titleMusicDisabled : OrderMapper.InMethod.Field(toBuffer::class, 1, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
    }

    @DependsOn(toBuffer::class)
    class hideUsername : OrderMapper.InMethod.Field(toBuffer::class, 2, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == BOOLEAN_TYPE && it.fieldOwner == type<ClientPreferences>() }
    }

    class rememberedUsername : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }

    @DependsOn(toBuffer::class)
    class windowMode : OrderMapper.InMethod.Field(toBuffer::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }
}