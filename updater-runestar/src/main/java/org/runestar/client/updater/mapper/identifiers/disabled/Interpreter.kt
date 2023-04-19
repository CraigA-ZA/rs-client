package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

//@DependsOn(Client.Interpreter_stringStack::class)
//class Interpreter : IdentityMapper.Class() {
//
//    override val predicate = predicateOf<Class2> { it == field<Client.Interpreter_stringStack>().klass }
//}