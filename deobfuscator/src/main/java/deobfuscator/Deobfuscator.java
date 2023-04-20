package deobfuscator;

import deobfuscator.deobs.AbstractDeob;
import deobfuscator.deobs.impl.ASM.*;
import deobfuscator.deobs.impl.javassist.ChatGPTDeobV2;
import deobfuscator.deobs.impl.javassist.UnusedFields;
import deobfuscator.deobs.impl.javassist.UnusedMethod;
import javassist.*;
import za.org.secret.Constants;

import java.io.*;
import java.util.*;

import org.objectweb.asm.tree.ClassNode;
import za.org.secret.UtilFunctions;

public final class Deobfuscator {
    public static Map<String, CtClass> classMap;
    public static Map<String, ClassNode> classMapASM;
    private static List<AbstractDeob> javassistDeobs = List.of(new UnusedMethod(), new UnusedFields());
    private static List<AbstractDeob> ASMDeobs = List.of(new ControlFlowFixer(), new RenameStaticMethods(), new OpaquePredicates(), new UnusedParams(), new UnusedTryCatchRemover());

    public static void main(String[] args) throws IOException {
        //Load JAR using Javassist
        classMap = UtilFunctions.loadJar(Constants.GAMEPACK_OUTPUT_DIR + File.separator + Constants.OUTPUT_FILE_NAME);
        classMapASM = UtilFunctions.loadJarASM(Constants.GAMEPACK_OUTPUT_DIR + File.separator + Constants.OUTPUT_FILE_NAME);

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