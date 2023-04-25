package mapper.identifiers.classes

//@DependsOn(Component.rectangleMode::class)
//class RectangleMode : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { it.type == field<Component.rectangleMode>().type }
//
//    class id : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { Modifier.isPublic(it.access) }
//    }
//
//    class id2 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { !Modifier.isPublic(it.access) }
//    }
//}