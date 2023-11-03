package api;

import accessors.RSClient;
import accessors.RSInventory;
import api.enums.ComponentId;
import api.enums.ItemContainerId;

import java.awt.*;

public class Inventory {
    public static final int size = 28;

    public static Component getComponent(RSClient client) {
        return Components.get(ComponentId.INVENTORY_ITEMS, client);
    }

    public static ItemContainer getContainer(RSClient client) {
        RSInventory inventory = (RSInventory) client.getItemContainers().get(ItemContainerId.INVENTORY);
        if(inventory != null) {
            return new ItemContainer(inventory, client, getComponent(client));
        } else {
            return null;
        }
    }
}
