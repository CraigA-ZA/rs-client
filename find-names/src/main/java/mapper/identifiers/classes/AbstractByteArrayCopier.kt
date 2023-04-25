package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

class AbstractByteArrayCopier : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.interfaces.isEmpty() }
            .and { Modifier.isAbstract(it.access) }
            .and { !Modifier.isInterface(it.access) }
            .and { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.any { it.returnType == ByteArray::class.type } }

    @MethodParameters()
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
    }

    @MethodParameters("array")
    class set : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
    }
}