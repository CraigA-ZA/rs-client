package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.identifiers.classes.*
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(PcmStream::class)
class MidiPcmStream : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<PcmStream>() }
            .and { it.instanceFields.size == 27 }

    @DependsOn(NodeHashTable::class)
    class musicPatches : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<NodeHashTable>() }
    }

    @MethodParameters()
    @DependsOn(Node.remove::class)
    class removeAll : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() && it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodMark == method<Node.remove>().mark } }
    }

    @MethodParameters()
    @DependsOn(MusicPatch.clear::class)
    class clearAll : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() && it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodId == method<MusicPatch.clear>().id } }
    }

    @DependsOn(MidiFileReader::class)
    class midiFile : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<MidiFileReader>() }
    }

    @DependsOn(MusicPatchPcmStream::class)
    class patchStream : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<MusicPatchPcmStream>() }
    }

    @MethodParameters("musicTrack", "i", "s", "frequency")
    @DependsOn(MusicTrack::class, AbstractArchive::class)
    class loadMusicTrack : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.startsWith(type<MusicTrack>(), type<AbstractArchive>()) }
    }

    @MethodParameters("musicTrack", "b")
    @DependsOn(MusicTrack::class)
    class setMusicTrack : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments == listOf(type<MusicTrack>(), BOOLEAN_TYPE) }
    }

    @DependsOn(setMusicTrack::class)
    class track : OrderMapper.InMethod.Field(setMusicTrack::class, -2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(setMusicTrack::class)
    class trackLength : OrderMapper.InMethod.Field(setMusicTrack::class, -1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

//    @MethodParameters()
//    @DependsOn(MidiFileReader.clear::class)
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.isEmpty() && it.returnType == VOID_TYPE }
//                .and { it.instructions.count() < 15 }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<MidiFileReader.clear>().id } }
//    }
    //TODO

    @MethodParameters()
    class isReady : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() && it.returnType == BOOLEAN_TYPE }
    }
}