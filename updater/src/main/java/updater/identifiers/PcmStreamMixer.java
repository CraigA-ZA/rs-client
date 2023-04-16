package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(PcmStream.class)
public class PcmStreamMixer extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("PcmStream") &&
                classNode.getInstanceFields().size() == 4;
    }
}
