package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.*;

@DependsOn(Entity.class)
public class Actor extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isSuperClassEquals("Entity") &&
                classNode.isAbstract();
    }

    public class isVisible extends MethodIdentifier {
        @Override
        public boolean isMatch(MethodWrapper methodNode) {
            return methodNode.returnTypeEquals(Type.BOOLEAN_TYPE);
        }
    }

    @DependsOn(IterableNodeDeque.class)
    public class headbars extends FieldIdentifier {

        @Override
        public boolean isMatch(FieldWrapper fieldNode) {
            return fieldNode.isOfType(TypeUtilities.getTypeOfIdentifiedClass("IterableNodeDeque"));
        }
    }

    public class overheadText extends FieldIdentifier {

        @Override
        public boolean isMatch(FieldWrapper fieldNode) {
            return fieldNode.isOfType(TypeUtilities.STRING_TYPE);
        }
    }
}
