package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import org.objectweb.asm.Type

@DependsOn(WorldMapSection::class, Packet.g1::class)
class WorldMapSection3 : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.contains(type<WorldMapSection>()) }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } == 10 }
            .and { it.instanceMethods.flatMap { it.instructions.toList() }.count { it.isMethod && it.methodId == method<Packet.g1>().id } == 2 }
}