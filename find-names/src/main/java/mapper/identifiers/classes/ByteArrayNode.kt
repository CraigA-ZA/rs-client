package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper

@DependsOn(Node::class)
class ByteArrayNode : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == ByteArray::class.type } }
            .and { it.instanceMethods.isEmpty() }

    class byteArray : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == ByteArray::class.type }
    }
}