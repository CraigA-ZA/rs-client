package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.VOID_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.lang.reflect.Modifier

class Clock : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { !Modifier.isInterface(it.access)}
            .and { Modifier.isAbstract(it.access) }
            .and { it.instanceFields.isEmpty() }
            .and { it.instanceMethods.size == 2 }
            .and { it.instanceMethods.any { it.returnType == INT_TYPE } }


    @MethodParameters()
    class mark : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
    }

    @MethodParameters("cycleMs", "minSleepMs")
    class wait : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
    }
}