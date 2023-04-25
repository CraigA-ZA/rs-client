package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionMapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE

@DependsOn(Entity::class)
class Scenery : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.instanceMethods.isEmpty() }
            .and { it.instanceFields.count { it.type == INT_TYPE } >= 12 }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 1 }

    @DependsOn(Entity::class)
    class entity : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Entity>() }
    }

    //TODO fix
//    class tag : ConstructorPutField(Scenery::class, 0, LONG_TYPE)

    @DependsOn(Scene.newScenery::class)
    class flags : OrderMapper.InMethod.Field(Scene.newScenery::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class plane : OrderMapper.InMethod.Field(Scene.newScenery::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class centerX : OrderMapper.InMethod.Field(Scene.newScenery::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class centerY : OrderMapper.InMethod.Field(Scene.newScenery::class, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class height : OrderMapper.InMethod.Field(Scene.newScenery::class, 4) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class orientation : OrderMapper.InMethod.Field(Scene.newScenery::class, 5) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class startX : OrderMapper.InMethod.Field(Scene.newScenery::class, 6) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class startY : OrderMapper.InMethod.Field(Scene.newScenery::class, 7) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class endX : OrderMapper.InMethod.Field(Scene.newScenery::class, 8) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    @DependsOn(Scene.newScenery::class)
    class endY : OrderMapper.InMethod.Field(Scene.newScenery::class, 9) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<Scenery>() }
    }

    //TODO
//    @DependsOn(Scene.drawTile::class, Client.Scene_drawnCount::class)
//    class lastDrawn : UniqueMapper.InMethod.Field(Scene.drawTile::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETSTATIC && it.fieldId == field<Client.Scene_drawnCount>().id }
//                .next { it.opcode == PUTFIELD && it.fieldOwner == type<Scenery>() && it.fieldType == INT_TYPE }
//    }
}
