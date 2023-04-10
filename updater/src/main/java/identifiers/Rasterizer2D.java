package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class Rasterizer2D extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getSuperclass().equals(identifiedClasses.get("DualNode")) &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceMethods().isEmpty() &&
                classNode.getInstanceFields().isEmpty() &&
                classNode.getCountStaticFieldsOfType(TypeUtilities.withDimensions(Type.INT_TYPE, 1)) == 1 &&
                classNode.getCountStaticFieldsOfType(Type.INT_TYPE) == 6;
    }
}
