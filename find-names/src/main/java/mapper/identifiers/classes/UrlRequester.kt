package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
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