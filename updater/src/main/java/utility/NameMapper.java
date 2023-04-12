package utility;

import org.objectweb.asm.*;
import org.objectweb.asm.tree.ClassNode;

import java.util.Arrays;
import java.util.Map;

public class NameMapper {

    private final Map<String, String> classMap;
    private final Map<String, String> methodMap;
    private final Map<String, String> fieldMap;

    public NameMapper(Map<String, String> classMap, Map<String, String> methodMap, Map<String, String> fieldMap) {
        this.classMap = classMap;
        this.methodMap = methodMap;
        this.fieldMap = fieldMap;
    }

    public ClassNode mapNames(ClassNode obfuscatedClass) {
        ClassNode deobfuscatedClass = new ClassNode();
        obfuscatedClass.accept(new RemappingClassVisitor(deobfuscatedClass));
        return deobfuscatedClass;
    }

    private class RemappingClassVisitor extends ClassVisitor {

        private RemappingClassVisitor(ClassVisitor cv) {
            super(Opcodes.ASM8, cv);
        }

        @Override
        public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
            String deobfuscatedName = classMap.getOrDefault(name, name);
            String deobfuscatedSuperName = classMap.getOrDefault(superName, superName);
            String[] deobfuscatedInterfaces = Arrays.stream(interfaces)
                    .map(interfaceName -> classMap.getOrDefault(interfaceName, interfaceName))
                    .toArray(String[]::new);
            super.visit(version, access, deobfuscatedName, signature, deobfuscatedSuperName, deobfuscatedInterfaces);
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            String deobfuscatedDescriptor = mapDescriptor(descriptor);
            MethodVisitor mv = super.visitMethod(access, methodMap.getOrDefault(name, name), deobfuscatedDescriptor, signature, exceptions);
            return new RemappingMethodVisitor(mv);
        }

        @Override
        public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
            String deobfuscatedDescriptor = mapDescriptor(descriptor);
            return super.visitField(access, name, deobfuscatedDescriptor, signature, value);
        }

        private String mapDescriptor(String descriptor) {
            Type type = Type.getType(descriptor);
            if (type.getSort() == Type.OBJECT) {
                String typeName = type.getClassName().replace('.', '/');
                String deobfuscatedName = classMap.getOrDefault(typeName, typeName);
                return "L" + deobfuscatedName + ";";
            } else if (type.getSort() == Type.ARRAY) {
                Type elementType = type.getElementType();
                int dimensions = type.getDimensions();
                String elementDescriptor = mapDescriptor(elementType.getDescriptor());
                return new String(new char[dimensions]).replace('\0', '[') + elementDescriptor;
            } else {
                return descriptor;
            }
        }

        private class RemappingMethodVisitor extends MethodVisitor {

            private RemappingMethodVisitor(MethodVisitor mv) {
                super(Opcodes.ASM8, mv);
            }

            @Override
            public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
                String deobfuscatedOwner = classMap.getOrDefault(owner, owner);
                String deobfuscatedName = methodMap.getOrDefault(name, name);
                String deobfuscatedDescriptor = remapMethodDescriptor(descriptor);
                super.visitMethodInsn(opcode, deobfuscatedOwner, deobfuscatedName, deobfuscatedDescriptor, isInterface);
            }

            @Override
            public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                String deobfuscatedOwner = classMap.getOrDefault(owner, owner);
                String deobfuscatedDescriptor = remapTypeDescriptor(descriptor);
                super.visitFieldInsn(opcode, deobfuscatedOwner, name, deobfuscatedDescriptor);
            }

            @Override
            public void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end, int index) {
                String deobfuscatedDescriptor = remapTypeDescriptor(descriptor);
                super.visitLocalVariable(name, deobfuscatedDescriptor, signature, start, end, index);
            }

            private String remapMethodDescriptor(String descriptor) {
                Type[] types = Type.getArgumentTypes(descriptor);
                Type returnType = Type.getReturnType(descriptor);
                for (int i = 0; i < types.length; i++) {
                    Type type = types[i];
                    types[i] = remapType(type);
                }
                returnType = remapType(returnType);
                return Type.getMethodDescriptor(returnType, types);
            }

            private Type remapType(Type type) {
                if (type.getSort() == Type.OBJECT || type.getSort() == Type.ARRAY) {
                    String typeName = type.getClassName();
                    String deobfuscatedTypeName = classMap.getOrDefault(typeName, typeName);
                    return Type.getType(remapTypeDescriptor(deobfuscatedTypeName));
                }
                return type;
            }

            private String remapTypeDescriptor(String descriptor) {
                StringBuilder sb = new StringBuilder();
                Type type = Type.getType(descriptor);
                switch (type.getSort()) {
                    case Type.ARRAY:
                        sb.append(remapTypeDescriptor(type.getElementType().getDescriptor()));
                        for (int i = 0; i < type.getDimensions(); i++) {
                            sb.append('[');
                        }
                        break;
                    case Type.OBJECT:
                        String typeName = type.getClassName();
                        String deobfuscatedTypeName = classMap.getOrDefault(typeName, typeName);
                        sb.append('L').append(deobfuscatedTypeName.replace('.', '/')).append(';');
                        break;
                    default:
                        sb.append(type.getDescriptor());
                        break;
                }
                return sb.toString();
            }
        }
    }
}