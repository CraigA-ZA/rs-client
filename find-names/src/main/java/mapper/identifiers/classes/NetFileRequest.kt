package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import org.objectweb.asm.Type

@DependsOn(DualNode::class, Archive::class)
class NetFileRequest : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.count { it.type == type<Archive>() } == 1 }

    @DependsOn(Archive::class)
    class archive : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<Archive>() }
    }

    class crc : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
    }

    class padding : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BYTE_TYPE }
    }
}