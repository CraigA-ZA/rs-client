package mapper.wrappers

import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import java.lang.reflect.Modifier

class ClassWrapper(val jar: JarWrapper, val node: ClassNode) {

    val name: String get() = node.name

    val type: Type = Type.getObjectType(name)

    val methods = node.methods.map { MethodWrapper(jar, this, it) }

    val fields = node.fields.map { FieldWrapper(jar, this, it) }

    val access get() = node.access

    val superType: Type = Type.getObjectType(node.superName)

    val interfaces = node.interfaces.map { Type.getObjectType(it) }

    val constructors = methods.filter { it.isConstructor }

    val classInitializer = methods.firstOrNull { it.isClassInitializer }

    val staticMethods = methods.filter { Modifier.isStatic(it.access) && !it.isClassInitializer}

    val instanceMethods = methods.filter { !Modifier.isStatic(it.access) && !it.isConstructor }

    val staticFields = fields.filter { Modifier.isStatic(it.access) }

    val instanceFields = fields.filter { !Modifier.isStatic(it.access) }

    val id get() = type

    override fun toString(): String {
        return name
    }
}
