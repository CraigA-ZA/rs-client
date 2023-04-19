package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Node
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Node::class)
class MusicPatch : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == ByteArray::class.type } == 3 }
            .and { it.instanceFields.count { it.type == ShortArray::class.type } == 1 }

//    @MethodParameters()
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.isEmpty() && it.returnType == Type.VOID_TYPE }
//    }
//
//    @DependsOn(RawSound::class)
//    class rawSounds : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<RawSound>().withDimensions(1) }
//    }
}