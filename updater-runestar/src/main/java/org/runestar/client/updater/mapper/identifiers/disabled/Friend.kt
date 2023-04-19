package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Buddy::class)
class Friend : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Buddy>() }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 2 }

//    @MethodParameters("other")
//    class compareTo00 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.arguments.startsWith(type<Friend>()) }
//    }
}