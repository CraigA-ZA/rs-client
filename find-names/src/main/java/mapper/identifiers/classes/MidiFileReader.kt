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
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

class MidiFileReader : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 8 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 4 }

    @DependsOn(Packet::class)
    class packet : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Packet>() }
    }

    @MethodParameters()
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() && it.returnType == Type.VOID_TYPE }
                .and { it.instructions.count { it.opcode == Opcodes.ACONST_NULL } == 5 }
    }

    @MethodParameters("midi")
    class parse : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments == listOf(ByteArray::class.type) }
    }

    @DependsOn(parse::class)
    class trackStarts : OrderMapper.InMethod.Field(parse::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(parse::class)
    class trackLengths : OrderMapper.InMethod.Field(parse::class, -2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(parse::class)
    class trackPositions : OrderMapper.InMethod.Field(parse::class, -3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(parse::class)
    class division : OrderMapper.InMethod.Field(parse::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    class isReady : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.IFNULL } }
    }

    @MethodParameters()
    class trackCount : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.count() < 14 }
                .and { it.instructions.any { it.opcode == Opcodes.ARRAYLENGTH } }
    }

    @MethodParameters("trackId")
    class gotoTrack : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
                .and { it.instructions.any { it.opcode == Opcodes.PUTFIELD } }
    }

    @MethodParameters("trackId")
    class readTrackLength : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
                .and { it.instructions.any { it.opcode == Opcodes.DUP2 } }
    }

    @MethodParameters("trackId")
    @DependsOn(trackPositions::class)
    class markTrackPosition : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<trackPositions>().id } }
                .and { it.instructions.any { it.opcode == Opcodes.IASTORE } }
    }

    @MethodParameters()
    class getPrioritizedTrack : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.isEmpty() }
                .and { it.instructions.count() > 14 }
    }

//    @MethodParameters() TODO
//    class setTrackDone : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.isEmpty() }
//                .and { it.instructions.any { it.opcode == ICONST_M1 } }
//    }

    @MethodParameters()
    class isDone : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() }
                .and { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.instructions.none { it.opcode == Opcodes.IFNULL } }
    }

    @MethodParameters("trackId")
    class readMessage : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
                .and { it.instructions.count() < 15 }
    }

    @MethodParameters("trackId")
    class readMessage0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments == listOf(Type.INT_TYPE) }
                .and { it.instructions.count() > 15 }
    }

    class reset : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments == listOf(Type.LONG_TYPE) }
    }
}