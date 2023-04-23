package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

class Username : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(Comparable::class.type) }
            .and { it.instanceFields.count() == 2 }
            .and { it.instanceFields.count { it.type == String::class.type } == 2 }

//    class name0 : OrderMapper.InConstructor.Field(Username::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
//    }
//
//    class cleanName : OrderMapper.InConstructor.Field(Username::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
//    }
    //TODO

//    @MethodParameters()
//    class name : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
//                .and { it.name != "toString" }
//    }

    @MethodParameters("other")
    class compareTo0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.startsWith(type<Username>()) }
    }

    @MethodParameters()
    class hasCleanName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.name != "equals" }
    }
}