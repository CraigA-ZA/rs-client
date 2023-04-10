package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

import java.util.LinkedList;

public class WorldMapArea extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getType(LinkedList.class)) == 1 &&
                classNode.getCountFieldsOfType(Type.getType(String.class)) == 2;
    }
}
