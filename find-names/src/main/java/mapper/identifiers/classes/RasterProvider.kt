package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import java.awt.Component
import java.awt.Image

@DependsOn(AbstractRasterProvider::class)
class RasterProvider : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<AbstractRasterProvider>() }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.any { it.type == Component::class.type } }

    class component0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Component::class.type }
    }

    class image : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Image::class.type }
    }

    @MethodParameters("x", "y", "width", "height")
    @DependsOn(AbstractRasterProvider.draw::class)
    class draw : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<AbstractRasterProvider.draw>().mark }
    }

    @MethodParameters("x", "y")
    @DependsOn(AbstractRasterProvider.drawFull::class)
    class drawFull : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<AbstractRasterProvider.drawFull>().mark }
    }

    @MethodParameters("graphics", "x", "y", "width", "height")
    @DependsOn(draw::class)
    class draw0 : OrderMapper.InMethod.Method(draw::class, 0, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<RasterProvider>() }
    }

    @MethodParameters("graphics", "x", "y")
    @DependsOn(drawFull::class)
    class drawFull0 : OrderMapper.InMethod.Method(drawFull::class, 0, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<RasterProvider>() }
    }

    @MethodParameters("c")
    class setComponent : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Component::class.type) }
    }
}