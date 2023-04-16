package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;
import updater.utility.TypeUtilities;

@DependsOn({Node.class, PacketBit.class})
public class PacketBitNode extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Node") &&
                classNode.getCountFieldsOfType(TypeUtilities.getTypeOfIdentifiedClass("PacketBit")) >= 1;
    }
}
