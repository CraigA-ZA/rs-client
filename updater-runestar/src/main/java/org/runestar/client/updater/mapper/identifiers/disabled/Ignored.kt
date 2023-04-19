package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.User
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(User::class)
class Ignored : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<User>() }
            .and { it.instanceFields.count() == 1 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 1 }

//    class id : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
//    }
//
//    @MethodParameters("other")
//    class compareTo00 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.arguments == listOf(type<Ignored>()) }
//    }
}