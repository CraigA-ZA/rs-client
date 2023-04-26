package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

@DependsOn(IndexedSprite::class)
class WorldMapManager : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.constructors.isNotEmpty() }
            .and { it.constructors.first().arguments.startsWith(listOf(type<IndexedSprite>().withDimensions(1), HashMap::class.type)) }

    @DependsOn(IndexedSprite::class)
    class mapSceneSprites : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<IndexedSprite>().withDimensions(1) }
    }

    @DependsOn(WorldMapRegion::class)
    class regions : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<WorldMapRegion>().withDimensions(2) }
    }

    class fonts : OrderMapper.InConstructor.Field(WorldMapManager::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == HashMap::class.type }
    }

    @MethodParameters()
    class buildIcons : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == HashMap::class.type }
    }

    @DependsOn(buildIcons::class)
    class icons : UniqueMapper.InMethod.Field(buildIcons::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isField }
    }

    class drawOverview : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.size == 7 }
    }

    @MethodParameters("indexCache", "cacheName", "isMembersWorld")
    @DependsOn(AbstractArchive::class)
    class load : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(type<AbstractArchive>()) }
    }

    @MethodParameters()
    class clearIcons : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE && it.arguments.isEmpty() }
                .and { it.instructions.count() < 10 }
    }

    @MethodParameters()
    @DependsOn(buildIcons::class)
    class buildIcons0 : UniqueMapper.InMethod.Method(buildIcons::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
    }
    @DependsOn(Sprite::class)
    class overviewSprite : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Sprite>() }
    }


    @DependsOn(WorldMapAreaData::class)
    class mapAreaData : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<WorldMapAreaData>() }
    }

    class isLoaded0 : OrderMapper.InConstructor.Field(WorldMapManager::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }

    @MethodParameters()
    class isLoaded : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
    }

    class loadStarted : OrderMapper.InConstructor.Field(WorldMapManager::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }
}