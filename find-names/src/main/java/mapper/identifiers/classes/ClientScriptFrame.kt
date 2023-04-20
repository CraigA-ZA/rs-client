package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import org.objectweb.asm.Type

@DependsOn(ClientScript::class)
class ClientScriptFrame : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<ClientScript>() } == 1 }
            .and { it.instanceFields.count { it.type == Array<String>::class.type } == 1 }

    @DependsOn(ClientScript::class)
    class script : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<ClientScript>() }
    }

    class stringLocals : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Array<String>::class.type }
    }

    class pc : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
    }

    class intLocals : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == IntArray::class.type }
    }
}