package InventoryManagementSystem.Item;

import java.util.HashSet;
import java.util.Set;

public class WishList {
    private Set<Item> items;
    public WishList() {
        items = new HashSet<>();
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
    public HashSet<Item> getItems() {
        return (HashSet<Item>) items;
    }
}
