package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.identifiers.*
import mapper.predicateutilities.*
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith

@DependsOn(Node::class)
class Component : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { it.superType == type<Node>() }
            .and { it.instanceFields.count { it.type == Array<Any>::class.type } > 10 }

    class parent : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Component>() }
    }

    class children : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<Component>().withDimensions(1) }
    }

    class isIf3 : OrderMapper.InConstructor.Field(Component::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class textShadowed : OrderMapper.InConstructor.Field(Component::class, 7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class isDraggable : OrderMapper.InConstructor.Field(Component::class, 9) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class noClickThrough : OrderMapper.InConstructor.Field(Component::class, 13) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class id : OrderMapper.InConstructor.Field(Component::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class childIndex : OrderMapper.InConstructor.Field(Component::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class buttonType : OrderMapper.InConstructor.Field(Component::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class clientCode : OrderMapper.InConstructor.Field(Component::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class xAlignment : OrderMapper.InConstructor.Field(Component::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class yAlignment : OrderMapper.InConstructor.Field(Component::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class widthAlignment : OrderMapper.InConstructor.Field(Component::class, 6) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class heightAlignment : OrderMapper.InConstructor.Field(Component::class, 7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class rawX : OrderMapper.InConstructor.Field(Component::class, 8) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class rawY : OrderMapper.InConstructor.Field(Component::class, 9) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class width : OrderMapper.InConstructor.Field(Component::class, 14) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class height : OrderMapper.InConstructor.Field(Component::class, 15) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class parentId : OrderMapper.InConstructor.Field(Component::class, 18) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class isHidden : OrderMapper.InConstructor.Field(Component::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class fill : OrderMapper.InConstructor.Field(Component::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class spriteTiling : OrderMapper.InConstructor.Field(Component::class, 4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class modelOrthog : OrderMapper.InConstructor.Field(Component::class, 5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class modelTransparency : OrderMapper.InConstructor.Field(Component::class, 6) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class color : OrderMapper.InConstructor.Field(Component::class, 23) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class color2 : OrderMapper.InConstructor.Field(Component::class, 24) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class mouseOverColor : OrderMapper.InConstructor.Field(Component::class, 25) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class mouseOverColor2 : OrderMapper.InConstructor.Field(Component::class, 26) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class transparency : OrderMapper.InConstructor.Field(Component::class, 27) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class lineWid : OrderMapper.InConstructor.Field(Component::class, 29) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class spriteId2 : OrderMapper.InConstructor.Field(Component::class, 30) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class spriteId : OrderMapper.InConstructor.Field(Component::class, 31) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class spriteAngle : OrderMapper.InConstructor.Field(Component::class, 32) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class outline : OrderMapper.InConstructor.Field(Component::class, 33) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class spriteShadow : OrderMapper.InConstructor.Field(Component::class, 34) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelType : OrderMapper.InConstructor.Field(Component::class, 35) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelId : OrderMapper.InConstructor.Field(Component::class, 36) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelType2 : OrderMapper.InConstructor.Field(Component::class, 37) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelId2 : OrderMapper.InConstructor.Field(Component::class, 38) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class sequenceId : OrderMapper.InConstructor.Field(Component::class, 39) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class sequenceId2 : OrderMapper.InConstructor.Field(Component::class, 40) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelOffsetX : OrderMapper.InConstructor.Field(Component::class, 41) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelOffsetY : OrderMapper.InConstructor.Field(Component::class, 42) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelAngleX : OrderMapper.InConstructor.Field(Component::class, 43) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelAngleY : OrderMapper.InConstructor.Field(Component::class, 44) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelAngleZ : OrderMapper.InConstructor.Field(Component::class, 45) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelZoom : OrderMapper.InConstructor.Field(Component::class, 46) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelFrameCycle : OrderMapper.InConstructor.Field(Component::class, -7) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class modelFrame : OrderMapper.InConstructor.Field(Component::class, -8) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class itemQuantity : OrderMapper.InConstructor.Field(Component::class, -9) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class itemId : OrderMapper.InConstructor.Field(Component::class, -10) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class text : OrderMapper.InConstructor.Field(Component::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    class rawWidth : OrderMapper.InConstructor.Field(Component::class, 10) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class rawHeight : OrderMapper.InConstructor.Field(Component::class, 11) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class x : OrderMapper.InConstructor.Field(Component::class, 12) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class y : OrderMapper.InConstructor.Field(Component::class, 13) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class rootIndex : OrderMapper.InConstructor.Field(Component::class, -2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class scrollX : OrderMapper.InConstructor.Field(Component::class, 19) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class scrollY : OrderMapper.InConstructor.Field(Component::class, 20) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class cycle : OrderMapper.InConstructor.Field(Component::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class textLineHeight : OrderMapper.InConstructor.Field(Component::class, -19) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class textXAlignment : OrderMapper.InConstructor.Field(Component::class, -18) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class textYAlignment : OrderMapper.InConstructor.Field(Component::class, -17) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class paddingX : OrderMapper.InConstructor.Field(Component::class, -16) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class paddingY : OrderMapper.InConstructor.Field(Component::class, -15) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class clickMask : OrderMapper.InConstructor.Field(Component::class, -14) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class dragDeadZone : OrderMapper.InConstructor.Field(Component::class, -13) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class dragDeadTime : OrderMapper.InConstructor.Field(Component::class, -12) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class mouseOverRedirect : OrderMapper.InConstructor.Field(Component::class, -11) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    // ok, select, continue
    class buttonText : OrderMapper.InConstructor.Field(Component::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    class scrollWidth : OrderMapper.InConstructor.Field(Component::class, 21) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class scrollHeight : OrderMapper.InConstructor.Field(Component::class, 22) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class spellName : OrderMapper.InConstructor.Field(Component::class, -2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    class targetVerb : OrderMapper.InConstructor.Field(Component::class, -3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    class opbase : OrderMapper.InConstructor.Field(Component::class, -4) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    class text2 : OrderMapper.InConstructor.Field(Component::class, -5) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == String::class.type }
    }

    @MethodParameters()
    @DependsOn(Font::class)
    class getFont : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Font>() }
    }

    @MethodParameters("sequence", "frame", "b", "appearance")
    @DependsOn(Model::class)
    class getModel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Model>() }
    }

    @MethodParameters("index", "s")
    class setAction : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(INT_TYPE, String::class.type) }
    }

    @DependsOn(setAction::class)
    class actions : UniqueMapper.InMethod.Field(setAction::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == String::class.type.withDimensions(1) }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class, Client.Strings_continue::class)
    class decodeLegacy : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.any { it.opcode == GETSTATIC && it.fieldId == field<Client.Strings_continue>().id } }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class, Client.Strings_continue::class)
    class decode : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(type<Packet>()) }
                .and { it.instructions.none { it.opcode == GETSTATIC && it.fieldId == field<Client.Strings_continue>().id } }
    }

    @MethodParameters("indexA", "indexB")
    class swapItems : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 2..3 }
                .and { it.arguments.startsWith(INT_TYPE, INT_TYPE) }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class readListenerTriggers : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == IntArray::class.type }
                .and { it.arguments.startsWith(type<Packet>()) }
    }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class readListener : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Array<Any?>::class.type }
                .and { it.arguments.startsWith(type<Packet>()) }
    }

    @MethodParameters("b")
    @DependsOn(SpriteMask::class)
    class getSpriteMask : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<SpriteMask>() }
    }
    @DependsOn(readListener::class)
    class hasListener : UniqueMapper.InMethod.Field(readListener::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    class cs1Instructions : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == INT_TYPE.withDimensions(2) }
    }

    class cs1Comparisons : Widget10Array(0)
    class cs1ComparisonValues : Widget10Array(1)

    class onLoad : WidgetListener(0)
    class onMouseOver : WidgetListener(1)
    class onMouseLeave : WidgetListener(2)
    class onTargetLeave : WidgetListener(3)
    class onTargetEnter : WidgetListener(4)
    class onVarTransmit : WidgetListener(5)
    class onInvTransmit : WidgetListener(6)
    class onStatTransmit : WidgetListener(7)
    class onTimer : WidgetListener(8)
    class onOp : WidgetListener(9)
    class onMouseRepeat : WidgetListener(10)
    class onClick : WidgetListener(11)
    class onClickRepeat : WidgetListener(12)
    class onRelease : WidgetListener(13)
    class onHold : WidgetListener(14)
    class onDrag : WidgetListener(15)
    class onDragComplete : WidgetListener(16)
    class onScrollWheel : WidgetListener(17)
    class onChatTransmit : WidgetListener2(17)
    class onKey : WidgetListener2(18)
    class onFriendTransmit : WidgetListener2(19)
    class onClanTransmit : WidgetListener2(20)
    class onMiscTransmit : WidgetListener2(21)
    class onDialogAbort : WidgetListener2(22)
    class onSubChange : WidgetListener2(23)
    class onStockTransmit : WidgetListener2(24)

