package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Wrapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Wrapper::class)
class DirectWrapper : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Wrapper>() }
            .and { it.instanceFields.any { it.type == Any::class.type } }

//    class obj : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Any::class.type }
//    }
//
//    @MethodParameters()
//    @DependsOn(Wrapper.get::class)
//    class get : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<Wrapper.get>().mark }
//    }
//
//    @MethodParameters()
//    @DependsOn(Wrapper.get::class, Wrapper.isSoft::class)
//    class isSoft : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<Wrapper.isSoft>().mark }
//    }
}