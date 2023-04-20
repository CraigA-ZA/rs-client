package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.withDimensions
import mapper.wrappers.Class2
import org.objectweb.asm.Type.BYTE_TYPE

class ByteArrayPool : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.isEmpty() }
            .and { it.staticFields.count { it.type == BYTE_TYPE.withDimensions(2) } >= 3}
}