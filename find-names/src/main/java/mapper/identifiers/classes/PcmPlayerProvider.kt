package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.MethodWrapper
import java.lang.reflect.Modifier

@DependsOn(PcmPlayer::class)
class PcmPlayerProvider : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { Modifier.isInterface(it.access) }
            .and { it.instanceMethods.any { it.returnType == type<PcmPlayer>() } }

    @DependsOn(PcmPlayer::class)
    class player : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<PcmPlayer>() }
    }
}