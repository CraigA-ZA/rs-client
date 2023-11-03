package api;

import accessors.RSClient;
import accessors.RSComponent;
import accessors.RSInventory;
import lombok.AllArgsConstructor;

import java.awt.*;
import java.util.AbstractList;

@AllArgsConstructor
public class ItemContainer extends AbstractList<ComponentItem> {
    private final RSInventory inventory;
    private final RSClient client;
    private final Component component;

    public int[] getIds() {
        return inventory.getIds();
    }

    public int[] getQuantities() {
        return inventory.getQuantities();
    }

    @Override
    public int size() {
        return this.getIds().length;
    }

    @Override
    public ComponentItem get(int index) {
//        if (index >= size()) {
//            return null;
//        }
//        Component inventoryComponent = Inventory.getComponent(client);
//        Rectangle area = new Rectangle((inventoryComponent.getX() + ((index % 4) * 42)),
//                (inventoryComponent.getY() + ((index / 4) * 36)), 31, 31);
//        return Item.of(this.getIds()[index], this.getQuantities()[index], area);
        int id = this.getIds()[index];
        int quantity = this.getQuantities()[index];
        Item item = Item.of(id, quantity);
        int row = index / component.getWidth();
        int col = index % component.getWidth();

        //In the original coed this doees .getLocation.x and y instead
        int x = component.getX() + ((32 + component.getPaddingX()) * col);
        int y = component.getY() + ((32 + component.getPaddingY()) * row);
        Rectangle rect = new Rectangle(x, y, 32, 32);
        return new ComponentItem(item, rect);
    }
}
