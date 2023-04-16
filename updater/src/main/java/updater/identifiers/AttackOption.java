package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.DependsOn;

@DependsOn(Enumerated.class)
public class AttackOption extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 1 &&
                classNode.getInterfaces().stream().anyMatch(s -> s.equals(identifiedClasses.get("Enumerated").getName())) &&
                classNode.getInstanceMethods().size() == 1 &&
                classNode.getInstanceFields().stream().allMatch(fieldNode -> Type.getType(fieldNode.desc).equals(Type.INT_TYPE)) &&
                classNode.getCountStaticFieldsOfType(Type.getObjectType(classNode.getName())) == 4;
    }
}
