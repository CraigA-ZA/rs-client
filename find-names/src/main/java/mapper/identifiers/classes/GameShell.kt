package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.abstractclasses.OrderMapper
import mapper.abstractclasses.UniqueMapper
import mapper.annotations.DependsOn
import mapper.annotations.MethodParameters
import mapper.predicateutilities.*
import mapper.wrappers.ClassWrapper
import mapper.wrappers.FieldWrapper
import mapper.wrappers.InstructionWrapper
import mapper.wrappers.MethodWrapper
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*
import org.runestar.client.common.startsWith
import java.applet.Applet
import java.awt.*
import java.awt.Canvas
import java.awt.datatransfer.Clipboard
import java.lang.reflect.Modifier

@DependsOn(Client::class)
class GameShell : IdentityMapper.Class() {
    override val predicate = predicateOf<ClassWrapper> { klass<Client>().superType == it.type }

    class frame : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Frame::class.type }
    }

    class eventQueue : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == EventQueue::class.type }
    }

    class clipboard : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Clipboard::class.type }
    }

    @DependsOn(MouseWheelHandler::class)
    class mouseWheelHandler : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == type<MouseWheelHandler>() }
    }

    @MethodParameters("g")
    class paint : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == Applet::paint.mark }
    }

    @MethodParameters("g")
    class update : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == Applet::update.mark }
    }

    @MethodParameters("s")
    class clipboardSetString : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.startsWith(String::class.type) }
                .and { it.instructions.any { it.isMethod && it.methodName == "setContents" } }
    }

    @MethodParameters()
    @DependsOn(MouseWheel::class)
    class mouseWheel : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<MouseWheel>() }
    }

    @MethodParameters()
    class checkHost : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.instructions.any { it.opcode == LDC && it.ldcCst == "runescape.com" } }
    }

    @MethodParameters()
    class container : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == Container::class.type }
    }

    @MethodParameters("type")
    class error : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 1..2 }
                .and { it.arguments.startsWith(String::class.type) }
                .and { it.instructions.any { it.opcode == LDC && it.ldcCst == "error_game_" } }
    }

    @DependsOn(error::class)
    class hasErrored : UniqueMapper.InMethod.Field(error::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    @MethodParameters()
    class setUpClipboard : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.isMethod && it.methodId == Toolkit::getSystemClipboard.id } }
    }

    @MethodParameters()
    @DependsOn(Bounds::class)
    class getFrameContentBounds : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == type<Bounds>() }
    }

    class focusGained : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.name == "focusGained" }
    }

    @MethodParameters()
    @DependsOn(frame::class)
    class hasFrame : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == BOOLEAN_TYPE }
                .and { it.arguments.size in 0..1 }
                .and { it.instructions.any { it.opcode == GETFIELD && it.fieldId == field<frame>().id } }
    }

    @MethodParameters()
    class kill : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() }
                .and { it.instructions.any { it.opcode == INVOKESTATIC && it.methodName == "exit" } }
    }

    @MethodParameters()
    @DependsOn(kill::class)
    class kill0 : OrderMapper.InMethod.Method(kill::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == INVOKEVIRTUAL && it.methodOwner == type<GameShell>() }
    }

    class run : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.name == "run" }
    }

    @DependsOn(run::class)
    class stopTimeMs : UniqueMapper.InMethod.Field(run::class) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETSTATIC && it.fieldType == LONG_TYPE }
    }

    @MethodParameters()
    class clearBackground : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.isEmpty() }
                .and { it.instructions.any { it.isMethod && it.methodId == Graphics::fillRect.id } }
    }

    @DependsOn(clearBackground::class)
    class canvasX : OrderMapper.InMethod.Field(clearBackground::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(clearBackground::class)
    class canvasY : OrderMapper.InMethod.Field(clearBackground::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(clearBackground::class)
    class contentWidth : OrderMapper.InMethod.Field(clearBackground::class, 2) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(clearBackground::class)
    class contentHeight : OrderMapper.InMethod.Field(clearBackground::class, 3) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    class drawInitial : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(INT_TYPE, String::class.type, BOOLEAN_TYPE) }
    }

    @MethodParameters("width", "height")
    class setMaxCanvasSize : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { Modifier.isProtected(it.access) }
                .and { it.arguments == listOf(INT_TYPE, INT_TYPE) }
    }

    @DependsOn(setMaxCanvasSize::class)
    class maxCanvasWidth : OrderMapper.InMethod.Field(setMaxCanvasSize::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(setMaxCanvasSize::class)
    class maxCanvasHeight : OrderMapper.InMethod.Field(setMaxCanvasSize::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }
    class canvas : InstanceField() {
        override val predicate = predicateOf<FieldWrapper> { it.type == Canvas::class.type }
    }

    @MethodParameters()
    @DependsOn(canvas::class)
    class addCanvas : InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.instructions.any { it.opcode == PUTFIELD && it.fieldId == field<canvas>().id } }
    }

    @MethodParameters()
    @DependsOn(Client.setUp::class)
    class setUp : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Client.setUp>().mark }
    }

    @MethodParameters()
    @DependsOn(Client.setUp::class)
    class setUpKeyboard : OrderMapper.InMethod.Method(Client.setUp::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == INVOKEVIRTUAL }
        override fun resolve(instruction: InstructionWrapper): MethodWrapper {
            return instruction.jar[Triple(instruction.jar[instruction.methodOwner].superType, instruction.methodName, instruction.methodType)]
        }
    }

    @MethodParameters()
    @DependsOn(Client.setUp::class)
    class setUpMouse : OrderMapper.InMethod.Method(Client.setUp::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == INVOKEVIRTUAL }
        override fun resolve(instruction: InstructionWrapper): MethodWrapper {
            return instruction.jar[Triple(instruction.jar[instruction.methodOwner].superType, instruction.methodName, instruction.methodType)]
        }
    }

    @DependsOn(getFrameContentBounds::class)
    class contentWidth0 : OrderMapper.InMethod.Field(getFrameContentBounds::class, 0) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(getFrameContentBounds::class)
    class contentHeight0 : OrderMapper.InMethod.Field(getFrameContentBounds::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(addCanvas::class)
    class canvasSetTimeMs : OrderMapper.InMethod.Field(addCanvas::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == LONG_TYPE }
    }

    @DependsOn(addCanvas::class)
    class isCanvasInvalid : OrderMapper.InMethod.Field(addCanvas::class, -1) {
        override val predicate = predicateOf<InstructionWrapper> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    @MethodParameters()
    @DependsOn(addCanvas::class)
    class replaceCanvas : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.arguments.isEmpty() }
                .and { it.instructions.any { it.isMethod && it.methodId == method<addCanvas>().id } }
                .and { it.name != "run" }
    }

    @MethodParameters("width", "height", "revision")
    class startThread : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments == listOf(INT_TYPE, INT_TYPE, INT_TYPE, INT_TYPE) }
    }

    @DependsOn(replaceCanvas::class)
    class render : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and { it.arguments.isEmpty() }
                .and { it.instructions.any { it.isMethod && it.methodMark == method<replaceCanvas>().mark } }
    }

    @DependsOn(Client.draw::class)
    class draw : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.mark == method<Client.draw>().mark }
    }

    @DependsOn(doCycle::class)
    class clientTick : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> { it.returnType == VOID_TYPE }
                .and {it.arguments.isEmpty()}
                .and {it.instructions.any { it.isMethod && it.methodId == method<doCycle>().id}}
    }

    @DependsOn(Client.doCycle::class)
    class doCycle: InstanceMethod() {
        override val predicate = predicateOf<MethodWrapper> {Modifier.isAbstract(it.access)}
                .and {it.desc == method<Client.doCycle>().desc && it.name == method<Client.doCycle>().name}
    }

    @MethodParameters()
    @DependsOn(render::class)
    class checkResize : OrderMapper.InMethod.Method(render::class, -2) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod && it.methodType.argumentTypes.isEmpty() }
    }

    @MethodParameters()
    @DependsOn(checkResize::class)
    class onResize : OrderMapper.InMethod.Method(checkResize::class, 1) {
        override val predicate = predicateOf<InstructionWrapper> { it.isMethod }
    }
}