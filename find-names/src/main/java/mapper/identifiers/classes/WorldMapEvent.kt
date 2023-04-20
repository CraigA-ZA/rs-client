package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

@DependsOn(Coord::class)
class WorldMapEvent : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceMethods.isEmpty() }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.count { it.type == type<Coord>() } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 1 }

    class mapElement : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }

    @DependsOn(Coord::class)
    class coord1 : OrderMapper.InConstructor.Field(WorldMapEvent::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Coord>() }
    }

    @DependsOn(Coord::class)
    class coord2 : OrderMapper.InConstructor.Field(WorldMapEvent::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Coord>() }
    }
}