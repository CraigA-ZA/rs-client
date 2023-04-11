package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.TypeUtilities;

public class WorldMapArchiveLoader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("AbstractArchive")) == 1 &&
                classNode.getCountFieldsOfType(Type.getType(String.class)) == 1;
    }
}
