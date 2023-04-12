package identifiers;

import org.objectweb.asm.Type;
import utility.AbstractIdentifier;
import utility.ClassWrapper;

import javax.sound.sampled.SourceDataLine;

public class DevicePcmPlayer extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(Type.getType(SourceDataLine.class)) >= 1;
    }
}
