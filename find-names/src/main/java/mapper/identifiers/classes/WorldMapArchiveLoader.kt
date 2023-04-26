package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type.*

@DependsOn(AbstractArchive::class)
class WorldMapArchiveLoader : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<AbstractArchive>() } == 1 }
            .and { it.instanceFields.count { it.type == String::class.type } == 1 }

    class percentLoaded0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE }
    }

    class cacheName : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }

    class isLoaded0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == BOOLEAN_TYPE }
    }

    @DependsOn(AbstractArchive::class)
    class archive : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<AbstractArchive>() }
    }

    @MethodParameters()
    class load : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.instructions.count() > 10 }
    }

    @MethodParameters()
    class percentLoaded : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.instructions.count() < 10 }
    }

    @MethodParameters()
    class isLoaded : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
    }

    @MethodParameters("cacheName")
    class reset : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
    }
}