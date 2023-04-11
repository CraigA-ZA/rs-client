package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(Link.class)
public class LinkDeque extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                !classNode.getName().equals(identifiedClasses.get("Link").getName()) && //TODO this line is questionable
                classNode.getInstanceFields().size() == 2 &&
                classNode.getCountFieldsOfType(Type.getObjectType(classNode.getName())) == 2;
    }
}
