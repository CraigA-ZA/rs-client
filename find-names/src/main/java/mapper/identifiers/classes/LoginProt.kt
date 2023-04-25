package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import org.objectweb.asm.Type.*

@DependsOn(ClientProt0::class)
class LoginProt : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.interfaces.contains(type<ClientProt0>()) }
            .and { it.instanceFields.size == 1 }

    class id : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
    }
}