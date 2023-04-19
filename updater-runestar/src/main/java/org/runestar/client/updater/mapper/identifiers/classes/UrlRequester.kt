package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.net.URL
import java.util.*

class UrlRequester : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces == listOf(Runnable::class.type) }
            .and { it.instanceFields.count { it.type == Queue::class.type } == 1 }

    class requests : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Queue::class.type }
    }

    class thread : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Thread::class.type }
    }

    class isClosed : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BOOLEAN_TYPE }
    }

    @MethodParameters("url")
    class request : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments.startsWith(URL::class.type) }
    }

//    @MethodParameters()
//    class close : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.name != Runnable::run.name }
//    }
}