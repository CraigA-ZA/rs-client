package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Actor.class)
public class Npc extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Actor") &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) < 10;
    }
}
