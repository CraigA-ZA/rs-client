package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.identifiers.classes.Link
import org.runestar.client.updater.mapper.identifiers.classes.Username
import org.runestar.client.updater.mapper.wrappers.Field2

@DependsOn(Link::class)
class FriendLoginUpdate : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Link>() }
            .and { it.instanceFields.size == 3 }

    @DependsOn(Username::class)
    class username : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<Username>() }
    }

    class time : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
    }

    class world : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == SHORT_TYPE }
    }
}