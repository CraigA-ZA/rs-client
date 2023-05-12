package api;

public class Item {
    private final int id;
    private final int quantity;

    public Item(int id, int quantity) {
        if (id < 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid id or quantity");
        }
        this.id = id;
        this.quantity = quantity;
    }

    public static Item of(int id, int quantity) {
        if (id < 0 || quantity <= 0) {
            return null;
        }
        return new Item(id, quantity);
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}