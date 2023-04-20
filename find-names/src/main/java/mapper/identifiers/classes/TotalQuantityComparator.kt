package mapper.identifiers.classes

//@DependsOn(GrandExchangeOffer.totalQuantity::class)
//class TotalQuantityComparator : IdentityMapper.Class() {
//    override val predicate = predicateOf<Class2> { it.interfaces.contains(Comparator::class.type) }
//            .and { it.instanceMethods.flatMap { it.instructions.asIterable() }
//                    .any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<GrandExchangeOffer.totalQuantity>().id } }
//}