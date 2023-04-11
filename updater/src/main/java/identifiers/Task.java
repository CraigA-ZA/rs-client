package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

import java.lang.reflect.Modifier;

public class Task extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Modifier.isVolatile(fieldNode.access) && Type.getType(fieldNode.desc).equals(Type.getType(Object.class)));
    }
}
