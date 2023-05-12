package mapper.identifiers.classes

import mapper.*
import mapper.abstractclasses.*
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.identifiers.ActorHitmarkField
import mapper.identifiers.ConstructorPutField
import mapper.predicateutilities.*
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import java.lang.reflect.Modifier

@DependsOn(Entity::class)
class Actor : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Entity>() }
            .and { Modifier.isAbstract(it.access) }

    @MethodParameters()
    class isVisible : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
    }

    @DependsOn(IterableNodeDeque::class)
    class headbars : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<IterableNodeDeque>() }
    }

    class overheadText : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == String::class.type }
    }

    class pathX : OrderMapper.InConstructor.Field(Actor::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == BIPUSH && it.intOperand == 10 }
                .next { it.opcode == NEWARRAY && it.intOperand == 10 }
                .next { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class pathY : OrderMapper.InConstructor.Field(Actor::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == BIPUSH && it.intOperand == 10 }
                .next { it.opcode == NEWARRAY && it.intOperand == 10 }
                .next { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class targetIndex : OrderMapper.InConstructor.Field(Actor::class, 19) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class movementFrame : OrderMapper.InConstructor.Field(Actor::class, 24) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class movementFrameCycle : OrderMapper.InConstructor.Field(Actor::class, 25) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class sequence : OrderMapper.InConstructor.Field(Actor::class, 27) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class sequenceFrame : OrderMapper.InConstructor.Field(Actor::class, 28) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class sequenceFrameCycle : OrderMapper.InConstructor.Field(Actor::class, 29) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class pathLength : OrderMapper.InConstructor.Field(Actor::class, -4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class pathTraversed : OrderMapper.InConstructor.Field(Actor::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == type<MoveSpeed>().withDimensions(1) }
    }

    class size : OrderMapper.InConstructor.Field(Actor::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class readySequence : OrderMapper.InConstructor.Field(Actor::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class turnLeftSequence : OrderMapper.InConstructor.Field(Actor::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class turnRightSequence : OrderMapper.InConstructor.Field(Actor::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class walkSequence : OrderMapper.InConstructor.Field(Actor::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class walkBackSequence : OrderMapper.InConstructor.Field(Actor::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class walkLeftSequence : OrderMapper.InConstructor.Field(Actor::class, 6) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class walkRightSequence : OrderMapper.InConstructor.Field(Actor::class, 7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class runSequence : OrderMapper.InConstructor.Field(Actor::class, 8) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class movementSequence : OrderMapper.InConstructor.Field(Actor::class, 23) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class sequenceDelay : OrderMapper.InConstructor.Field(Actor::class, 30) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

//    class spotAnimation : OrderMapper.InConstructor.Field(Actor::class, 22) {
//        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class spotAnimationFrame : OrderMapper.InConstructor.Field(Actor::class, 23) {
//        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }

//    class spotAnimationFrameCycle : OrderMapper.InConstructor.Field(Actor::class, 24) {
//        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }

    class npcCycle : OrderMapper.InConstructor.Field(Actor::class, 33) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }



    class overheadTextCyclesRemaining : OrderMapper.InConstructor.Field(Actor::class, 16) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }



    @MethodParameters("headbarType")
    @DependsOn(Headbar::class)
    class removeHeadbar : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.instructions.any { it.opcode == CHECKCAST && it.typeType == type<Headbar>() } }
    }

    @MethodParameters("headbarType", "cycle", "n0", "n1", "n2", "n3")
    @DependsOn(Headbar::class)
    class addHeadbar : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 6..7 }
                .and { it.instructions.any { it.opcode == CHECKCAST && it.typeType == type<Headbar>() } }
    }

    class hitmarkTypes : ActorHitmarkField(0)
    class hitmarkValues : ActorHitmarkField(1)
    class hitmarkCycles : ActorHitmarkField(2)
    class hitmarkTypes2 : ActorHitmarkField(3)
    class hitmarkValues2 : ActorHitmarkField(4)

    @MethodParameters("type", "value", "type2", "value2", "cycle", "cycle2")
    class addHitmark : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 6..7 }
                .and { it.instructions.any { it.opcode == IALOAD }  }
    }

    class hitmarkCount : ConstructorPutField(Actor::class, 0, BYTE_TYPE)

    class false0 : OrderMapper.InConstructor.Field(Actor::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

//    @DependsOn(Npc.getModel::class, Model.offset::class)
//    class heightOffset : UniqueMapper.InMethod.Field(Npc.getModel::class) {
//        override val predicate = predicateOf<Instruction2> { it.isMethod && it.methodId == method<Model.offset>().id }
//                .prevWithin(8) { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
//    }
//
    @DependsOn(Client.drawActor2d::class, Client.worldToScreen::class)
    class defaultHeight : OrderMapper.InMethod.Field(Client.drawActor2d::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == INVOKESTATIC && it.methodId == method<Client.worldToScreen>().id }
                .prevWithin(10) { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
                .prevWithin(10) { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
                .prevWithin(10) { it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }


    //Instead of using actorToScreen it could just the invocation of worldToScreen that happens in drawActor2d
    @DependsOn(Client.actorToScreen_doNotUse::class)
    class x : UniqueMapper.InMethod.Field(Client.actorToScreen_doNotUse::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
                .prevWithin(6){ it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
                .prevWithin(6){ it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }
    @DependsOn(Client.actorToScreen_doNotUse::class)
    class y : UniqueMapper.InMethod.Field(Client.actorToScreen_doNotUse::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
                .prevWithin(6){ it.opcode == Opcodes.GETFIELD && it.fieldType == INT_TYPE }
    }



    //This one is fucked up because orientation is a field in actor, but its only ever assigned from Player.getModel. Im not sure how to tie it back to the Actor class though. The identifier wants to map it to Player because thats the class its called on
//    @DependsOn(Player.getModel::class, Model.offset::class, Player::class)

    class orientation : UniqueMapper.InMethod.Field(Client.updateActorSequence::class) {
        override val predicate = predicateOf<InstructionWrapper> {it.opcode == GETFIELD && it.fieldType == type<MoveSpeed>().withDimensions(1)}
                .prevWithin(40) {it.opcode == PUTFIELD} //Could probably check for putfield value of 0
    }
}