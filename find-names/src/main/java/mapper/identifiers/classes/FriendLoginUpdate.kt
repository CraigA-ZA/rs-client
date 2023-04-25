package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import org.objectweb.asm.Type.*

@DependsOn(Link::class)
class FriendLoginUpdate : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Link>() }
            .and { it.instanceFields.size == 3 }

    @DependsOn(Username::class)
    class username : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Username>() }
    }

    class time : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
    }

    class world : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == SHORT_TYPE }
    }
}