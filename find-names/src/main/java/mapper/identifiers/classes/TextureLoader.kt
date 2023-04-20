package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Method2
import org.objectweb.asm.Type.BOOLEAN_TYPE
import java.lang.reflect.Modifier

class TextureLoader : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { Modifier.isInterface(it.access) }
            .and { it.instanceMethods.size == 4 }
            .and { it.instanceMethods.count { it.returnType == BOOLEAN_TYPE } == 2 }

    @MethodParameters()
    class load : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == IntArray::class.type }
    }

    //TODO
//    @DependsOn(TextureProvider.isLowDetail::class)
//    class isLowDetail : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<TextureProvider.isLowDetail>().mark }
//    }
}