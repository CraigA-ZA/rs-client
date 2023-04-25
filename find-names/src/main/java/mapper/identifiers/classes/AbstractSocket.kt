package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.ClassWrapper

@DependsOn(BufferedNetSocket::class)
class AbstractSocket : IdentityMapper.Class() {

    override val predicate = predicateOf<ClassWrapper> { klass<BufferedNetSocket>().superType == it.type }

    //TODO
//    @MethodParameters()
//    @DependsOn(NetSocket.close::class)
//    class close : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<NetSocket.close>().mark }
//    }
//
//    @MethodParameters()
//    @DependsOn(NetSocket.readUnsignedByte::class)
//    class readUnsignedByte : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<NetSocket.readUnsignedByte>().mark }
//    }
//
//    @MethodParameters()
//    @DependsOn(NetSocket.available::class)
//    class available : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<NetSocket.available>().mark }
//    }
//
//    @MethodParameters("src", "srcIndex", "length")
//    @DependsOn(NetSocket.write::class)
//    class write : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<NetSocket.write>().mark }
//    }
//
//    @MethodParameters("dst", "dstIndex", "length")
//    @DependsOn(NetSocket.read::class)
//    class read : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<NetSocket.read>().mark }
//    }
//
//    @MethodParameters("length")
//    @DependsOn(NetSocket.isAvailable::class)
//    class isAvailable : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<NetSocket.isAvailable>().mark }
//    }
}