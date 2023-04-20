package mapper.identifiers.classes

//@DependsOn(GrandExchangeOffer.unitPrice::class)
//class UnitPriceComparator : IdentityMapper.Class() {
//    override val predicate = predicateOf<Class2> { it.interfaces.contains(Comparator::class.type) }
//            .and { it.instanceMethods.flatMap { it.instructions.asIterable() }
//                    .any { it.opcode == Opcodes.GETFIELD && it.fieldId == field<GrandExchangeOffer.unitPrice>().id } }
//}