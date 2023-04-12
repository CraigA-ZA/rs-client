package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Actor.class)
public class Player extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Actor") &&
                classNode.getInstanceFields().size() > 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) >= 17;
    }
}
