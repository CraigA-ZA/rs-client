package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.*
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import java.lang.reflect.Modifier

class AbstractArchive : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { Modifier.isAbstract(it.access) }
            .and { it.instanceFields.count { it.type == Any::class.type.withDimensions(2) } == 1 }

    class decodeIndex : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type) }
    }

    @DependsOn(AbstractArchive::class)
    class releaseGroups : OrderMapper.InConstructor.Field(AbstractArchive::class, 0, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }

    @DependsOn(AbstractArchive::class)
    class shallowFiles : OrderMapper.InConstructor.Field(AbstractArchive::class, 1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.BOOLEAN_TYPE }
    }

    @DependsOn(decodeIndex::class)
    class groupCrcs : OrderMapper.InMethod.Field(decodeIndex::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(decodeIndex::class)
    class groupVersions : OrderMapper.InMethod.Field(decodeIndex::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(decodeIndex::class)
    class fileCounts : OrderMapper.InMethod.Field(decodeIndex::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(decodeIndex::class)
    class groupNameHashes : OrderMapper.InMethod.Field(decodeIndex::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    class groups : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Any::class.type.withDimensions(1) }
    }

    class files : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Any::class.type.withDimensions(2) }
    }

    @DependsOn(IntHashTable::class)
    class groupNameHashTable : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<IntHashTable>() }
    }

    @DependsOn(IntHashTable::class)
    class fileNameHashTables : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<IntHashTable>().withDimensions(1) }
    }

    @DependsOn(decodeIndex::class)
    class fileNameHashes : OrderMapper.InMethod.Field(decodeIndex::class, -1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE.withDimensions(2) }
    }

    @MethodParameters("group", "xteaKey")
    class buildFiles : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, IntArray::class.type) }
    }

    @MethodParameters("group", "file")
    @DependsOn(takeFileEncrypted::class)
    class takeFile : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE) }
                .and { it.arguments.size in 2..3 }
                .and { it.instructions.any { it.isMethod && it.methodId == method<takeFileEncrypted>().id } }
    }

    @MethodParameters("group", "file")
    @DependsOn(takeFileEncrypted::class)
    class getFile : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE) }
                .and { it.arguments.size == 2 }
                .and { it.instructions.none { it.isMethod && it.methodId == method<takeFileEncrypted>().id } }
                .and { it.instructions.none { it.opcode == Opcodes.NEW && it.typeType == RuntimeException::class.type } }
//                .and { it.instructions.count { it.opcode == ACONST_NULL } == 5 }
    }

    @MethodParameters("groupOrFile")
    @DependsOn(takeFile::class)
    class takeFileFlat : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
                .and { it.arguments.startsWith(Type.INT_TYPE) }
                .and { it.arguments.size in 1..2 }
                .and { it.instructions.any { it.opcode == Opcodes.NEW && it.typeType == RuntimeException::class.type } }
                .and { it.instructions.any { it.isMethod && it.methodId == method<takeFile>().id } }
    }

    @MethodParameters("groupOrFile")
    @DependsOn(getFile::class)
    class getFileFlat : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
                .and { it.arguments.startsWith(Type.INT_TYPE) }
                .and { it.arguments.size in 1..2 }
                .and { it.instructions.any { it.opcode == Opcodes.NEW && it.typeType == RuntimeException::class.type } }
                .and { it.instructions.any { it.isMethod && it.methodId == method<getFile>().id } }
    }

    @MethodParameters("group", "file", "xteaKey")
    class takeFileEncrypted : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE, IntArray::class.type) }
                .and { it.arguments.size in 3..4 }
    }

    @MethodParameters("groupName", "fileName")
    class takeFileByNames : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
                .and { it.arguments.startsWith(String::class.type, String::class.type) }
    }

    @MethodParameters("group", "file")
    class tryLoadFile : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.arguments.size in 2..3 }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE) }
                .and { it.instructions.any { it.opcode == Opcodes.ARRAYLENGTH } }
                .and { it.instructions.any { it.opcode == Opcodes.IFNULL || it.opcode == Opcodes.IFNONNULL || it.opcode == Opcodes.ACONST_NULL } }
    }

    @MethodParameters("group")
    class tryLoadGroup : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(Type.INT_TYPE) }
                .and { it.instructions.none { it.opcode == Opcodes.ARRAYLENGTH } }
    }

    class groupLoadPercent : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(Type.INT_TYPE) }
                .and { it.instructions.any { it.opcode == Opcodes.BIPUSH && it.intOperand == 100 } }
    }

    @MethodParameters("groupName")
    @DependsOn(tryLoadGroup::class)
    class tryLoadGroupByName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(String::class.type) }
                .and { it.instructions.any { it.isMethod && it.methodId == method<tryLoadGroup>().id } }
    }

    @MethodParameters("groupName", "fileName")
    @DependsOn(tryLoadFile::class)
    class tryLoadFileByNames : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.arguments.size in 2..3 }
                .and { it.arguments.startsWith(String::class.type, String::class.type) }
                .and { it.instructions.any { it.isMethod && it.methodId == method<tryLoadFile>().id } }
    }

    @MethodParameters("groupName")
    @DependsOn(groupLoadPercent::class)
    class groupLoadPercentByName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(String::class.type) }
                .and { it.instructions.any { it.isMethod && it.methodId == method<groupLoadPercent>().id } }
    }

    @MethodParameters("groupName")
    @DependsOn(groupLoadPercent::class)
    class getGroupId : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(String::class.type) }
                .and { it.instructions.none { it.isMethod && it.methodId == method<groupLoadPercent>().id } }
    }

    @MethodParameters("group", "fileName")
    class getFileId : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.arguments.size in 2..3 }
                .and { it.arguments.startsWith(Type.INT_TYPE, String::class.type) }
    }

    @DependsOn(tryLoadGroup::class)
    class loadGroup : UniqueMapper.InMethod.Method(tryLoadGroup::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
    }

    @DependsOn(decodeIndex::class)
    class hash : OrderMapper.InMethod.Field(decodeIndex::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @DependsOn(decodeIndex::class)
    class groupCount : OrderMapper.InMethod.Field(decodeIndex::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @DependsOn(decodeIndex::class)
    class groupIds : OrderMapper.InMethod.Field(decodeIndex::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == IntArray::class.type }
    }

    @DependsOn(decodeIndex::class)
    class fileIds : OrderMapper.InMethod.Field(decodeIndex::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Array<IntArray>::class.type }
    }
}