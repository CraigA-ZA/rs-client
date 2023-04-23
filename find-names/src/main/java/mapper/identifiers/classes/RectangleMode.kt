package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Field2

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