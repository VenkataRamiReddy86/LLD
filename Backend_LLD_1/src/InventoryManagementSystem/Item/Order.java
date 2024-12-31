package InventoryManagementSystem.Item;

public class Order implements Comparable<Order> {
    private String orderID;
    private boolean isExpress;

    Order(boolean isExpress, String orderID) {
        this.isExpress = isExpress;
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public boolean isExpress() {
        return isExpress;
    }
    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress == o.isExpress)
        {
            return this.orderID.compareTo(o.orderID);
        }
        else if(this.isExpress)
        {
            return -1;
        }
        else
        return 1;
    }
}
