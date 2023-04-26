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

// https://en.wikipedia.org/wiki/Indexed_color
@DependsOn(Rasterizer2D::class)
class IndexedSprite : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Rasterizer2D>() }
            .and { it.instanceFields.count { it.type == ByteArray::class.type } == 1 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 1 }

    @MethodParameters()
    class normalize : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size in 0..1 }
    }

    class palette : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == IntArray::class.type }
    }

    class pixels : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == ByteArray::class.type }
    }

    @DependsOn(normalize::class)
    class width : OrderMapper.InMethod.Field(normalize::class, -2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldOwner == type<IndexedSprite>() }
    }

    @DependsOn(normalize::class)
    class height : OrderMapper.InMethod.Field(normalize::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.GETFIELD && it.fieldOwner == type<IndexedSprite>() }
    }

    @DependsOn(normalize::class)
    class xOffset : OrderMapper.InMethod.Field(normalize::class, -2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<IndexedSprite>() }
    }

    @DependsOn(normalize::class)
    class yOffset : OrderMapper.InMethod.Field(normalize::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<IndexedSprite>() }
    }

    @DependsOn(normalize::class)
    class subWidth : OrderMapper.InMethod.Field(normalize::class, -4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<IndexedSprite>() }
    }

    @DependsOn(normalize::class)
    class subHeight : OrderMapper.InMethod.Field(normalize::class, -3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldOwner == type<IndexedSprite>() }
    }

    @MethodParameters("r", "g", "b")
    class shiftColors : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size == 3 }
                .and { it.arguments.all { it == Type.INT_TYPE } }
    }
}