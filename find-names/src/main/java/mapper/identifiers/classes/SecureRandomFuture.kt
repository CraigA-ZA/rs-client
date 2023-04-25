package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type
import java.security.SecureRandom
import java.util.concurrent.ExecutorService
import java.util.concurrent.Future

class SecureRandomFuture : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceMethods.any { it.returnType == SecureRandom::class.type } }

    @MethodParameters()
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == SecureRandom::class.type }
    }

    @MethodParameters()
    class shutdown : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
    }

    @MethodParameters()
    class isDone : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
    }

    class future : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Future::class.type }
    }

    class executor : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == ExecutorService::class.type }
    }
}