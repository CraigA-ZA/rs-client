//package mapper.identifiers.classes
//
//import mapper.abstractclasses.AllUniqueMapper
//import mapper.abstractclasses.IdentityMapper
//import mapper.annotations.DependsOn
//import mapper.predicateutilities.and
//import mapper.predicateutilities.predicateOf
//import mapper.predicateutilities.prev
//import mapper.predicateutilities.prevWithin
//import mapper.wrappers.ClassWrapper
//import mapper.wrappers.FieldWrapper
//import mapper.wrappers.InstructionWrapper
//import mapper.wrappers.MethodWrapper
//import org.objectweb.asm.Opcodes
//import org.objectweb.asm.Type
//import org.runestar.client.common.startsWith
//
//@DependsOn(TextureProvider.setBrightness::class)
//class VarType : AllUniqueMapper.Class() {
//    override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodId == method<TextureProvider.setBrightness>().id }
//            .prev { it.opcode == Opcodes.LDC && it.ldcCst == 0.9 }
//            .prevWithin(30) { it.opcode == Opcodes.GETFIELD }
//
//    override fun resolve(instruction: InstructionWrapper): ClassWrapper {
//        return instruction.jar.get(instruction.fieldOwner)
//    }
//
//    @DependsOn(Packet::class)
//    class decode : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.none { it.opcode == Opcodes.PUTFIELD } }
//    }
//
//    @DependsOn(Packet::class)
//    class decode0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.any { it.opcode == Opcodes.PUTFIELD } }
//    }
//
//    class type : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<FieldWrapper> { it.type == Type.INT_TYPE }
//    }
//}