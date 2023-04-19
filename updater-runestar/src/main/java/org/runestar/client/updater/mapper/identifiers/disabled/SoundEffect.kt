package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Instrument::class)
class SoundEffect : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<Instrument>().withDimensions(1) } }

//    class instruments : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Instrument>().withDimensions(1) }
//    }
//
//    class start : OrderMapper.InConstructor.Field(SoundEffect::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class end : OrderMapper.InConstructor.Field(SoundEffect::class, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    @MethodParameters()
//    class mix : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.arguments.isEmpty() && it.returnType == ByteArray::class.type }
//    }
//
//    @MethodParameters()
//    @DependsOn(RawSound::class)
//    class toRawSound : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<RawSound>() }
//    }
}