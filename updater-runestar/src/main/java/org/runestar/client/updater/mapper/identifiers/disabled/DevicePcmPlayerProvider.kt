package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(PcmPlayerProvider::class)
class DevicePcmPlayerProvider : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<PcmPlayerProvider>()) }

//    @DependsOn(PcmPlayer::class)
//    class player : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<PcmPlayer>() }
//    }
}