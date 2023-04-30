package deobfuscator.deobs.impl.ASM;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import kotlin.Pair;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.*;

import java.util.*;

public class RenameIfJavaKeyword extends AbstractDeob {
    @Override
    public void run() {
        NameMapper nameMapper = new NameMapper(Deobfuscator.classMapASM.values().stream().toList());

        for (ClassNode classNode : Deobfuscator.classMapASM.values()) {
            ClassNode remap = nameMapper.remap(classNode);
            Deobfuscator.classMapASM.put(classNode.name, remap);
        }
    }

    public class NameMapper {
        List<ClassNode> classes;

        public NameMapper(List<ClassNode> classes) {
            this.classes = classes;
        }

        public ClassNode remap(ClassNode classToRename) {
            ClassNode remappedClass = new ClassNode();
            ClassVisitor remapper = new ClassRemapper(remappedClass, new RSClientRemapper());
            classToRename.accept(remapper);
            return remappedClass;
        }

        class RSClientRemapper extends Remapper {

            Map<String, String> keywordMap  = new HashMap<>() {{
                put("if", "if_renamed");
                put("do", "do_renamed");
            }};


            @Override
            public String map(String typeName) {
                return keywordMap.getOrDefault(typeName, typeName);
            }

            @Override
            public String mapFieldName(String owner, String name, String descriptor) {
                return keywordMap.getOrDefault(name, name);
            }

            @Override
            public String mapMethodName(String owner, String name, String descriptor) {
                return keywordMap.getOrDefault(name, name);
            }
        }
    }
}


