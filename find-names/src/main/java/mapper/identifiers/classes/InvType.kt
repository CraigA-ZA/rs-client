package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.ICONST_2
import org.objectweb.asm.Type.INT_TYPE
import java.lang.reflect.Modifier

@DependsOn(DualNode::class)
class InvType : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { !Modifier.isAbstract(it.access) }
            .and { it.instanceMethods.any { it.instructions.any { it.opcode == ICONST_2 } } }

    class size : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { true }
    }

    @DependsOn(Packet::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.instructions.none { it.opcode == Opcodes.PUTFIELD } }
    }

    @DependsOn(Packet::class)
    class decode0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.instructions.any { it.opcode == Opcodes.PUTFIELD } }
    }
}