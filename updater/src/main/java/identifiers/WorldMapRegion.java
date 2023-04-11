package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

import java.util.HashMap;
import java.util.LinkedList;

public class WorldMapRegion extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.getType(HashMap.class)) == 2 &&
                classNode.getCountFieldsOfType(Type.getType(LinkedList.class)) == 1;
    }
}
