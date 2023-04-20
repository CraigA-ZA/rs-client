package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import org.objectweb.asm.Type.*

@DependsOn(ClientProt0::class)
class LoginProt : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<ClientProt0>()) }
            .and { it.instanceFields.size == 1 }

    class id : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }
}