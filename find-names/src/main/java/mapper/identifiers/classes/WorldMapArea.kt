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
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.util.*

class WorldMapArea : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == LinkedList::class.type } == 1 }
            .and { it.instanceFields.count { it.type == String::class.type } == 2 }

    @DependsOn(WorldMapSection::class)
    class readWorldMapSection : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<WorldMapSection>() }
    }

    @DependsOn(Coord::class)
    class origin0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Coord>() }
    }

    @MethodParameters()
    @DependsOn(origin0::class, Coord::class)
    class origin : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Coord>() }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<origin0>().id } }
    }

    class sections : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == LinkedList::class.type }
    }

    @DependsOn(Packet::class)
    class read : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments == listOf(type<Packet>(), Type.INT_TYPE) }
    }

    @DependsOn(read::class)
    class archiveName0 : OrderMapper.InMethod.Field(read::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
    }

    @MethodParameters()
    @DependsOn(archiveName0::class)
    class archiveName : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == String::class.type }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<archiveName0>().id } }
    }

    @DependsOn(read::class)
    class name0 : OrderMapper.InMethod.Field(read::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == String::class.type }
    }

    @MethodParameters()
    @DependsOn(name0::class)
    class name : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == String::class.type }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<name0>().id } }
    }

    class isMain0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Type.BOOLEAN_TYPE }
    }

    @MethodParameters()
    @DependsOn(isMain0::class)
    class isMain : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<isMain0>().id } }
    }

    @DependsOn(read::class)
    class id0 : OrderMapper.InMethod.Field(read::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(id0::class)
    class id : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<id0>().id } }
    }

    class minX0 : OrderMapper.InConstructor.Field(WorldMapArea::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(minX0::class)
    class minX : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<minX0>().id } }
    }

    class maxX0 : OrderMapper.InConstructor.Field(WorldMapArea::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(maxX0::class)
    class maxX : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<maxX0>().id } }
    }

    class minY0 : OrderMapper.InConstructor.Field(WorldMapArea::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(minY0::class)
    class minY : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<minY0>().id } }
    }

    class maxY0 : OrderMapper.InConstructor.Field(WorldMapArea::class, 6) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(maxY0::class)
    class maxY : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<maxY0>().id } }
    }

    class zoom0 : OrderMapper.InConstructor.Field(WorldMapArea::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    @MethodParameters()
    @DependsOn(zoom0::class)
    class zoom : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<zoom0>().id } }
    }

    @MethodParameters()
    @DependsOn(Coord.x::class)
    class originX : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<Coord.x>().id } }
    }

    @MethodParameters()
    @DependsOn(Coord.z::class)
    class originY : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<Coord.z>().id } }
    }

    @MethodParameters()
    @DependsOn(Coord.y::class)
    class originPlane : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.INT_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<Coord.y>().id } }
    }

    @MethodParameters()
    class setBounds : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() && it.returnType == Type.VOID_TYPE }
    }

    @MethodParameters("plane", "x", "y")
    class position : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == IntArray::class.type }
    }

    @MethodParameters("x", "y")
    @DependsOn(Coord::class)
    class coord : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Coord>() }
                .and { it.arguments.size == 2 }
    }

    @MethodParameters("x", "y")
    @DependsOn(WorldMapSection.containsPosition::class)
    class containsPosition : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.INVOKEINTERFACE && it.methodId == method<WorldMapSection.containsPosition>().id } }
    }

    @MethodParameters("plane", "x", "y")
    @DependsOn(WorldMapSection.containsCoord::class)
    class containsCoord : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
                .and { it.instructions.any { it.opcode == Opcodes.INVOKEINTERFACE && it.methodId == method<WorldMapSection.containsCoord>().id } }
    }
}