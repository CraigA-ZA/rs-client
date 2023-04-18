package updater.identifiers;

import org.objectweb.asm.Type;
import updater.utility.AbstractIdentifier;
import updater.utility.ClassWrapper;
import updater.utility.TypeUtilities;

public class Node extends AbstractIdentifier {

    @Override
    public boolean isMatch(ClassWrapper classNode) {
        return classNode.getInstanceFields().size() == 3 &&
                classNode.getCountFieldsOfType(Type.LONG_TYPE) == 1 &&
                classNode.getCountFieldsOfType(Type.getObjectType(classNode.getName())) == 2 &&
                classNode.isOwnerless();
    }

    public MethodIdentifier hasNext = methodIdentifier(methodWrapper -> methodWrapper.returnTypeEquals(Type.BOOLEAN_TYPE));

    public FieldIdentifier key = fieldIdentifier(fieldWrapper -> fieldWrapper.isOfType(Type.LONG_TYPE));

    //@DependsOn(next::class) TODO
    public FieldIdentifier previous = fieldIdentifier(fieldWrapper -> fieldWrapper.isOfType(TypeUtilities.getTypeOfIdentifiedClass("Node")));
//    && fieldWrapper.getName().equals(TypeUtilities.getIdentifiedField("next"))); TODO

    public MethodIdentifier remove = methodIdentifier(methodWrapper -> methodWrapper.returnTypeEquals(Type.VOID_TYPE));

//    @DependsOn(hasNext::class) TODO
//    class next : UniqueMapper.InMethod.Field(hasNext::class) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.GETFIELD }
//    }
}
