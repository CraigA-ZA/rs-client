package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import java.security.SecureRandom

class SecureRandomFuture : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceMethods.any { it.returnType == SecureRandom::class.type } }

//    @MethodParameters()
//    class get : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == SecureRandom::class.type }
//    }
//
//    @MethodParameters()
//    class shutdown : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//    }
//
//    @MethodParameters()
//    class isDone : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//    }
//
//    class future : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Future::class.type }
//    }
//
//    class executor : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == ExecutorService::class.type }
//    }
}