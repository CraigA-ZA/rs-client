package mapper.wrappers

import org.objectweb.asm.Type
import org.objectweb.asm.tree.MethodNode

class MethodWrapper(val jar: JarWrapper, val klass: ClassWrapper, val node: MethodNode) {

    companion object {
        const val CONSTRUCTOR_NAME = "<init>"
        const val CLASS_INITIALIZER_NAME = "<clinit>"
    }

    val name: String get() = node.name

    val desc: String get() = node.desc

    val type: Type = Type.getMethodType(node.desc)

    val arguments = type.argumentTypes.asList()

    val returnType: Type = type.returnType

    val access get() = node.access

    val signature = name to arguments

    val mark = name to type

    val id = Triple(klass.type, name, type)

    val exceptions = node.exceptions

    val instructions get() = node.instructions.iterator().asSequence()
            .map { InstructionWrapper(jar, klass, this, it) }

    val isClassInitializer: Boolean get() {
        return name == CLASS_INITIALIZER_NAME
    }

    val isConstructor: Boolean get() {
        return name == CONSTRUCTOR_NAME
    }

    override fun toString(): String {
        return "$klass.$name$desc"
    }
}