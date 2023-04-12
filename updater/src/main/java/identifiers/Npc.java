package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Actor.class)
public class Npc extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Actor") &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) < 10;
    }
}
