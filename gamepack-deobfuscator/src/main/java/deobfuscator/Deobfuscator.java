package deobfuscator;

import deobfuscator.deobs.AbstractDeob;
import deobfuscator.deobs.impl.ASM.*;
import deobfuscator.deobs.impl.javassist.UnusedFields;
import deobfuscator.deobs.impl.javassist.UnusedMethod;
import javassist.*;
import shared.Constants;

import java.io.*;
import java.util.*;

import org.objectweb.asm.tree.ClassNode;
import shared.UtilFunctions;

public final class Deobfuscator {
    public static Map<String, CtClass> classMap;
    public static Map<String, ClassNode> classMapASM;
    private static List<AbstractDeob> javassistDeobs = List.of(new UnusedMethod(), new UnusedFields());
    private static List<AbstractDeob> ASMDeobs = List.of(new RenameStaticMethods(), new UnusedTryCatchRemover(), new SortFieldsByModifiers(), new SortMethodsByLineNumber(), new OpaquePredicates(), new UnusedParams(), new ControlFlowFixer(), new RenameIfJavaKeyword(), new MultiplierFinder()); //new MultiplierFinderConverted()

    public static void main(String[] args) throws IOException {
        //Load JAR using Javassist
        classMap = UtilFunctions.loadJar(Constants.VANILLA_GAMEPACK_DIR);
        classMapASM = UtilFunctions.loadJarASM(Constants.VANILLA_GAMEPACK_DIR);

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
        deletePartJar();
        for (AbstractDeob deob : ASMDeobs) {
            deob.run();
        }

        UtilFunctions.writeJarToDiskASM(classMapASM, Constants.DEOB_OUTPUT_JAR_PATH);
    }

    private static void deletePartJar() {
        File file = new File(Constants.DEOB_IN_PROGRESS_PATH);
        file.delete();
    }
}