//    @DependsOn(getSprite::class)
//    class spriteFlipV : OrderMapper.InMethod.Field(getSprite::class, 0) {
//        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == BOOLEAN_TYPE }
//    }
//
//    @DependsOn(getSprite::class)
//    class spriteFlipH : OrderMapper.InMethod.Field(getSprite::class, 1) {
//        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == BOOLEAN_TYPE }
//    }

//    class inventoryXOffsets : WidgetInvArray(0)
//    class inventoryYOffsets : WidgetInvArray(1)
//    class inventorySprites : WidgetInvArray(2)


//    @DependsOn(Sprite::class)
//    class getInventorySprite : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Sprite>() }
//                .and { it.arguments == listOf(INT_TYPE) }
//    }

//    @MethodParameters("b")
//    @DependsOn(Sprite::class)
//    class getSprite : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Sprite>() }
//                .and { it.arguments == listOf(BOOLEAN_TYPE, UrlRequester::class.type) }
//    }


//    class rectangleMode : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<FieldWrapper> { it.type.arrayDimensions == 0 }
//                .and { it.type != it.klass.type }
//                .and { it.type in it.jar }
//    }

//    @DependsOn(swapItems::class)
//    class itemIds : OrderMapper.InMethod.Field(swapItems::class, 0) {
//        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }
//
//    @DependsOn(swapItems::class)
//    class itemQuantities : OrderMapper.InMethod.Field(swapItems::class, -1) {
//        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == IntArray::class.type }
//    }

    @DependsOn(decodeLegacy::class)
    class type : OrderMapper.InMethod.Field(decodeLegacy::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class varTransmitTriggers : WidgetListenerTriggers(0)
    class invTransmitTriggers : WidgetListenerTriggers(1)
    class statTransmitTriggers : WidgetListenerTriggers(2)

}