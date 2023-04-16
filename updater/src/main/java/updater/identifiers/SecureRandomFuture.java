package updater.identifiers;

import lombok.NoArgsConstructor;
import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.FieldWrapper;

import java.security.SecureRandom;
import java.util.concurrent.Future;

public class SecureRandomFuture extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInstanceMethods().stream().anyMatch(methodNode -> Type.getReturnType(methodNode.desc).equals(Type.getType(SecureRandom.class)));
    }

    public class future extends FieldIdentifier {
        @Override
        public boolean isMatch(FieldWrapper fieldNode) {
            return fieldNode.isOfType(Type.getType(Future.class));
        }
    }
}