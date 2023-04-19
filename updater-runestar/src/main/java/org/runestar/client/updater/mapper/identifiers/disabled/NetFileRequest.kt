package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.DualNode
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(DualNode::class, Archive::class)
class NetFileRequest : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.count { it.type == type<Archive>() } == 1 }

//    @DependsOn(Archive::class)
//    class archive : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Archive>() }
//    }
//
//    class crc : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
//    }
//
//    class padding : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Type.BYTE_TYPE }
//    }
}