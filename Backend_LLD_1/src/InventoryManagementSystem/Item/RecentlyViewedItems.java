package InventoryManagementSystem.Item;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {

    LinkedList<Item> items;

    int MAX_SIZE = 3;

    public RecentlyViewedItems() {
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        items.remove(item);
        items.addFirst(item);
        if (items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }
public List<Item> getRecentlyViewedItems() {
    return items;
}

}
