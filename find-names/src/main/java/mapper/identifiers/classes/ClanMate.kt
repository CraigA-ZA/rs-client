package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import mapper.wrappers.InstructionMapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.BOOLEAN_TYPE

@DependsOn(Buddy::class)
class ClanMate : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Buddy>() }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 0 }

    @DependsOn(TriBool::class)
    class isFriend0 : OrderMapper.InConstructor.Field(ClanMate::class, 0, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == type<TriBool>() }
    }

    @DependsOn(TriBool::class)
    class isIgnored0 : OrderMapper.InConstructor.Field(ClanMate::class, 1, 2) {
        override val predicate = predicateOf<InstructionMapper> { it.opcode == PUTFIELD && it.fieldType == type<TriBool>() }
    }

    @MethodParameters()
    @DependsOn(isFriend0::class)
    class isFriend : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE && it.arguments.isEmpty() }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<isFriend0>().id } }
    }

    @MethodParameters()
    @DependsOn(isIgnored0::class)
    class isIgnored : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE && it.arguments.isEmpty() }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<isIgnored0>().id } }
    }

    //TODO
//    @MethodParameters()
//    @DependsOn(isFriend::class)
//    class fillIsFriend : UniqueMapper.InMethod.Method(isFriend::class) {
//        override val predicate = predicateOf<Instruction2> { it.isMethod }
//    }
//
//    @MethodParameters()
//    @DependsOn(isIgnored::class)
//    class fillIsIgnored : UniqueMapper.InMethod.Method(isIgnored::class) {
//        override val predicate = predicateOf<Instruction2> { it.isMethod }
//    }

//    @MethodParameters()
//    @DependsOn(isFriend0::class, Client.TriBool_unknown::class)
//    class clearIsFriend : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE && it.arguments.isEmpty() }
//                .and { it.instructions.any { it.opcode == PUTFIELD && it.fieldId == field<isFriend0>().id } }
//                .and { it.instructions.any { it.opcode == GETSTATIC && it.fieldId == field<Client.TriBool_unknown>().id } }
//    }
//
//    @MethodParameters()
//    @DependsOn(isIgnored0::class, Client.TriBool_unknown::class)
//    class clearIsIgnored : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE && it.arguments.isEmpty() }
//                .and { it.instructions.any { it.opcode == PUTFIELD && it.fieldId == field<isIgnored0>().id } }
//                .and { it.instructions.any { it.opcode == GETSTATIC && it.fieldId == field<Client.TriBool_unknown>().id } }
//    }
    //TODO fix
}