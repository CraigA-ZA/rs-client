package api;

import accessors.RSClient;
import accessors.RSComponent;
import api.enums.ComponentId;
import kotlin.sequences.Sequence;
import org.checkerframework.checker.units.qual.C;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Components {
//    public static Sequence<Component> getFlat() {
//        return Interfaces.asSequence().filter(Objects::nonNull).flatMap(Interface::getFlat);
//    }

    public static Component get(ComponentId id, RSClient client) {
        return get(id.getItf(), id.getComponent(), client);
    }

    public static Component get(int itf, int component, RSClient client) {
        RSComponent[] itfComponentArray = Arrays.stream(client.getInterfaceComponents()).toList().get(itf);
        RSComponent componentArray = Arrays.stream(itfComponentArray).toList().get(component);
        return new Component(componentArray, client);
    }

//    public static Sequence<Component> getRoots() {
//        return Interfaces.root != null ? Interfaces.root.getRoots() : emptySequence();
//    }

//    public static Component getDragInventory() {
//        return CLIENT.dragInventoryComponent != null ? new Component(CLIENT.dragInventoryComponent) : null;
//    }

//    public static void align(Component c) {
//        CLIENT.alignComponent(c.getAccessor());
//    }

//    public static EnumType getTopLevelComponents() {
//        _ClientScriptEvent e = CLIENT._ClientScriptEvent_();
//        e.setArgs(new Object[] { ScriptId.PROC_TOPLEVEL_GETCOMPONENTS });
//        CLIENT.runClientScript(e);
//        return new EnumType(CLIENT.getEnumType(CLIENT.interpreter_intStack[0]));
//    }

//    public static Component getTopLevel(ComponentId topLevelComponentId) {
//        int component = topLevelComponents.getInt(topLevelComponentId.getPacked());
//        return component != -1 ? new Component(component) : null;
//    }
}
