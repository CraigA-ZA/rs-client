package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(Client.Interpreter_stringStack::class)
class Interpreter : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it == field<Client.Interpreter_stringStack>().klass }
}