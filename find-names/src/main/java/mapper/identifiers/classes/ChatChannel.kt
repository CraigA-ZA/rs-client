package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(Message::class)
class ChatChannel : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<Message>().withDimensions(1) } }

    @MethodParameters("type", "sender", "text", "prefix")
    @DependsOn(Message::class)
    class addMessage : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<Message>() }
                .and { it.arguments.startsWith(Type.INT_TYPE, String::class.type, String::class.type, String::class.type) }
    }

    @DependsOn(Message::class)
    class messages : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<Message>().withDimensions(1) }
    }

    class count : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
    }

    @MethodParameters("index")
    @DependsOn(Message::class)
    class getMessage : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<Message>() }
                .and { it.arguments.size in 1..2 }
    }

    @MethodParameters()
    class size : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
    }
}