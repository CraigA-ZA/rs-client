package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(AbstractArchive::class)
class Archive : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<AbstractArchive>() }


    class index : OrderMapper.InConstructor.Field(Archive::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(INT_TYPE, ByteArray::class.type, BOOLEAN_TYPE, BOOLEAN_TYPE) }
    }

    @MethodParameters()
    class loadAllLocal : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.opcode == IINC } }
    }

    class validGroups : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == BooleanArray::class.type }
    }

    @DependsOn(ArchiveDisk::class)
    class archiveDisk : OrderMapper.InConstructor.Field(Archive::class, 0, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == type<ArchiveDisk>() }
    }

    @DependsOn(ArchiveDisk::class)
    class masterDisk : OrderMapper.InConstructor.Field(Archive::class, 1, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == type<ArchiveDisk>() }
    }

    @DependsOn(ArchiveDisk::class)
    class load : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(type<ArchiveDisk>()) }
    }

    @DependsOn(AbstractArchive.loadGroup::class)
    class loadGroup : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<AbstractArchive.loadGroup>().mark }
    }

    @DependsOn(masterDisk::class)
    class loadIndex : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 2..3 }
                .and { it.arguments.startsWith(INT_TYPE, INT_TYPE) }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<masterDisk>().id } }
    }

    @DependsOn(AbstractArchive.groupLoadPercent::class)
    class groupLoadPercent : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<AbstractArchive.groupLoadPercent>().mark }
    }

    @DependsOn(groupLoadPercent::class)
    class loadPercent : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == INT_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.isMethod && it.methodId == method<groupLoadPercent>().id } }
    }

    @DependsOn(loadIndex::class)
    class indexCrc : OrderMapper.InMethod.Field(loadIndex::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(loadIndex::class)
    class indexVersion : OrderMapper.InMethod.Field(loadIndex::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }
}