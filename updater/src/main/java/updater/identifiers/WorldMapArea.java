package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

import java.util.LinkedList;

public class WorldMapArea extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getType(LinkedList.class)) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 2;
    }
}
