package deobfuscator;

import deobfuscator.deobs.AbstractDeob;
import deobfuscator.deobs.impl.ASM.OpaquePredicates;
import deobfuscator.deobs.impl.ASM.RenameStaticMethods;
import deobfuscator.deobs.impl.ASM.UnusedParams;
import deobfuscator.deobs.impl.javassist.UnusedFields;
import deobfuscator.deobs.impl.javassist.UnusedMethod;
import deobfuscator.models.FoundMethod;
import javassist.*;
import za.org.secret.Constants;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.objectweb.asm.tree.ClassNode;
import za.org.secret.UtilFunctions;

public final class Deobfuscator {
    public static Map<String, CtClass> classMap;
    public static Map<String, ClassNode> classMapASM;
    private static List<AbstractDeob> javassistDeobs = Stream.of(new UnusedMethod(), new UnusedFields()).collect(Collectors.toList());
    private static List<AbstractDeob> ASMDeobs = Stream.of(new RenameStaticMethods(), new OpaquePredicates(), new UnusedParams()).collect(Collectors.toList());

    public static void main(String[] args) throws IOException {
        //Load JAR using Javassist
        classMap = UtilFunctions.loadJar(Constants.GAMEPACK_OUTPUT_DIR + Constants.OUTPUT_FILE_NAME);

        //Run all javassist based Deobs
        for (AbstractDeob deob : javassistDeobs) {
            deob.run();
        }

        try {
            //Write the deobbed jar
            UtilFunctions.writeJarToDisk(classMap);
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }

        //Load the deobbed jar
        classMapASM = UtilFunctions.loadJarASM(Constants.DEOB_IN_PROGRESS_PATH);
        for (AbstractDeob deob : ASMDeobs) {
            deob.run();
        }

        UtilFunctions.writeJarToDiskASM(classMapASM);
    }
}