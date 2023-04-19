package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.User
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(User::class)
class Buddy : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<User>() }
            .and { it.instanceFields.count() >= 3 }

//    class world0 : OrderMapper.InConstructor.Field(Buddy::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class set : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.size in 2..3 }
//    }
//
//    @DependsOn(set::class)
//    class int2 : OrderMapper.InMethod.Field(set::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    @DependsOn(world0::class, int2::class)
//    class rank : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it != field<world0>() && it != field<int2>() }
//    }
//
//    @MethodParameters()
//    class world : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
//    }
//
//    @MethodParameters()
//    class hasWorld : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//    }
}