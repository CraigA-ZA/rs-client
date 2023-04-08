import javassist.CannotCompileException;
import javassist.CtClass;
import org.objectweb.asm.tree.ClassNode;
import za.org.secret.Constants;
import za.org.secret.UtilFunctions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Updater {
    public static Map<String, CtClass> classMap;
    public static Map<String, ClassNode> classMapASM;

    public static void main(String[] args) throws IOException {
        //Load the deobbed jar
        classMapASM = UtilFunctions.loadJarASM(Constants.DEOB_OUTPUT_JAR_PATH);



//        UtilFunctions.writeJarToDiskASM(classMapASM);
    }
}
