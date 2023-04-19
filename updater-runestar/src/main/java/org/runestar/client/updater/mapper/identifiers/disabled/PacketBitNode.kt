package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Node
import org.runestar.client.updater.mapper.identifiers.classes.PacketBit
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Node::class, PacketBit::class)
class PacketBitNode : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<PacketBit>() } }

//    @DependsOn(PacketBit::class)
//    class bit : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<PacketBit>() }
//    }
}