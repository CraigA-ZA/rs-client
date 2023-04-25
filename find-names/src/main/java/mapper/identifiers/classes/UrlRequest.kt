package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.MethodParameters
import mapper.predicateutilities.and
import mapper.predicateutilities.predicateOf
import mapper.predicateutilities.type
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Type
import java.net.URL

class UrlRequest : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == URL::class.type } }

    class url : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == URL::class.type }
    }

    class response0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == ByteArray::class.type }
    }

    @MethodParameters()
    class getResponse : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == ByteArray::class.type }
    }

//    class isDone0 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == Type.BOOLEAN_TYPE }
//    }
    //TODO fix

    @MethodParameters()
    class isDone : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Type.BOOLEAN_TYPE }
    }
}