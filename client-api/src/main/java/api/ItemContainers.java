package api;

import accessors.RSClient;
import accessors.RSInventory;
import accessors.RSNodeHashTable;
import lombok.AllArgsConstructor;
import runestar.generated.XInventory;
import runestar.generated.XNodeHashTable;

import java.util.AbstractList;
import java.util.RandomAccess;

@AllArgsConstructor
public class ItemContainers extends NodeHashTable<Integer, ItemContainer, RSInventory> {

    RSClient client;

    @Override
    public RSNodeHashTable getAccessor() {
        return client.getItemContainers();
    }

    @Override
    public Integer wrapKey(RSInventory node) {
        return (int) node.getKey();
    }

    @Override
    public long unwrapKey(Integer k) {
        return k.longValue();
    }

    @Override
    public ItemContainer wrapValue(RSInventory node) {
        return new ItemContainer(node);
    }
}