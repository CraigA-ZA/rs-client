package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.identifiers.MethodPutField
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.LONG_TYPE

@DependsOn(Entity::class)
class Wall : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 6 }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 2 }
            .and { it.instanceFields.size == 9 }
            .and { it.instanceMethods.isEmpty() }

    @DependsOn(Scene.newWall::class)
    class tag : MethodPutField(Scene.newWall::class, 0, LONG_TYPE)

    @DependsOn(Scene.newWall::class)
    class flags : MethodPutField(Scene.newWall::class, 0, INT_TYPE)

    @DependsOn(Scene.newWall::class)
    class x : MethodPutField(Scene.newWall::class, 1, INT_TYPE)

    @DependsOn(Scene.newWall::class)
    class y : MethodPutField(Scene.newWall::class, 2, INT_TYPE)

    @DependsOn(Scene.newWall::class)
    class tileHeight : MethodPutField(Scene.newWall::class, 3, INT_TYPE)

    @DependsOn(Scene.newWall::class, Entity::class)
    class entity1 : OrderMapper.InMethod.Field(Scene.newWall::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newWall::class, Entity::class)
    class entity2 : OrderMapper.InMethod.Field(Scene.newWall::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newWall::class)
    class orientationA : MethodPutField(Scene.newWall::class, 4, INT_TYPE)

    @DependsOn(Scene.newWall::class)
    class orientationB : MethodPutField(Scene.newWall::class, 5, INT_TYPE)
}