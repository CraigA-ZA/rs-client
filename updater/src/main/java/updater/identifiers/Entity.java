package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

import java.lang.reflect.Modifier;

@DependsOn(DualNode.class)
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
