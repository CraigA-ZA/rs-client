package mapper.identifiers.classes//package mapper.std.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper
import org.objectweb.asm.Opcodes.*

@DependsOn(Enumerated::class)
class Language : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.interfaces.contains(type<Enumerated>()) }
            .and { it.classInitializer?.instructions?.any { it.opcode == LDC && it.ldcCst == "Spanish" } ?: false }
}