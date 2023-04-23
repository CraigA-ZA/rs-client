package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

@DependsOn(Enumerated::class)
class MoveSpeed : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.contains(type<Enumerated>()) }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.count { it.type == BYTE_TYPE } == 1 }
            .and { it.instanceMethods.size == 1 }

    class speed : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BYTE_TYPE }
    }

    @DependsOn(MoveSpeed::class)
    class stationary : OrderMapper.InClassInitializer.Field(MoveSpeed::class, 0, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTSTATIC && it.fieldType == type<MoveSpeed>() }
    }

    @DependsOn(MoveSpeed::class)
    class crawl : OrderMapper.InClassInitializer.Field(MoveSpeed::class, 1, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTSTATIC && it.fieldType == type<MoveSpeed>() }
    }

    @DependsOn(MoveSpeed::class)
    class walk : OrderMapper.InClassInitializer.Field(MoveSpeed::class, 2, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTSTATIC && it.fieldType == type<MoveSpeed>() }
    }

    @DependsOn(MoveSpeed::class)
    class run : OrderMapper.InClassInitializer.Field(MoveSpeed::class, 3, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTSTATIC && it.fieldType == type<MoveSpeed>() }
    }
}