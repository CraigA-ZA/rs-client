package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn(Archive.class)
public class ArchiveLoader extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("Archive")) == 1 &&
                classNode.getCountFieldsOfType(Type.INT_TYPE) == 2;
    }
}
