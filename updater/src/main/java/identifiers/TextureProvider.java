package identifiers;

import utility.ClassWrapper;
import utility.DependsOn;

@DependsOn(TextureLoader.class)
public class TextureProvider extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return false;
//        return classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("TextureLoader").getName()));
    }
}
