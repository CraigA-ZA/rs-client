package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

import java.util.Arrays;

public class WorldMapLabelSize extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 3 &&
                classNode.getInstanceFields().size() >= 3 &&
                classNode.getInstanceFields().size() <= 4 &&
        classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.BOOLEAN_TYPE) &&
                Arrays.stream(Type.getArgumentTypes(methodNode.desc)).anyMatch(argument -> argument.equals(Type.FLOAT_TYPE)));
    }
}
