package updater.identifiers;

import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(PcmStream.class)
public class MidiPcmStream extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("PcmStream") &&
                classNode.getInstanceFields().size() == 27;
    }
}
