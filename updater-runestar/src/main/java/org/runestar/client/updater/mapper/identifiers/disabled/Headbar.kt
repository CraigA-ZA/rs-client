package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.Node
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Node::class, IterableNodeDeque::class)
class Headbar : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.size == 2 }
            .and { it.instanceFields.count { it.type == type<IterableNodeDeque>() } == 1 }
            .and { it.instanceFields.all { it.type in it.jar } }

//    @DependsOn(IterableNodeDeque::class)
//    class type : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type != type<IterableNodeDeque>() }
//    }
//
//    @DependsOn(IterableNodeDeque::class)
//    class updates : InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeDeque>() }
//    }
//
//    @MethodParameters()
//    class isEmpty : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//    }
//
//    @MethodParameters("cycle")
//    @DependsOn(HeadbarUpdate::class)
//    class get : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<HeadbarUpdate>() }
//    }
//
////    @MethodParameters
//    class put : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//    }
}