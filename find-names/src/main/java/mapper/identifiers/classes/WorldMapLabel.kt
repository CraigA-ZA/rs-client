package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(WorldMapLabelSize::class)
class WorldMapLabel : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<WorldMapLabelSize>() } }

    class text : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }

    class size : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<WorldMapLabelSize>() }
    }

    class width : OrderMapper.InConstructor.Field(WorldMapLabel::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class height : OrderMapper.InConstructor.Field(WorldMapLabel::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }
}