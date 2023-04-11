package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

import java.lang.reflect.Modifier;

@DependsOn(DualNode.class)
public class Wrapper extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isAbstract() && classNode.isSuperClassEquals("DualNode") &&
                !classNode.getInstanceMethods().stream().allMatch(methodNode -> Modifier.isAbstract(methodNode.access));
    }
}
