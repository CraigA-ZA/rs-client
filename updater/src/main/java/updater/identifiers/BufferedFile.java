package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(AccessFile.class)
public class BufferedFile extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("AccessFile")) == 1;
    }
}
