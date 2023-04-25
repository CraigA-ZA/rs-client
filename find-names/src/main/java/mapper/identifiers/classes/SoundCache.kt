package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper

@DependsOn(NodeHashTable::class)
class SoundCache : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 4 }
            .and { it.instanceFields.count { it.type == type<NodeHashTable>() } == 2 }

    //TODO
//    @DependsOn(Client.readSoundEffect::class)
//    class getSoundEffect0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.size == 3 }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<Client.readSoundEffect>().id } }
//    }
//
//    @DependsOn(Client.readVorbisSample::class)
//    class getVorbisSample0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.size == 3 }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<Client.readVorbisSample>().id } }
//    }

//    @DependsOn(getSoundEffect0::class)
//    class getSoundEffect : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.size == 2 }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<getSoundEffect0>().id } }
//    }
//
//    @DependsOn(getVorbisSample0::class)
//    class getVorbisSample : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.size == 2 }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<getVorbisSample0>().id } }
//    }

//    @DependsOn(AbstractArchive::class, getSoundEffect0::class)
//    class soundEffectIndex : UniqueMapper.InMethod.Field(getSoundEffect0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == type<AbstractArchive>() }
//    }
//
//    @DependsOn(AbstractArchive::class, getVorbisSample0::class)
//    class vorbisSampleIndex : UniqueMapper.InMethod.Field(getVorbisSample0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == type<AbstractArchive>() }
//    }
//
//    @DependsOn(getSoundEffect0::class, NodeHashTable::class)
//    class rawSounds : UniqueMapper.InMethod.Field(getSoundEffect0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == type<NodeHashTable>() }
//    }
//
//    @DependsOn(getVorbisSample0::class, NodeHashTable::class, rawSounds::class)
//    class vorbisSamples : UniqueMapper.InMethod.Field(getVorbisSample0::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == type<NodeHashTable>() && it.fieldId != field<rawSounds>().id }
//    }
}