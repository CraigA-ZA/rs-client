package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Entity::class)
class UnlitModel : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Entity>() }
            .and { it.instanceFields.count { it.type == ShortArray::class.type } >= 5 }

//    class verticesCount : OrderMapper.InConstructor.Field(UnlitModel::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//        override val constructorPredicate = predicateOf<Method2> { it.arguments.isEmpty() }
//    }
//
//    class faceCount : OrderMapper.InConstructor.Field(UnlitModel::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//        override val constructorPredicate = predicateOf<Method2> { it.arguments.isEmpty() }
//    }
//
//    @MethodParameters("from", "to")
//    class recolor : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.size in 2..3 }
//                .and { it.arguments.startsWith(SHORT_TYPE, SHORT_TYPE) }
//                .and { it.instructions.count { it.isField && it.fieldType == ShortArray::class.type } == 2 }
//    }
//
//    @MethodParameters("from", "to")
//    class retexture : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.size in 2..3 }
//                .and { it.arguments.startsWith(SHORT_TYPE, SHORT_TYPE) }
//                .and { it.instructions.count { it.isField && it.fieldType == ShortArray::class.type } == 3 }
//    }
//
//    @DependsOn(recolor::class)
//    class faceColors : UniqueMapper.InMethod.Field(recolor::class) {
//        override val predicate = predicateOf<Instruction2> { it.isField && it.fieldType == ShortArray::class.type }
//    }
//
//    @DependsOn(retexture::class)
//    class faceTextures : UniqueMapper.InMethod.Field(retexture::class) {
//        override val predicate = predicateOf<Instruction2> { it.isField && it.fieldType == ShortArray::class.type }
//    }
//
//    @MethodParameters("a", "b", "c", "d", "e")
//    @DependsOn(Model::class)
//    class light : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<Model>() }
//    }
//
//    @DependsOn(light::class)
//    class faceLabelsAlpha : OrderMapper.InMethod.Field(light::class, -1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == Array<IntArray>::class.type }
//    }
//
//    @DependsOn(light::class)
//    class vertexLabels : OrderMapper.InMethod.Field(light::class, -2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == Array<IntArray>::class.type }
//    }
//
//    @DependsOn(light::class)
//    class faceAlphas : OrderMapper.InMethod.Field(light::class, -1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == ByteArray::class.type }
//    }
//
//    @DependsOn(light::class)
//    class indices3 : OrderMapper.InMethod.Field(light::class, -1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(light::class)
//    class indices2 : OrderMapper.InMethod.Field(light::class, -2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(light::class)
//    class indices1 : OrderMapper.InMethod.Field(light::class, -3) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(light::class)
//    class verticesZ : OrderMapper.InMethod.Field(light::class, -4) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(light::class)
//    class verticesY : OrderMapper.InMethod.Field(light::class, -5) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(light::class)
//    class verticesX : OrderMapper.InMethod.Field(light::class, -6) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    class isBoundsCalculated : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
//    }
//
//    @DependsOn(FaceNormal::class)
//    class faceNormals : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<FaceNormal>().withDimensions(1) }
//    }
//
//    @MethodParameters()
//    class invalidate : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE && it.arguments.isEmpty() }
//                .and { it.instructions.none { it.isMethod || it.opcode == LDC || it.opcode == IADD } }
//    }
//
//    @DependsOn(light::class)
//    class computeNormals : OrderMapper.InMethod.Method(light::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.isMethod }
//    }
//
//    @DependsOn(LocType.getUnlitModel::class, UnlitModel::class)
//    class resize : OrderMapper.InMethod.Method(LocType.getUnlitModel::class, -2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == INVOKEVIRTUAL && it.methodOwner == type<UnlitModel>() && it.methodType.argumentTypes.size == 3 }
//    }
//
//    @DependsOn(LocType.getUnlitModel::class, UnlitModel::class)
//    class offset : OrderMapper.InMethod.Method(LocType.getUnlitModel::class, -1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == INVOKEVIRTUAL && it.methodOwner == type<UnlitModel>() && it.methodType.argumentTypes.size == 3 }
//    }
}