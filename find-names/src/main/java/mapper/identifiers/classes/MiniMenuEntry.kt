package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.StaticUniqueMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.nextWithin
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

class MiniMenuEntry : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.instanceFields.count { it.type == String::class.type } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 5}
            .and { it.instanceFields.size == 7 }

    @DependsOn(Client.menuArguments1::class)
    class argument1 : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == Opcodes.GETSTATIC && it.fieldId == field<Client.menuArguments1>().id }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuArguments2::class)
    class argument2 : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == Opcodes.GETSTATIC && it.fieldId == field<Client.menuArguments2>().id }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuOpcodes::class)
    class opcode : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == Opcodes.GETSTATIC && it.fieldId == field<Client.menuOpcodes>().id }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuArguments0::class)
    class argument0 : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(50) { it.opcode == Opcodes.GETSTATIC && it.fieldId == field<Client.menuArguments0>().id }
                .nextWithin(10) { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.menuActions::class)
    class action : StaticUniqueMapper.Field() {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.NEW && it.typeType == type<MiniMenuEntry>() }
                .nextWithin(100) { it.opcode == Opcodes.GETSTATIC && it.fieldId == field<Client.menuActions>().id }
                .nextWithin(50) { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<MiniMenuEntry>() && it.fieldType == String::class.type }
    }
    //This used to be 50/10 as well, but I stretched it pretty far cus it wasnt working. I could probably dial it back a lot
}