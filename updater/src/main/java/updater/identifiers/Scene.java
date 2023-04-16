package updater.identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodNode;
import updater.utility.*;

import java.util.List;

@DependsOn(Scenery.class)
public class Scene extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() && classNode.getInterfaces().isEmpty() && classNode.getCountFieldsOfType(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("Scenery"), 1)) >= 1;
    }

    public FieldIdentifier tempScenery = fieldIdentifier(fieldNode -> !fieldNode.isStatic() && fieldNode.isOfType(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("Scenery"), 1)));

    public FieldIdentifier tiles = fieldIdentifier(fieldWrapper -> fieldWrapper.hasDimensions(3) && fieldWrapper.typeInJar());

    public MethodIdentifier newFloorDecoration = methodIdentifier( methodWrapper -> methodWrapper.returnTypeEquals(Type.VOID_TYPE) && startsWith(methodWrapper.getArguments(), List.of(Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, TypeUtilities.getTypeOfIdentifiedClass("Entity"), Type.LONG_TYPE, Type.INT_TYPE)));

    public MethodIdentifier newScenery = methodIdentifier(methodWrapper -> methodWrapper.returnTypeEquals(Type.VOID_TYPE) && startsWith(methodWrapper.getArguments(), List.of(Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, TypeUtilities.getTypeOfIdentifiedClass("Entity"), Type.INT_TYPE, Type.BOOLEAN_TYPE, Type.LONG_TYPE, Type.INT_TYPE)));

    public MethodIdentifier newWallDecoration = methodIdentifier(methodWrapper -> methodWrapper.returnTypeEquals(Type.VOID_TYPE) && startsWith(methodWrapper.getArguments(), List.of(Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, TypeUtilities.getTypeOfIdentifiedClass("Entity"), TypeUtilities.getTypeOfIdentifiedClass("Entity"), Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.LONG_TYPE, Type.INT_TYPE)));

    public FieldInConstructorIdentifier planes = fieldInConstructorId(-3, instruction -> instruction.getOpcode() == Opcodes.PUTFIELD && Type.getType(instruction.desc).equals(Type.INT_TYPE));

    public FieldInConstructorIdentifier xSize = fieldInConstructorId(-2, instruction -> instruction.getOpcode() == Opcodes.PUTFIELD && Type.getType(instruction.desc).equals(Type.INT_TYPE));

    public FieldInConstructorIdentifier ySize = fieldInConstructorId(-1, instruction -> instruction.getOpcode() == Opcodes.PUTFIELD && Type.getType(instruction.desc).equals(Type.INT_TYPE));

    public FieldInConstructorIdentifier tileHeights = fieldInConstructorId(-1, instruction -> instruction.getOpcode() == Opcodes.PUTFIELD && Type.getType(instruction.desc).equals(TypeUtilities.withDimensions(Type.INT_TYPE, 3)));
}
