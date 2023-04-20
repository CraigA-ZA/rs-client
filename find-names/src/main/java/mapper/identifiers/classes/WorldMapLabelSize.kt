package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import org.objectweb.asm.Type

class WorldMapLabelSize : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } == 3 }
            .and { it.instanceFields.size in 3..4 }
            .and { it.instanceMethods.any { it.arguments == listOf(Type.FLOAT_TYPE) && it.returnType == Type.BOOLEAN_TYPE } }
}