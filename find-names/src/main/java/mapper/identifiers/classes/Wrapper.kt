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
import org.objectweb.asm.Type.*
import java.lang.reflect.Modifier

@DependsOn(DualNode::class)
class Wrapper : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { Modifier.isAbstract(it.access) }
            .and { it.superType == type<DualNode>() }
            .and { it.instanceMethods.any { it.returnType == Any::class.type } }

    @MethodParameters()
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Any::class.type }
    }

    @MethodParameters()
    class isSoft : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
    }

    class size : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
    }
}