package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Method2

@DependsOn(AbstractArchive::class)
class Fonts : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.count { it.type == HashMap::class.type } == 1 }
            .and { it.instanceFields.count { it.type == type<AbstractArchive>() } == 2 }

    class map : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == HashMap::class.type }
    }

    class createMap : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == HashMap::class.type }
    }
}