package updater;

import kotlin.Pair;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.MethodRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.commons.SimpleRemapper;
import org.objectweb.asm.tree.ClassNode;
import updater.model.IdClass;
import updater.model.IdField;
import updater.model.IdMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameMapper {
    private String newClassName;
    private Map<Pair<String, String>, String> methodMap;
    private Map<Pair<String, String>, String> fieldMap;

    public NameMapper(IdClass idClass) {
        newClassName = idClass.className;

        fieldMap = idClass.fields.stream()
                .collect(Collectors.toMap(
                        field -> new Pair(field.name, field.descriptor),
                        IdField::getField
                ));

        methodMap = idClass.methods.stream()
                .collect(Collectors.toMap(
                        method -> new Pair(method.name, method.descriptor),
                        IdMethod::getMethod
                ));
    }

    public ClassNode mapNames(ClassNode obfuscatedClass) {
        ClassNode deobfuscatedClass = new ClassNode();
//        Remapper remapper = new SimpleRemapper(classMap);
//        obfuscatedClass.accept(new RemappingClassAdapter(deobfuscatedClass, remapper));
        return deobfuscatedClass;
    }

    private class RemappingMethodVisitor extends MethodRemapper {

        private RemappingMethodVisitor(MethodVisitor mv, Remapper remapper) {
            super(mv, remapper);
        }

//        @Override
//        public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
//            String newOwner = remapper.mapType(owner);
//            String newName = remapper.mapMethodName(owner, name, descriptor);
//            String newDescriptor = remapper.mapMethodDesc(descriptor);
//            super.visitMethodInsn(opcode, newOwner, newName, newDescriptor, isInterface);
//        }

//        @Override
//        public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
//            String newOwner = remapper.mapType(owner);
//            String newName = remapper.mapFieldName(owner, name, descriptor);
//            String newDescriptor = remapper.mapDesc(descriptor);
//            super.visitFieldInsn(opcode, newOwner, newName, newDescriptor);
//        }

//        @Override
//        public void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end, int index) {
//            String newDescriptor = remapper.mapDesc(descriptor);
//            super.visitLocalVariable(name, newDescriptor, signature, start, end, index);
//        }
    }

    private class RemappingClassAdapter extends ClassRemapper {

        private RemappingClassAdapter(ClassVisitor cv, Remapper remapper) {
            super(cv, remapper);
        }

        @Override
        public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
            String newDescriptor = remapper.mapDesc(descriptor);
            String newFieldName = remapper.mapFieldName(className, name, descriptor);
            return super.visitField(access, newFieldName, newDescriptor, signature, value);
        }

//        @Override
//        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
//            MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
//            return new RemappingMethodVisitor(mv, remapper);
//        }
    }
}