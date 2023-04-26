package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

@DependsOn(DualNode::class)
class IterableDualNodeQueue : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.contains(Iterable::class.type) }
            .and { it.instanceFields.size >= 1 }
            .and { it.instanceFields.all { it.type == type<DualNode>() } }

    class sentinel : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { Modifier.isPublic(it.access) }
    }

    class head : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { !Modifier.isPublic(it.access) }
    }

    @MethodParameters()
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.count() < 25 }
    }

    class add : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.count() > 25 }
    }
}