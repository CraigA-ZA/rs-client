package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.*

class Node : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.instanceFields.size == 3 }
            .and { it.instanceFields.count { it.type == LONG_TYPE } == 1 }
            .and { it.superType == Any::class.type }
            .and { c -> c.instanceFields.count { it.type == c.type } == 2 }

    class key : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == LONG_TYPE }
    }

    @DependsOn(next::class)
    class previous : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<Node>() }
                .and { it != field<next>() }
    }

    @DependsOn(hasNext::class)
    class next : UniqueMapper.InMethod.Field(hasNext::class) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD }
    }

    @MethodParameters()
    class hasNext : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
    }

    @MethodParameters()
    class remove : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
    }
}