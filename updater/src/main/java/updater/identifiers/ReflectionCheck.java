package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@DependsOn(Node.class)
public class ReflectionCheck extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.getType(Field.class), 1)) >= 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(Type.getType(Method.class), 1)) >= 1;
    }
}
