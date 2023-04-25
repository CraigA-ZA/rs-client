package mapper.wrappers

import org.objectweb.asm.Type
import org.objectweb.asm.tree.FieldNode

class FieldWrapper(val jar: JarWrapper, val klass: ClassWrapper, val node: FieldNode) {

    val name: String get() = node.name

    val access get() = node.access

    val desc: String get() = node.desc

    val type: Type = Type.getType(desc)

    val id = klass.type to name

    override fun toString(): String {
        return "$klass.$name"
    }
}