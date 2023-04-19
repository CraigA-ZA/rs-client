package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.wrappers.Field2
import java.lang.reflect.Modifier

@DependsOn(Node::class)
class IntegerNode : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { !Modifier.isAbstract(it.access) }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 1 }
            .and { it.instanceFields.all { it.type == Type.INT_TYPE } }
            .and { it.instanceMethods.isEmpty() }

    class integer : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
    }
}