package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class World extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.INT_TYPE) >= 5 &&
                classNode.getCountFieldsOfType(Type.getType(String.class)) == 2 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.getType(String.class)) || Type.getType(fieldNode.desc).equals(Type.INT_TYPE)) &&
                classNode.getInstanceMethods().size() > 0;
    }
}
