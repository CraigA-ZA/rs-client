package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(AbstractArchive.class)
public class Archive extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractArchive");
    }
}
