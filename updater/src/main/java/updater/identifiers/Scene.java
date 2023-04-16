package updater.identifiers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodNode;
import updater.utility.*;

import java.util.List;

@DependsOn(Scenery.class)
public class Scene extends AbstractIdentifier {
    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.isOwnerless() &&
                classNode.getInterfaces().isEmpty() &&
                classNode.getCountFieldsOfType(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("Scenery"), 1)) >= 1;
    }

    @DependsOn(Scenery.class)
    public class tempScenery extends FieldIdentifier {
        @Override
        public boolean isMatch(FieldWrapper fieldNode) {
            return !fieldNode.isStatic() &&
                    fieldNode.isOfType(TypeUtilities.withDimensions(TypeUtilities.getTypeOfIdentifiedClass("Scenery"), 1));
        }
    }

    public class tiles extends FieldIdentifier {
        @Override
        public boolean isMatch(FieldWrapper fieldNode) {
            return fieldNode.hasDimensions(3) && fieldNode.typeInJar();
        }
    }

    public class newFloorDecoration extends MethodIdentifier {
        @Override
        public boolean isMatch(MethodWrapper methodWrapper) {
            return methodWrapper.returnTypeEquals(Type.VOID_TYPE) &&
            startsWith(methodWrapper.getArguments(), List.of(Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, Type.INT_TYPE, TypeUtilities.getTypeOfIdentifiedClass("Entity"), Type.LONG_TYPE, Type.INT_TYPE));
        }
    }

    public class planes extends FieldInConstructorIdentifier {
        public planes() {
            super(0);
        }


        @Override
        public boolean isMatch(FieldInsnNode instruction) {
            return instruction.getOpcode() == Opcodes.PUTFIELD && Type.getType(instruction.desc).equals(Type.INT_TYPE);
        }
    }
}
