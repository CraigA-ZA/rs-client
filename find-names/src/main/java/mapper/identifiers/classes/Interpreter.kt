package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2

@DependsOn(Client.Interpreter_stringStack::class)
class Interpreter : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it == field<Client.Interpreter_stringStack>().klass }
}