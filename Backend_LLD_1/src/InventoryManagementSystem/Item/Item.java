package InventoryManagementSystem.Item;

import java.util.Objects;

public class Item implements Comparable<Item> {

    private String id;
    private String name;
    private double price;
    private int quantity;
    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {return price;}
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
        if(this.price > o.price)
            return 1;
        else if(this.price < o.price)
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
