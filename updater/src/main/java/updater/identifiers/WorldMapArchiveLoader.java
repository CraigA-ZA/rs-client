package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(AbstractArchive.class)
public class WorldMapArchiveLoader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("AbstractArchive")) == 1 &&
                classNode.getCountFieldsOfType(TypeUtilities.STRING_TYPE) == 1;
    }
}
