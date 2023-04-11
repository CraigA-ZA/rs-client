package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;

import java.util.zip.Inflater;

public class GzipDecompressor extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getCountFieldsOfType(Type.getType(Inflater.class)) >= 1;
    }
}
