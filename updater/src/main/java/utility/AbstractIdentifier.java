package utility;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public abstract class AbstractIdentifier {

    public static Map<String, String> identifiedClasses = new HashMap<>();

    public abstract boolean isMatch(ClassWrapper classNode);

    public void identify(ClassWrapper classNode) {
        if(isMatch(classNode)) {
            identifiedClasses.put(this.getClass().getSimpleName(), classNode.getName());
            System.out.println("Found: " + this.getClass().getSimpleName() + " @ " + classNode.getName());
        }
    }
}
