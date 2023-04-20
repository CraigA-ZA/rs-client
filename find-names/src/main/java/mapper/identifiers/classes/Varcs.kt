package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.Class2
import mapper.wrappers.Field2
import mapper.wrappers.Instruction2
import mapper.wrappers.Method2
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith

class Varcs : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == BooleanArray::class.type } >= 1 }
            .and { it.instanceFields.count { it.type == IntArray::class.type } <= 1 }
            .and { it.instanceFields.count { it.type == Array<String>::class.type } == 1 }

    class strings : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Array<String>::class.type }
    }

    class map : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Map::class.type }
    }

//    @DependsOn(AccessFile::class)
//    class getPreferencesFile : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<AccessFile>() }
//    }

//    @DependsOn(AccessFile.read::class)
//    class read : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.instructions.any { it.isMethod && it.methodId == method<AccessFile.read>().id } }
//    }
//
//    @DependsOn(AccessFile.write::class)
//    class write : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.instructions.any { it.isMethod && it.methodId == method<AccessFile.write>().id } }
//    }
    //TODO

    class intsPersistence : OrderMapper.InConstructor.Field(Varcs::class, 0, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == BooleanArray::class.type }
    }

    class unwrittenChanges : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BOOLEAN_TYPE }
    }

    class lastWriteTimeMs : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.LONG_TYPE }
    }

    @MethodParameters("index")
    class getStringOld : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
                .and { it.instructions.any { it.opcode == Opcodes.AALOAD } }
    }

    @MethodParameters("index")
    class getString : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
                .and { it.instructions.none { it.opcode == Opcodes.AALOAD } }
    }

    @MethodParameters("index")
    class getInt : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
    }

    @MethodParameters()
    class hasUnwrittenChanges : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.BOOLEAN_TYPE }
    }

    @MethodParameters("index", "s")
    class setStringOld : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, String::class.type) }
                .and { it.instructions.any { it.opcode == Opcodes.AASTORE } }
    }

    @MethodParameters("index", "s")
    class setString : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, String::class.type) }
                .and { it.instructions.none { it.opcode == Opcodes.AASTORE } }
    }

    @MethodParameters("index", "n")
    class setInt : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(Type.INT_TYPE, Type.INT_TYPE) }
    }

//    @MethodParameters()
//    class clearTransient : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.size in 0..1 }
//                .and { it.node.tryCatchBlocks.isEmpty() }
//                .and { it.instructions.any { it.opcode == Opcodes.AASTORE } }
//    }

//    @MethodParameters()
//    class tryWrite : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.size in 0..1 }
//                .and { it.node.tryCatchBlocks.isEmpty() }
//                .and { it.instructions.none { it.opcode == Opcodes.AASTORE } }
//    }
    //TODO
}