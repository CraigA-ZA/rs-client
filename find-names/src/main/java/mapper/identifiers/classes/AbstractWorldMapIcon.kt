package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

@DependsOn(Coord::class)
class AbstractWorldMapIcon : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 4 }
            .and { it.instanceFields.count { it.type == type<Coord>() } == 2 }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } == 2 }

    @DependsOn(Coord::class)
    class coord1 : OrderMapper.InConstructor.Field(AbstractWorldMapIcon::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Coord>() }
    }

    @DependsOn(Coord::class)
    class coord2 : OrderMapper.InConstructor.Field(AbstractWorldMapIcon::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Coord>() }
    }

    @MethodParameters()
    @DependsOn(WorldMapLabel::class)
    class label : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<WorldMapLabel>() }
    }

    @MethodParameters()
    class element : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
                .and { Modifier.isPublic(it.access) && Modifier.isAbstract(it.access) }
    }
}