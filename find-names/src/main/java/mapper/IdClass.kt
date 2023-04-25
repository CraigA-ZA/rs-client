package mapper

import mapper.abstractclasses.Mapper
import mapper.annotations.MethodParameters
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation

data class IdClass(
        val className: String,
        val name: String,
        val superName: String,
        val access: Int,
        val interfaces: List<String>,
        val fields: List<IdField>,
        val methods: List<IdMethod>
)

data class IdField(
        val field: String,
        val owner: String,
        val name: String,
        val access: Int,
        val descriptor: String
)

data class IdMethod(
        val method: String,
        val owner: String,
        val name: String,
        val access: Int,
        val parameters: List<String>?,
        val descriptor: String
)

fun Mapper.Context.buildIdHierarchy(): List<IdClass> {
    val tclasses = ArrayList<IdClass>()
    classes.forEach { k, v ->
        val tfields = ArrayList<IdField>()
        val tmethods = ArrayList<IdMethod>()
        @Suppress("UNCHECKED_CAST")
        k.nestedClasses.forEach { n ->
            fields[n as KClass<out Mapper<FieldWrapper>>]?.let { f ->
                tfields.add(IdField(n.simpleName!!, f.klass.name, f.name, f.access, f.desc))
            }
            methods[n as KClass<out Mapper<MethodWrapper>>]?.let { m ->
                val ps = n.findAnnotation<MethodParameters>()?.names?.asList()
                tmethods.add(IdMethod(n.simpleName!!, m.klass.name, m.name, m.access, ps, m.desc))
            }
        }
        tclasses.add(IdClass(k.simpleName!!, v.name, v.superType.className, v.access, v.interfaces.map { it.className }, tfields, tmethods))
    }
    return tclasses
}