package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

@DependsOn(Entity::class, SeqType::class)
class GraphicsObject : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == type<Entity>() }
            .and { it.instanceMethods.size == 2 }
            .and { it.instanceFields.count { it.type == type<SeqType>() } == 1 }

    @DependsOn(SeqType::class)
    class seqType : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == type<SeqType>() }
    }

    class frame : OrderMapper.InConstructor.Field(GraphicsObject::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class frameCycle : OrderMapper.InConstructor.Field(GraphicsObject::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class id : OrderMapper.InConstructor.Field(GraphicsObject::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class plane : OrderMapper.InConstructor.Field(GraphicsObject::class, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class x : OrderMapper.InConstructor.Field(GraphicsObject::class, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class y : OrderMapper.InConstructor.Field(GraphicsObject::class, 5) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class height : OrderMapper.InConstructor.Field(GraphicsObject::class, 6) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class cycleStart : OrderMapper.InConstructor.Field(GraphicsObject::class, 7) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class isFinished : OrderMapper.InConstructor.Field(GraphicsObject::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }

    @MethodParameters("cycles")
    class advance : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
    }

    @MethodParameters()
    @DependsOn(Entity.getModel::class)
    class getModel : InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<Entity.getModel>().mark }
    }
}