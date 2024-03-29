package mapper.identifiers.classes

//import org.runestar.client.common.startsWith
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
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
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.runestar.client.common.startsWith

@DependsOn(Entity.getModel::class)
class Model : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.type == method<Entity.getModel>().returnType }

    @MethodParameters("yaw", "cameraPitchSine", "cameraPitchCosine", "cameraYawSine", "cameraYawCosine", "x", "y", "z", "tag")
    @DependsOn(Entity.draw::class)
    class draw : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Entity.draw>().mark }
    }

    @MethodParameters("pitch")
    @DependsOn(Projectile.getModel::class)
    class rotateZ : OrderMapper.InMethod.Method(Projectile.getModel::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<Model>() }
    }

    class draw0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(BOOLEAN_TYPE, BOOLEAN_TYPE, BOOLEAN_TYPE) }
    }

    class verticesCount : OrderMapper.InConstructor.Field(Model::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() }
    }

    class indicesCount : OrderMapper.InConstructor.Field(Model::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
        override val constructorPredicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() }
    }

    // either xz or xyz
    @DependsOn(Model.draw::class)
    class xzRadius : OrderMapper.InMethod.Field(Model.draw::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }


    // yaw
    @MethodParameters()
    @DependsOn(Player.getModel::class)
    class rotateY90Ccw : OrderMapper.InMethod.Method(Player.getModel::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == INVOKEVIRTUAL && it.methodOwner == type<Model>() && it.methodType.argumentTypes.size in 0..1 }
    }

    @MethodParameters()
    @DependsOn(rotateZ::class)
    class resetBounds : UniqueMapper.InMethod.Method(rotateZ::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
    }

    // new = old * scale / 128
    @MethodParameters("x", "y", "z")
    class resize : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 3..4 }
                .and { it.arguments.startsWith(INT_TYPE, INT_TYPE, INT_TYPE) }
                .and { it.instructions.count { it.opcode == SIPUSH && it.intOperand == 128 } == 3 }
    }

    @MethodParameters()
    @DependsOn(draw::class)
    class calculateBoundsCylinder : OrderMapper.InMethod.Method(draw::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
    }

    @MethodParameters("yaw")
    @DependsOn(draw::class)
    class calculateBoundingBox : OrderMapper.InMethod.Method(draw::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
    }

    @DependsOn(draw::class)
    class boundsType : OrderMapper.InMethod.Field(draw::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(calculateBoundsCylinder::class)
    class bottomY : OrderMapper.InMethod.Field(calculateBoundsCylinder::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(calculateBoundsCylinder::class)
    class radius : OrderMapper.InMethod.Field(calculateBoundsCylinder::class, -2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(calculateBoundsCylinder::class)
    class diameter : OrderMapper.InMethod.Field(calculateBoundsCylinder::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class doNotUse : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size == 3 }
                .and { it.arguments.startsWith(INT_TYPE, INT_TYPE, INT_TYPE) }
                .and { it.instructions.count { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type } == 12 }
    }

    @MethodParameters("x", "y", "z")
    @DependsOn(Player.getModel::class)
    class offset : OrderMapper.InMethod.Method(Player.getModel::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == INVOKEVIRTUAL && it.methodOwner == type<Model>() }
    }

    @DependsOn(doNotUse::class)
    class verticesX : OrderMapper.InMethod.Field(doNotUse::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class verticesY : OrderMapper.InMethod.Field(doNotUse::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class verticesZ : OrderMapper.InMethod.Field(doNotUse::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class indices1 : OrderMapper.InMethod.Field(doNotUse::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class indices2 : OrderMapper.InMethod.Field(doNotUse::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class indices3 : OrderMapper.InMethod.Field(doNotUse::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class faceColors1 : OrderMapper.InMethod.Field(doNotUse::class, 6) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class faceColors2 : OrderMapper.InMethod.Field(doNotUse::class, 7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(doNotUse::class)
    class faceColors3 : OrderMapper.InMethod.Field(doNotUse::class, 8) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @MethodParameters("b")
    @DependsOn(SpotType.getModel::class)
    class toSharedSpotAnimationModel : UniqueMapper.InMethod.Method(SpotType.getModel::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<Model>() && it.methodType.returnType == type<Model>() }
    }

    @DependsOn(Model::class, Player.getModel::class)
    class isSingleTile : UniqueMapper.InMethod.Field(Player.getModel::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isField && it.fieldOwner == type<Model>() && it.fieldType == BOOLEAN_TYPE }
    }

    @DependsOn(Model::class)
    class copy0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Model>() }
                .and { it.arguments.startsWith(BOOLEAN_TYPE, type<Model>(), ByteArray::class.type) }
    }

    @MethodParameters("type", "labels", "tx", "ty", "tz")
    class transform : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 5..6 }
                .and { it.arguments.startsWith(INT_TYPE, IntArray::class.type, INT_TYPE, INT_TYPE, INT_TYPE) }
    }

    @DependsOn(transform::class)
    class vertexLabels : OrderMapper.InMethod.Field(transform::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE.withDimensions(2) }
    }

    @DependsOn(transform::class)
    class faceLabelsAlpha : OrderMapper.InMethod.Field(transform::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE.withDimensions(2) }
    }

    @MethodParameters("frames", "frame")
    @DependsOn(AnimFrameset::class)
    class animate : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 2..3 }
                .and { it.arguments.startsWith(type<AnimFrameset>(), INT_TYPE) }
    }

    @DependsOn(AnimFrameset::class)
    class animate2 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 5..6 }
                .and { it.arguments.startsWith(type<AnimFrameset>(), INT_TYPE, type<AnimFrameset>(), INT_TYPE, IntArray::class.type) }
    }

    @MethodParameters("b")
    @DependsOn(NPCType.getModel::class)
    class toSharedSequenceModel : UniqueMapper.InMethod.Method(NPCType.getModel::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodOwner == type<Model>() && it.methodType.returnType == type<Model>() }
    }

    @DependsOn(transform::class)
    class faceAlphas : UniqueMapper.InMethod.Field(transform::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == ByteArray::class.type }
    }

    @MethodParameters()
    class rotateY180 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.count { it.opcode == INEG } == 2 }
                .and { it.instructions.count { it.opcode == IASTORE } == 2 }
    }

    @MethodParameters()
    @DependsOn(rotateY90Ccw::class)
    class rotateY270Ccw : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.count { it.opcode == INEG } == 1 }
                .and { it != method<rotateY90Ccw>() }
    }



    @DependsOn(UnlitModel.light::class)
    class faceTextures : OrderMapper.InMethod.Field(UnlitModel.light::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldOwner == type<Model>() && it.fieldType == ShortArray::class.type }
    }
}