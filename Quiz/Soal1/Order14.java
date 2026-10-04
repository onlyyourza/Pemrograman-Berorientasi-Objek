package Soal1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order14 {
    private int orderId;
    private LocalDate orderDate;
    private Customer14 customer;
    private ArrayList<OrderItem14> items;

    public Order14(int orderId, Customer14 customer, LocalDate orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.items = new ArrayList<OrderItem14>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer14 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer14 customer) {
        this.customer = customer;
    }

    public ArrayList<OrderItem14> getItems() {
        return items;
    }

    public void createOrder() {
        if (customer != null) {
            customer.addOrder(this);
        }
    }

    public void editOrder(LocalDate newOrderDate) {
        if (newOrderDate != null) {
            this.orderDate = newOrderDate;
        }
    }

    public boolean addItem(Product14 product, int quantity) {
        if (product == null || quantity <= 0) {
            return false;
        }

        Stock14 stock = product.getStock();

        if (stock == null || !stock.isAvailable(quantity)) {
            return false;
        }

        stock.reduceStock(quantity);
        items.add(new OrderItem14(product, quantity));
        return true;
    }

    public int countItems() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0;

        for (OrderItem14 item : items) {
            total += item.calculateSubtotal();
        }

        return total;
    }

    public String getInfo() {
        String info = "";
        info += "No. Order   : " + orderId + "\n";
        info += "Tanggal     : " + orderDate + "\n";
        info += "Pelanggan   : " + customer.getInfo() + "\n";
        info += "Daftar Item :\n";

        for (OrderItem14 item : items) {
            info += "  - " + item.getInfo() + "\n";
        }

        info += "Jumlah Item : " + countItems() + "\n";
        info += "TOTAL       : Rp" + (long) calculateTotal() + "\n";

        return info;
    }
}
