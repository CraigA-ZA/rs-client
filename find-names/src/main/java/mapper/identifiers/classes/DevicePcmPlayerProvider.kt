package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Method2

@DependsOn(PcmPlayerProvider::class)
class DevicePcmPlayerProvider : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<PcmPlayerProvider>()) }

    @DependsOn(PcmPlayer::class)
    class player : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == type<PcmPlayer>() }
    }
}