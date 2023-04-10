package utility;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;

import java.util.Arrays;
import java.util.List;

public class TypeUtilities {
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
}
