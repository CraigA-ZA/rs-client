package api;

import accessors.RSClient;
import api.enums.ComponentId;
import api.enums.ItemContainerId;

import java.awt.*;

public class Inventory {
    public static final int size = 28;

    public static Component getComponent(RSClient client) {
        return Components.get(ComponentId.INVENTORY_ITEMS, client);
    }

    public static ItemContainer getContainer(RSClient client) {
        return new ItemContainers(client).get(ItemContainerId.INVENTORY);
    }
}
