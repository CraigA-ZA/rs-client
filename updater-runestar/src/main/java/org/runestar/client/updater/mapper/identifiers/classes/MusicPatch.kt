package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type.VOID_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.predicateutilities.withDimensions
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.lang.reflect.Type

@DependsOn(Node::class)
class MusicPatch : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == ByteArray::class.type } == 3 }
            .and { it.instanceFields.count { it.type == ShortArray::class.type } == 1 }

    @MethodParameters()
    class clear : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments.isEmpty() && it.returnType == VOID_TYPE }
    }

    @DependsOn(RawSound::class)
    class rawSounds : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<RawSound>().withDimensions(1) }
    }
}