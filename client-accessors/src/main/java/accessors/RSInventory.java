package accessors;

public interface RSInventory extends RSNode {
    int[] getIds();
    int[] getQuantities();

    long getKey();
}
