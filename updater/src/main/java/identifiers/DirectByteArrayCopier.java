package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(AbstractByteArrayCopier.class)
public class DirectByteArrayCopier extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractByteArrayCopier");
    }
}
