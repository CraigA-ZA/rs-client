package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2

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