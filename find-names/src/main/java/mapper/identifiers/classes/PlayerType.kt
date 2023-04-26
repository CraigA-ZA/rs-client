package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(Enumerated::class)
class PlayerType : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.interfaces.contains(type<Enumerated>()) }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 2 }

    class id : OrderMapper.InConstructor.Field(PlayerType::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    // index into mod_icons sprites
    class modIcon : OrderMapper.InConstructor.Field(PlayerType::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    // is pmod or jmod
    class isPrivileged : OrderMapper.InConstructor.Field(PlayerType::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    // is not jmod
    class isUser : OrderMapper.InConstructor.Field(PlayerType::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }
}