package InventoryManagementSystem.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        /*List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("1","mobile",100.00,1,1));
        items.add(new Clothing("2","shirt",101.00,1,"M"));
        items.add(new Book("3","java",102.00,1,"java"));

       System.out.println(items.get(0).compareTo(items.get(1)));

        Collections.sort(items);
        for (Item item : items) {
            System.out.println(item.getName());
        }

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        Inventory<Clothing> clothingsInventory = new Inventory<>();
        Inventory<Book> booksInventory = new Inventory<>();

        Electronics mobile=new Electronics("1","mobile",100.00,1,1);
        Electronics laptop=new Electronics("2","laptop",100.00,2,1);
        Electronics desktop=new Electronics("3","desktop",100.00,3,1);
        Electronics watch = new Electronics("4","watch",100.00,4,1);
        electronicsInventory.addItem(mobile);
        electronicsInventory.addItem(mobile);
        electronicsInventory.addItem(new Electronics("2","laptop",100.00,1,1));
        electronicsInventory.addItem(new Electronics("3","desktop",100.00,1,1));

        /*System.out.println(electronicsInventory.getItem("1").getName());
        electronicsInventory.removeItem(mobile);
        for(Item item: electronicsInventory.getAllItems())
        {
            System.out.println(item.getName());
        }

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();
        recentlyViewedItems.addRecentlyViewedItem(desktop);
        recentlyViewedItems.addRecentlyViewedItem(laptop);
        recentlyViewedItems.addRecentlyViewedItem(watch);
        //recentlyViewedItems.addRecentlyViewedItem(mobile);
        //recentlyViewedItems.addRecentlyViewedItem(mobile);
        for(Item item: recentlyViewedItems.getRecentlyViewedItems()){
            System.out.println(item.getName());
        }*/

       /* OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(new Order(true,"1"));
        orderProcessor.addOrder(new Order(false,"2"));
        orderProcessor.addOrder(new Order(true,"3"));
        orderProcessor.addOrder(new Order(false,"4"));
        orderProcessor.addOrder(new Order(true,"5"));
        orderProcessor.addOrder(new Order(false,"6"));

        while (orderProcessor.getSize()>0)
        {
            System.out.println(orderProcessor.process().getOrderID());
        }*/

        Inventory<Item> inventory = new Inventory<Item>();
        inventory.addItem(new Electronics("2","laptop",100.00,1,1));
        inventory.addItem(new Electronics("3","desktop",200.00,2,1));
        inventory.addItem(new Clothing("4","mobile",1,0,"L"));

        List<Item> sortByName= inventory.sortBy(new ItemNameComparator());
        for (Item item : sortByName) {
            System.out.println(item.getName());
        }

        List<Item> sortByAvailability = inventory.sortBy(new ItemQuantityComparator());
        for (Item item : sortByAvailability) {
            System.out.println(item.getName());
        }
        System.out.println("Filter bY Availability");
        for(Item item: inventory.filterByAvailability())
        {
            System.out.println(item.getName());
        }

        System.out.println("Filter bY price");
        for(Item item: inventory.filterByPrice(1,100))
        {
            System.out.println(item.getName());
        }

        WishList wishlist = new WishList();
        wishlist.addItem(new Electronics("2","laptop",100.00,1,1));
        wishlist.addItem(new Electronics("3","desktop",200.00,2,1));
        wishlist.addItem(new Electronics("2","laptop",100.00,1,1));
        wishlist.addItem(new Electronics("3","desktop",200.00,2,1));
        System.out.println("Wish list");
        for (Item item : wishlist.getItems()) {
            System.out.println(item.getName());
        }

    }
}
