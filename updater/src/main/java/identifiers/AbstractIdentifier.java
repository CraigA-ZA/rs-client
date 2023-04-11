package identifiers;

import lombok.Getter;
import lombok.Setter;
import utility.ClassWrapper;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public abstract class AbstractIdentifier {

    public static Map<String, ClassWrapper> identifiedClasses = new HashMap<>();

    public abstract boolean isMatch(ClassWrapper classNode);

    public void identify(ClassWrapper classNode) {
        if(isMatch(classNode)) {
            if(identifiedClasses.containsKey(this.getClass().getSimpleName())) {
                identifiedClasses.put(this.getClass().getSimpleName(), null);
            } else {
                identifiedClasses.put(this.getClass().getSimpleName(), classNode);
            }
            System.out.println("Found: " + this.getClass().getSimpleName() + " @ " + classNode.getName());
        }
    }
}
