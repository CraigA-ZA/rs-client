package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.ICONST_2
import org.objectweb.asm.Type.INT_TYPE
import java.lang.reflect.Modifier

@DependsOn(DualNode::class)
class InvType : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<DualNode>() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { !Modifier.isAbstract(it.access) }
            .and { it.instanceMethods.any { it.instructions.any { it.opcode == ICONST_2 } } }

    class size : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { true }
    }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.instructions.none { it.opcode == Opcodes.PUTFIELD } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.instructions.any { it.opcode == Opcodes.PUTFIELD } }
    }
}