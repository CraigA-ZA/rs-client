package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type.*
import java.lang.reflect.Modifier

@DependsOn(Coord::class)
class WorldMapSection : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { Modifier.isInterface(it.access) }
            .and { it.instanceMethods.any { it.returnType == type<Coord>() } }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class read : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(type<Packet>()) }
    }

    @MethodParameters("area")
    @DependsOn(WorldMapArea::class)
    class expandBounds : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(type<WorldMapArea>()) }
    }

    @MethodParameters("plane", "x", "y")
    class position : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == IntArray::class.type }
    }

    @MethodParameters("x", "y")
    @DependsOn(Coord::class)
    class coord : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Coord>() }
    }

    @MethodParameters("x", "y")
    class containsPosition : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.arguments.size == 2 }
    }

    @MethodParameters("plane", "x", "y")
    class containsCoord : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.arguments.size == 3 }
    }
}