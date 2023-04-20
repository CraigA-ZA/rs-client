package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import org.objectweb.asm.Type

@DependsOn(StudioGame::class)
class Enumerated : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { klass<StudioGame>().interfaces.contains(it.type) }

    @MethodParameters()
    class ordinal : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
    }
}