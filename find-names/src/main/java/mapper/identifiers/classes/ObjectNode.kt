package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper

@DependsOn(Node::class)
class ObjectNode : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == Any::class.type } }
            .and { it.instanceMethods.isEmpty() }

    class obj : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Any::class.type }
    }
}