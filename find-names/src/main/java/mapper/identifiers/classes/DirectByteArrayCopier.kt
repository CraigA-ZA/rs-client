package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import java.nio.ByteBuffer

@DependsOn(AbstractByteArrayCopier::class)
class DirectByteArrayCopier : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<AbstractByteArrayCopier>() }

    @MethodParameters()
    @DependsOn(AbstractByteArrayCopier.get::class)
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<AbstractByteArrayCopier.get>().mark }
    }

    @MethodParameters("array")
    @DependsOn(AbstractByteArrayCopier.set::class)
    class set : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<AbstractByteArrayCopier.set>().mark }
    }

    class directBuffer : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == ByteBuffer::class.type }
    }
}