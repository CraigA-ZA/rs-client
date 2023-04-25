package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

@DependsOn(Entity::class)
class ObjStack : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 3 }

    @DependsOn(Scene.newObjStack::class, Entity::class)
    class first : OrderMapper.InMethod.Field(Scene.newObjStack::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newObjStack::class, Entity::class)
    class second : OrderMapper.InMethod.Field(Scene.newObjStack::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newObjStack::class, Entity::class)
    class third : OrderMapper.InMethod.Field(Scene.newObjStack::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newObjStack::class)
    class x : OrderMapper.InMethod.Field(Scene.newObjStack::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE && it.fieldOwner == type<ObjStack>() }
    }

    @DependsOn(Scene.newObjStack::class)
    class y : OrderMapper.InMethod.Field(Scene.newObjStack::class, 1) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE && it.fieldOwner == type<ObjStack>() }
    }

    @DependsOn(Scene.newObjStack::class)
    class tileHeight : OrderMapper.InMethod.Field(Scene.newObjStack::class, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE && it.fieldOwner == type<ObjStack>() }
    }

    @DependsOn(Scene.newObjStack::class)
    class tag : OrderMapper.InMethod.Field(Scene.newObjStack::class, 0) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.LONG_TYPE && it.fieldOwner == type<ObjStack>() }
    }

    @DependsOn(Scene.newObjStack::class)
    class height : OrderMapper.InMethod.Field(Scene.newObjStack::class, 3) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE && it.fieldOwner == type<ObjStack>() }
    }
}