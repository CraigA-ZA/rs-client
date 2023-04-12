package identifiers;

import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;
import utility.TypeUtilities;

@DependsOn(Message.class)
public class ChatChannel extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("Message"),1)) >= 1;
    }
}
