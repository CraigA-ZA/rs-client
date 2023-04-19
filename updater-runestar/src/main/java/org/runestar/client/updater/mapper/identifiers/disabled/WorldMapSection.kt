package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Coord
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import java.lang.reflect.Modifier

@DependsOn(Coord::class)
class WorldMapSection : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { Modifier.isInterface(it.access) }
            .and { it.instanceMethods.any { it.returnType == type<Coord>() } }

//    @MethodParameters("packet")
//    @DependsOn(Packet::class)
//    class read : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(type<Packet>()) }
//    }
//
//    @MethodParameters("area")
//    @DependsOn(WorldMapArea::class)
//    class expandBounds : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(type<WorldMapArea>()) }
//    }
//
//    @MethodParameters("plane", "x", "y")
//    class position : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == IntArray::class.type }
//    }
//
//    @MethodParameters("x", "y")
//    @DependsOn(Coord::class)
//    class coord : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<Coord>() }
//    }
//
//    @MethodParameters("x", "y")
//    class containsPosition : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//                .and { it.arguments.size == 2 }
//    }
//
//    @MethodParameters("plane", "x", "y")
//    class containsCoord : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//                .and { it.arguments.size == 3 }
//    }
}