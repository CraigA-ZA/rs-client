package updater;

import kotlin.Pair;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;
import updater.model.ClassHierarchyBuilder;
import updater.model.IdClass;
import za.org.secret.UtilFunctions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NameMapper {

    List<IdClass> classes;

    //Map<OriginalClass, NewClass>
    private Map<String, String> classMap;

    //Map<Pair<OriginalClass, OriginalMethodName+Descriptor>, NewMethodName>
    private Map<Pair<String, String>, String> methodMap;

    //Map<Pair<OriginalClass, OriginalFieldName>, NewFieldName>
    private Map<Pair<String, String>, String> fieldMap;

    ClassHierarchyBuilder builder;

    public NameMapper(List<IdClass> classes, ClassHierarchyBuilder builder) {
        this.classes = classes;
        this.builder = builder;

        classMap = classes.stream().collect(Collectors.toMap(IdClass::getName, IdClass::getClassName));

        methodMap = classes.stream().flatMap(idClass -> idClass.methods.stream()).collect(Collectors.toList()).stream().collect(Collectors.toMap(idMethod -> new Pair(idMethod.owner, idMethod.name + idMethod.descriptor), idMethod -> idMethod.method));

        fieldMap = classes.stream().flatMap(idClass -> idClass.fields.stream()).collect(Collectors.toList()).stream().collect(Collectors.toMap(idField -> new Pair(idField.owner, idField.name), idField -> idField.field));
    }

    public ClassNode remap(ClassNode classToRename) {
        ClassNode remappedClass = new ClassNode();
        ClassVisitor remapper = new ClassRemapper(remappedClass, new RSClientRemapper());
        classToRename.accept(remapper);
        return remappedClass;
    }

    class RSClientRemapper extends Remapper {

        @Override
        public String map(String typeName) {
            return classMap.getOrDefault(typeName, typeName);
        }

        @Override
        public String mapFieldName(String owner, String name, String descriptor) {
            if (owner.contains("bouncycastle") || owner.contains("java/") || owner.contains("org/") || owner.contains("com/")) {
                return name;
            }
            Pair pairToSearch = new Pair(owner, name);
            String newName = fieldMap.get(pairToSearch);

            while (newName == null) {
                String classToSearch = pairToSearch.getFirst().toString();
                IdClass thisClass = classes.stream().filter(idClass -> idClass.name.equals(classToSearch)).findFirst().orElse(null);
                if (thisClass == null || thisClass.superName.equals("java/lang/Object")) {
                    return name;
                }

                pairToSearch = new Pair(thisClass.superName, name);
                newName = fieldMap.get(pairToSearch);
            }
            return newName;
        }

        @Override
        public String mapMethodName(String owner, String name, String descriptor) {
            if (!UtilFunctions.isObfuscated(owner)) {
                return name;
            }
            if ((owner.equals("bm") || owner.equals("GameShell")) && name.equals("bt")) {
                System.out.println("Poes");
            }

            //Find if the method was renamed in any parent, if so, use that name here.
            String newName = getNewNameFromParentClass(owner, name, descriptor);
            if (newName != null) {
                return newName;
            }

            newName = getNewNameFromChildClasses(owner, name, descriptor);
            if (newName != null) {
                return newName;
            }

            return name;
        }

        private String getNewNameFromChildClasses(String owner, String name, String descriptor) {
            //Find if the method was renamed in any child, if so, return the renamed name
            Set<ClassNode> children = builder.getChildClassNodes(builder.getClassNode(owner));
//            System.out.println(children);


            for (ClassNode child : children) {
                String newName = methodMap.get(new Pair(child.name, name + descriptor));
                if (newName != null) {
                    return newName;
                }
                // Recursive search on the child's children
                String childNewName = getNewNameFromChildClasses(child.name, name, descriptor);
                if (childNewName != null) {
                    return childNewName;
                }
            }


            return null;
        }

        private String getNewNameFromParentClass(String owner, String name, String descriptor) {
            Pair pairToSearch = new Pair(owner, name + descriptor);
            String newName = methodMap.get(pairToSearch);

            while (newName == null) {
                String classToSearch = pairToSearch.getFirst().toString();
                IdClass thisClass = classes.stream().filter(idClass -> idClass.name.equals(classToSearch)).findFirst().orElse(null);
                if (thisClass == null || thisClass.superName.equals("java/lang/Object")) {
                    return null;
                }

                pairToSearch = new Pair(thisClass.superName, name + descriptor);
                newName = methodMap.get(pairToSearch);
            }

            return newName;
        }
    }
}