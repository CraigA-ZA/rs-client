package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.PUTFIELD
import org.objectweb.asm.Type.*

@DependsOn(Node::class)
class Texture : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 5 }

    class files : OrderMapper.InConstructor.Field(Texture::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class pixels : OrderMapper.InConstructor.Field(Texture::class, -1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class isLoaded : OrderMapper.InConstructor.Field(Texture::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class reset : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.instructions.count { it.isField } == 1 }
    }

    class int1 : OrderMapper.InConstructor.Field(Texture::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class animationDirection : OrderMapper.InConstructor.Field(Texture::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class animationSpeed : OrderMapper.InConstructor.Field(Texture::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters("n")
    class animate : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(INT_TYPE) }
    }
}