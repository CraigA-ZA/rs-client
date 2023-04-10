import identifiers.*;
import org.objectweb.asm.tree.ClassNode;
import identifiers.AbstractIdentifier;
import utility.ClassWrapper;
import za.org.secret.Constants;
import za.org.secret.UtilFunctions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Updater {
    private static Map<String, ClassNode> classNodeMap;
    public static Map<String, ClassWrapper> classMap;

    public static List<AbstractIdentifier> identifiers = List.of(
            new Node(),
            new ByteArrayNode(),
            new AnimBase(),
            new AbstractArchive(),
            new AbstractByteArrayCopier(),
            new Client(),
            new ClientError(),
            new World(),
            new WorldMapArea(),
            new Username(),
            new User(),
            new Buddy(),
            new AbstractRasterProvider(),
            new DualNode(),
            new Entity(),
            new Rasterizer2D(),
            new IndexedSprite(),
            new GameShell(),
            new FaceNormal(),
            new Actor(),
            new WorldMapManager(),
            new Player(),
            new PlayerAppearance(),
            new AbstractFont(),
            new NetSocket_Broken(),
            new AbstractSound(),
            new AccessFile(),
            new AnimFrame(),
            new AnimFrameset(),
            new Archive(),
            new BufferedFile(),
            new ArchiveDisk(),
            new ArchiveDiskAction_broken(),
            new ArchiveDiskActionHandler(),
            new ArchiveLoader(),
            new WorldMapManager(),
            new Canvas(),
            new Wrapper(),
            new WorldMap(),
            new StudioGame(),
            new Enumerated(),
            new WorldMapSectionType(),
            new SpotType(),
            new Wall(),
            new WallDecoration(),
            new Varcs(),
            new Varps_broken());

    public static void main(String[] args) {
        //TODO I'm pretty sure that while I'm writing this, I'm using a pack that I didn't deob. But thats fine for now


        //Load the deobbed jar
        classNodeMap = UtilFunctions.loadJarASM(Constants.DEOB_OUTPUT_JAR_PATH);

        classMap = classNodeMap.values().stream().filter(classnode -> UtilFunctions.isObfuscated(classnode.name))
                .collect(Collectors.toMap(classNode -> classNode.name, node -> new ClassWrapper(node)));

        for (AbstractIdentifier identifier : identifiers) {
            for (ClassWrapper classNode : classMap.values()) {
//                if(classNode.getName().equals("jv") && identifier.getClass().getSimpleName().equals("WorldMapSectionType")) {
//                    System.out.println("Yeet");
//                }
                identifier.identify(classNode);
            }
        }

//        if(new ByteArrayNode().identify(classMap.get("qc"))) {
//            System.out.println("Fuckin gottem");
//        }
    }
}
