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
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(Rasterizer2D::class, Client.worldToMinimap::class)
class Sprite : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Rasterizer2D>() }
            .and { c -> method<Client.worldToMinimap>().arguments.first { it in c.jar } == c.type }

    class pixels : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == IntArray::class.type }
    }

    class width : OrderMapper.InConstructor.Field(Sprite::class, 0, 6) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size >= 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class subWidth : OrderMapper.InConstructor.Field(Sprite::class, 1, 6) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size >= 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class height : OrderMapper.InConstructor.Field(Sprite::class, 2, 6) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size >= 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class subHeight : OrderMapper.InConstructor.Field(Sprite::class, 3, 6) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size >= 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class xOffset : OrderMapper.InConstructor.Field(Sprite::class, 4, 6) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size >= 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class yOffset : OrderMapper.InConstructor.Field(Sprite::class, 5, 6) {
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.size >= 3 }
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

//    @MethodParameters()
//    class copy : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<Sprite>() }
//                .and { it.instructions.any { it.opcode == Opcodes.ISUB } }
//    }
//
//    @MethodParameters()
//    class copyNormalized : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<Sprite>() }
//                .and { it.instructions.none { it.opcode == Opcodes.ISUB } }
//    }

    @MethodParameters()
    @DependsOn(subWidth::class)
    class normalize : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.isEmpty() }
                .and { it.instructions.any { it.opcode == Opcodes.PUTFIELD && it.fieldId == field<subWidth>().id } }
    }
}