package identifiers;

import utility.ClassWrapper;

public class Actor extends AbstractIdentifier{
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.isAbstract();
    }
}
