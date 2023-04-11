package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Clock.class)
public class MilliClock extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Clock") &&
                classNode.getInstanceFields().size() > 1;
    }
}
