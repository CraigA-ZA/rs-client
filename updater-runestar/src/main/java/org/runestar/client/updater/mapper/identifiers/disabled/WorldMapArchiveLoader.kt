package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(AbstractArchive::class)
class WorldMapArchiveLoader : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<AbstractArchive>() } == 1 }
            .and { it.instanceFields.count { it.type == String::class.type } == 1 }

//    class percentLoaded0 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == INT_TYPE }
//    }
//
//    class cacheName : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == String::class.type }
//    }
//
//    class isLoaded0 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
//    }
//
//    @DependsOn(AbstractArchive::class)
//    class archive : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<AbstractArchive>() }
//    }

//    @MethodParameters()
//    class load : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.instructions.count() > 10 }
//    }

//    @MethodParameters()
//    class percentLoaded : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//                .and { it.instructions.count() < 10 }
//    }

//    @MethodParameters()
//    class isLoaded : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//    }
//
//    @MethodParameters("cacheName")
//    class reset : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//    }
}