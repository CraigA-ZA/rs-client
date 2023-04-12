package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(PcmStream.class)
public class RawPcmStream extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("PcmStream") &&
                classNode.getInstanceFields().size() == 15;
    }
}