package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.security.SecureRandom
import java.util.concurrent.ExecutorService
import java.util.concurrent.Future

class SecureRandomFuture : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceMethods.any { it.returnType == SecureRandom::class.type } }

    @MethodParameters()
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == SecureRandom::class.type }
    }

    @MethodParameters()
    class shutdown : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
    }

    @MethodParameters()
    class isDone : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.BOOLEAN_TYPE }
    }

    class future : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Future::class.type }
    }

    class executor : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == ExecutorService::class.type }
    }
}