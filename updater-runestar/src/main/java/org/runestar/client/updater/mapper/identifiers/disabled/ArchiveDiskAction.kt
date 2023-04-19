package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.ArchiveDisk
import org.runestar.client.updater.mapper.identifiers.classes.Node
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Node::class, ArchiveDisk::class)
class ArchiveDiskAction : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<ArchiveDisk>() } }

//    @DependsOn(ArchiveDisk::class)
//    class archiveDisk : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<ArchiveDisk>() }
//    }
//
//    @DependsOn(Archive::class)
//    class archive : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Archive>() }
//    }
//
//    class data : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
//    }
//
//    class type : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
//    }
}