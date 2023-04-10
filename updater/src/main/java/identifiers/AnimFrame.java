package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

public class AnimFrame extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getCountFieldsOfType(Type.getObjectType(identifiedClasses.get("AnimBase").getName())) == 1 &&
                classNode.getSuperclass().equals("java/lang/Object");
    }
}
