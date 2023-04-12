package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;
import utility.DependsOn;

import java.lang.ref.SoftReference;

@DependsOn(Wrapper.class)
public class SoftWrapper extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Wrapper") &&
                classNode.getCountFieldsOfType(Type.getType(SoftReference.class)) >= 1;
    }
}
