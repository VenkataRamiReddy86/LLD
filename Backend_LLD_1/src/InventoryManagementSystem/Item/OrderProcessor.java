package InventoryManagementSystem.Item;

import java.util.PriorityQueue;

public class OrderProcessor {
    PriorityQueue<Order> orders;
    public OrderProcessor() {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        orders.offer(order);
    }
    public Order process() {
        return orders.poll();

    }

    public int getSize() {
        return orders.size();
    }
}
