package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn({DualNode.class})
public class LocType extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return false;
    }
}
