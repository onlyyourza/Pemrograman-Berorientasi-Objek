import java.util.ArrayList;

public class Order14 {
    private String orderId;
    private Customer14 customer;
    private ArrayList<MenuItem14> items;
    private String status;

    public Order14(String orderId, Customer14 customer, MenuItem14 firstItem) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<MenuItem14>();
        this.items.add(firstItem);
        this.status = "NEW";
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer14 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer14 customer) {
        this.customer = customer;
    }

    public ArrayList<MenuItem14> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addItem(MenuItem14 item) {
        items.add(item);
    }

    public boolean removeItem(String itemCode) {
        if (items.size() <= 1) {
            return false;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemCode().equals(itemCode)) {
                items.remove(i);
                return true;
            }
        }

        return false;
    }

    public int countItems() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0;

        for (MenuItem14 item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public String getInfo() {
        String info = "";
        info += "No. Pesanan   : " + this.orderId + "\n";
        info += "Pembeli       : " + customer.getInfo() + "\n";
        info += "Daftar Menu   :\n";

        for (MenuItem14 item : items) {
            info += item.getInfo();
        }

        info += "Jumlah Item   : " + countItems() + "\n";
        info += "TOTAL         : Rp" + (long) calculateTotal() + "\n";
        info += "Status        : " + this.status + "\n";

        return info;
    }
}
