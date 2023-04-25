package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

class World : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == INT_TYPE } >= 5 }
            .and { it.instanceFields.count { it.type == String::class.type } == 2 }
            .and { it.instanceFields.all { it.type == String::class.type || it.type == INT_TYPE } }
            .and { it.instanceMethods.isNotEmpty() }

    @DependsOn(Client.loadWorlds::class)
    class id : OrderMapper.InMethod.Field(Client.loadWorlds::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.loadWorlds::class)
    class properties : OrderMapper.InMethod.Field(Client.loadWorlds::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.loadWorlds::class)
    class location : OrderMapper.InMethod.Field(Client.loadWorlds::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.loadWorlds::class)
    class population : OrderMapper.InMethod.Field(Client.loadWorlds::class, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.loadWorlds::class)
    class index : OrderMapper.InMethod.Field(Client.loadWorlds::class, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(Client.loadWorlds::class)
    class host : OrderMapper.InMethod.Field(Client.loadWorlds::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
    }

    @DependsOn(Client.loadWorlds::class)
    class activity : OrderMapper.InMethod.Field(Client.loadWorlds::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
    }
}