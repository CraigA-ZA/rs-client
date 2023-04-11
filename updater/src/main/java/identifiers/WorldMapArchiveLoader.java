package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(AbstractArchive.class)
public class WorldMapArchiveLoader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("AbstractArchive")) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 1;
    }
}
