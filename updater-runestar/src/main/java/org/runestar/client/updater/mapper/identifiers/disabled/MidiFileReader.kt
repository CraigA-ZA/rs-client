package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

class MidiFileReader : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 8 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } == 4 }

//    @DependsOn(Packet::class)
//    class packet : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Packet>() }
//    }
//
//    @MethodParameters()
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.isEmpty() && it.returnType == VOID_TYPE }
//                .and { it.instructions.count { it.opcode == ACONST_NULL } == 5 }
//    }
//
//    @MethodParameters("midi")
//    class parse : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments == listOf(ByteArray::class.type) }
//    }
//
//    @DependsOn(parse::class)
//    class trackStarts : OrderMapper.InMethod.Field(parse::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(parse::class)
//    class trackLengths : OrderMapper.InMethod.Field(parse::class, -2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(parse::class)
//    class trackPositions : OrderMapper.InMethod.Field(parse::class, -3) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(parse::class)
//    class division : OrderMapper.InMethod.Field(parse::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    @MethodParameters()
//    class isReady : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//                .and { it.instructions.any { it.opcode == IFNULL } }
//    }
//
//    @MethodParameters()
//    class trackCount : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.instructions.count() < 14 }
//                .and { it.instructions.any { it.opcode == ARRAYLENGTH } }
//    }
//
//    @MethodParameters("trackId")
//    class gotoTrack : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(INT_TYPE) }
//                .and { it.instructions.any { it.opcode == PUTFIELD } }
//    }
//
//    @MethodParameters("trackId")
//    class readTrackLength : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(INT_TYPE) }
//                .and { it.instructions.any { it.opcode == DUP2 } }
//    }
//
//    @MethodParameters("trackId")
//    @DependsOn(trackPositions::class)
//    class markTrackPosition : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(INT_TYPE) }
//                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<trackPositions>().id } }
//                .and { it.instructions.any { it.opcode == IASTORE } }
//    }
//
//    @MethodParameters()
//    class getPrioritizedTrack : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.arguments.isEmpty() }
//                .and { it.instructions.count() > 14 }
//    }
//
////    @MethodParameters() TODO
////    class setTrackDone : IdentityMapper.InstanceMethod() {
////        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
////                .and { it.arguments.isEmpty() }
////                .and { it.instructions.any { it.opcode == ICONST_M1 } }
////    }
//
//    @MethodParameters()
//    class isDone : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.isEmpty() }
//                .and { it.returnType == BOOLEAN_TYPE }
//                .and { it.instructions.none { it.opcode == IFNULL } }
//    }
//
//    @MethodParameters("trackId")
//    class readMessage : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.arguments == listOf(INT_TYPE) }
//                .and { it.instructions.count() < 15 }
//    }
//
//    @MethodParameters("trackId")
//    class readMessage0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.arguments == listOf(INT_TYPE) }
//                .and { it.instructions.count() > 15 }
//    }
//
//    class reset : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments == listOf(LONG_TYPE) }
//    }
}