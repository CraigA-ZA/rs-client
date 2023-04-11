package utility;

import identifiers.AbstractIdentifier;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;

import java.util.Arrays;
import java.util.List;

public class TypeUtilities {
    public static final Type INT_ARRAY = TypeUtilities.withDimensions(Type.INT_TYPE, 1);
    public static final Type BYTE_ARRAY = TypeUtilities.withDimensions(Type.BYTE_TYPE, 1);
    public static final Type SHORT_ARRAY = TypeUtilities.withDimensions(Type.SHORT_TYPE, 1);
    public static final Type BOOLEAN_ARRAY = TypeUtilities.withDimensions(Type.BOOLEAN_TYPE, 1);
    public static final Type LONG_ARRAY = TypeUtilities.withDimensions(Type.LONG_TYPE, 1);
    public static final Type STRING_TYPE = Type.getType(String.class);
    public static final Type STRING_ARRAY = TypeUtilities.withDimensions(Type.getType(String.class), 1);

    public static Type withDimensions(Type type, int dimensions) {
        assert type.getSort() != Type.METHOD;
        assert dimensions >= 0;
        String prefix = new String(new char[dimensions]).replace("\0", "[");
        return Type.getType(prefix + type.getDescriptor());
    }

    public static Type returnType(MethodNode methodNode) {
        return Type.getReturnType(methodNode.desc);
    }

    public static List<Type> getArguments(MethodNode methodNode) {
        return Arrays.stream(Type.getArgumentTypes(methodNode.desc)).toList();
    }

    public static Type getTypeOfIdentifiedClass(String className) {
        return Type.getObjectType(AbstractIdentifier.identifiedClasses.get(className).getName());
    }
}
