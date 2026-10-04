package Soal1;

import java.util.ArrayList;

public class Customer14 {
    private static ArrayList<Customer14> customerList = new ArrayList<Customer14>();

    private int customerId;
    private String customerName;
    private String address;
    private String phone;
    private ArrayList<Order14> orders;

    public Customer14(int customerId, String customerName, String address,
            String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.orders = new ArrayList<Order14>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Order14> getOrders() {
        return orders;
    }

    public void addOrder(Order14 order) {
        if (order != null && !orders.contains(order)) {
            orders.add(order);
        }
    }

    public static void addCustomer(Customer14 c) {
        if (c != null && findCustomer(c.getCustomerId()) == null) {
            customerList.add(c);
        }
    }

    public static boolean editCustomer(int customerId, String customerName,
            String address, String phone) {
        Customer14 c = findCustomer(customerId);

        if (c == null) {
            return false;
        }

        c.setCustomerName(customerName);
        c.setAddress(address);
        c.setPhone(phone);
        return true;
    }

    public static boolean deleteCustomer(int customerId) {
        Customer14 c = findCustomer(customerId);

        if (c == null) {
            return false;
        }

        customerList.remove(c);
        return true;
    }

    public static Customer14 findCustomer(int customerId) {
        for (Customer14 c : customerList) {
            if (c.getCustomerId() == customerId) {
                return c;
            }
        }

        return null;
    }

    public static ArrayList<Customer14> getCustomerList() {
        return customerList;
    }

    public String getInfo() {
        return customerName + " (ID " + customerId + "), " + address
                + ", telp " + phone;
    }
}
