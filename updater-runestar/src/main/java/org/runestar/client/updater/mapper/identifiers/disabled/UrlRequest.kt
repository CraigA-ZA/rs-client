package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import java.net.URL

class UrlRequest : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == URL::class.type } }

//    class url : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == URL::class.type }
//    }
//
//    class response0 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
//    }
//
//    @MethodParameters()
//    class getResponse : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == ByteArray::class.type }
//    }

//    class isDone0 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
//    }

//    @MethodParameters()
//    class isDone : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//    }
}