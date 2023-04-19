package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import java.lang.reflect.Modifier

@DependsOn(PcmPlayer::class)
class PcmPlayerProvider : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { Modifier.isInterface(it.access) }
            .and { it.instanceMethods.any { it.returnType == type<PcmPlayer>() } }

//    @DependsOn(PcmPlayer::class)
//    class player : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<PcmPlayer>() }
//    }
}