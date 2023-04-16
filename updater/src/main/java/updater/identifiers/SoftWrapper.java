package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

import java.lang.ref.SoftReference;

@DependsOn(Wrapper.class)
public class SoftWrapper extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Wrapper") &&
                classNode.getCountFieldsOfType(Type.getType(SoftReference.class)) >= 1;
    }
}
