package mapper.identifiers.classes

//import mapper.identifiers.ScriptField
import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.identifiers.ScriptField
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.predicateutilities.withDimensions
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import org.objectweb.asm.Type

@DependsOn(IterableNodeHashTable::class, DualNode::class)
class ClientScript : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == type<DualNode>() }
            .and { it.instanceFields.any { it.type == type<IterableNodeHashTable>().withDimensions(1) } }

    class stringOperands : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Array<String>::class.type }
    }

    @DependsOn(IterableNodeHashTable::class)
    class switches : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<IterableNodeHashTable>().withDimensions(1) }
    }

    class localIntCount : ScriptField(0, Type.INT_TYPE)
    class localStringCount : ScriptField(1, Type.INT_TYPE)
    class intArgumentCount : ScriptField(2, Type.INT_TYPE)
    class stringArgumentCount : ScriptField(3, Type.INT_TYPE)

    class opcodes : ScriptField( 0, IntArray::class.type)
    class intOperands : ScriptField( 1, IntArray::class.type)
}