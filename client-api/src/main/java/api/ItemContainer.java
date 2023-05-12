package api;

import accessors.RSClient;
import accessors.RSInventory;
import lombok.AllArgsConstructor;
import runestar.generated.XInventory;

import java.util.AbstractList;
import java.util.RandomAccess;

@AllArgsConstructor
public class ItemContainer extends AbstractList<Item> implements RandomAccess {
    private final RSInventory inventory;

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
    public Item get(int index) {
        if (index >= size()) {
            return null;
        }
        return Item.of(this.getIds()[index], this.getQuantities()[index]);
    }
}
