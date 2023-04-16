package updater.utility;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.MethodRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.commons.SimpleRemapper;
import org.objectweb.asm.tree.ClassNode;

import java.util.Map;

public class NameMapperWithFieldsAndMethodsMaybe {

    private final Map<String, String> classMap;
    private final Map<String, String> methodMap;
    private final Map<String, String> fieldMap;

    public NameMapperWithFieldsAndMethodsMaybe(Map<String, String> classMap, Map<String, String> methodMap, Map<String, String> fieldMap) {
        this.classMap = classMap;
        this.methodMap = methodMap;
        this.fieldMap = fieldMap;
    }

    public ClassNode mapNames(ClassNode obfuscatedClass) {
        ClassNode deobfuscatedClass = new ClassNode();
        Remapper remapper = new SimpleRemapper(classMap);
        obfuscatedClass.accept(new RemappingClassAdapter(deobfuscatedClass, remapper));
        return deobfuscatedClass;
    }

    private class RemappingMethodVisitor extends MethodRemapper {

        private RemappingMethodVisitor(MethodVisitor mv, Remapper remapper) {
            super(mv, remapper);
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
            String newOwner = remapper.mapType(owner);
            String newName = remapper.mapMethodName(owner, methodMap.getOrDefault(name, name), descriptor);
            String newDescriptor = remapper.mapMethodDesc(descriptor);
            super.visitMethodInsn(opcode, newOwner, newName, newDescriptor, isInterface);
        }

        @Override
        public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
            String newOwner = remapper.mapType(owner);
            String newName = fieldMap.getOrDefault(name, name);
            String newDescriptor = remapper.mapDesc(descriptor);
            super.visitFieldInsn(opcode, newOwner, newName, newDescriptor);
        }

        @Override
        public void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end, int index) {
            String newDescriptor = remapper.mapDesc(descriptor);
            super.visitLocalVariable(name, newDescriptor, signature, start, end, index);
        }
    }

    private class RemappingClassAdapter extends ClassRemapper {

        private RemappingClassAdapter(ClassVisitor cv, Remapper remapper) {
            super(cv, remapper);
        }

        @Override
        public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
            String newDescriptor = remapper.mapDesc(descriptor);
            String newFieldName = fieldMap.getOrDefault(name, name);
            return super.visitField(access, newFieldName, newDescriptor, signature, value);
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
            return new RemappingMethodVisitor(mv, remapper);
        }
    }
}