package mapper.identifiers.classes

//@DependsOn(TextureProvider.setBrightness::class)
//class VarType : AllUniqueMapper.Class() {
//    override val predicate = predicateOf<Instruction2> { it.isMethod && it.methodId == method<TextureProvider.setBrightness>().id }
//            .prev { it.opcode == Opcodes.LDC && it.ldcCst == 0.9 }
//            .prevWithin(30) { it.opcode == Opcodes.GETFIELD }
//
//    override fun resolve(instruction: Instruction2): Class2 {
//        return instruction.jar.get(instruction.fieldOwner)
//    }
//
//    @DependsOn(Packet::class)
//    class decode : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.none { it.opcode == Opcodes.PUTFIELD } }
//    }
//
//    @DependsOn(Packet::class)
//    class decode0 : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
//                .and { it.arguments.startsWith(type<Packet>()) }
//                .and { it.instructions.any { it.opcode == Opcodes.PUTFIELD } }
//    }
//
//    class type : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Type.INT_TYPE }
//    }
//}