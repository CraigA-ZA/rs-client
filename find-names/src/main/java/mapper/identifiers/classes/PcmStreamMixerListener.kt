package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

@DependsOn(Node::class)
class PcmStreamMixerListener : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { Modifier.isAbstract(it.access) }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == Type.INT_TYPE } }
            .and { it.instanceMethods.size == 2 }

    @MethodParameters()
    class remove2 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() }
    }

    @MethodParameters("mixer")
    class update : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isNotEmpty() }
    }
}