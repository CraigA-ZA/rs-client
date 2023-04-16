package updater.utility;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.FieldNode;
import updater.Updater;

import java.lang.reflect.Modifier;

@RequiredArgsConstructor
@Getter
@Setter
public class FieldWrapper {
    private final FieldNode fieldNode;

    public boolean hasDimensions(int i) {
        return Type.getType(fieldNode.desc).getDimensions() == i;
    }

    public boolean isOfType(Type type) {
        return Type.getType(fieldNode.desc).equals(type);
    }

    public Type getType() {
        return Type.getType(fieldNode.desc);
    }

    public boolean typeInJar() {
        return Updater.classMap.values().stream().anyMatch(classWrapper -> getType().getElementType().equals(Type.getObjectType(classWrapper.getClassNode().name)));
    }

    public boolean isStatic() {
        return Modifier.isStatic(fieldNode.access);
    }
}
