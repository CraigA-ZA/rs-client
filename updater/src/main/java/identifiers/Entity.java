package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.TypeUtilities;

import java.lang.reflect.Modifier;

//@DependsOn("DualNode")
public class Entity extends AbstractIdentifier {

    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("DualNode") &&
                classNode.getInstanceFields().size() == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 1 &&
                classNode.isAbstract() &&
                classNode.getInstanceMethods().stream().noneMatch(methodNode -> Modifier.isAbstract(methodNode.access));
    }
}
