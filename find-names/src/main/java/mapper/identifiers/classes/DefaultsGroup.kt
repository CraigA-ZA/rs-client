package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import org.objectweb.asm.Type.INT_TYPE

class DefaultsGroup : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { it.instanceMethods.isEmpty() }
            .and { c -> c.staticFields.count { it.type == c.type } == 1 }

    class group : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }
}