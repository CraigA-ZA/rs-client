package updater;

import kotlin.Pair;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.commons.SimpleRemapper;
import org.objectweb.asm.tree.ClassNode;
import updater.model.IdClass;
import updater.model.IdField;
import updater.model.IdMethod;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewNameMapper {

    //Map<OriginalClass, NewClass>
    private Map<String, String> classMap;

    //Map<Pair<OriginalClass, OriginalMethodName+Descriptor>, NewMethodName>
    private Map<Pair<String, String>, String> methodMap;

    //Map<Pair<OriginalClass, OriginalFieldName>, NewFieldName>
    private Map<Pair<String, String>, String> fieldMap;

    public NewNameMapper(List<IdClass> classes) {
        classMap = classes.stream().collect(Collectors.toMap(IdClass::getName, IdClass::getClassName));

        methodMap = classes.stream().flatMap(idClass -> idClass.methods.stream()).collect(Collectors.toList()).stream().collect(Collectors.toMap(idMethod -> new Pair(idMethod.owner, idMethod.name+idMethod.descriptor), idMethod -> idMethod.method));

        fieldMap = classes.stream().flatMap(idClass -> idClass.fields.stream()).collect(Collectors.toList()).stream().collect(Collectors.toMap(idField -> new Pair(idField.owner, idField.name), idField -> idField.field));
    }

    public ClassNode remap(ClassNode classToRename) throws IOException {
//        ClassReader reader = new ClassReader();
        ClassNode remappedClass = new ClassNode();
//        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
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
            Pair pairToSearch = new Pair(owner, name);
            return fieldMap.getOrDefault(pairToSearch, name);
        }

        @Override
        public String mapMethodName(String owner, String name, String descriptor) {
            Pair pairToSearch = new Pair(owner, name+descriptor);
            return methodMap.getOrDefault(pairToSearch, name);
        }
    }
}