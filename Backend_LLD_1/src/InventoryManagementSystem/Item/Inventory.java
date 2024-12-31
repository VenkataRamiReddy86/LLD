package InventoryManagementSystem.Item;

import java.util.*;
import java.util.stream.Collectors;

public class Inventory<T extends Item> {
    HashMap<String, T> items ;
    public Inventory() {
        items = new HashMap<>();
    }

    void addItem(T item)
    {
        if(items.containsKey(item.getId()))
        {
            System.out.println("Item already exists");
            return;
        }
        items.put(item.getId(), item);

    }

    void removeItem(T item)
    {
        items.remove(item.getId());
    }
    T getItem(String id)
    {
        return items.get(id);
    }
    
    Iterable<T> getAllItems()
    {
        return items.values();
    }

    List<T> sortBy(Comparator<Item> comparator)
    {
        List<T> sorted = new ArrayList<>(items.values());
        sorted.sort(comparator);
        return sorted;
    }

    List<T> filterByPrice(double minPrice, double maxPrice)
    {
        return items.values().stream()
                .filter(item -> item.getPrice() >= minPrice && item.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    List<T> filterByAvailability(){
        return items.values().stream().filter(item-> item.getQuantity() > 0)
                .collect(Collectors.toList());
    }
}
