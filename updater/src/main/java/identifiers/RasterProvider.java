package identifiers;

import org.objectweb.asm.Type;
import utility.ClassWrapper;
import utility.DependsOn;

import java.awt.*;

@DependsOn(AbstractRasterProvider.class)
public class RasterProvider extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("AbstractRasterProvider") &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getInstanceFields().stream().anyMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.getType(Component.class)));
    }
}
