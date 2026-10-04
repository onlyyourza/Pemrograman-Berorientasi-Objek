package Soal1;

import java.util.ArrayList;

public class Product14 {
    private static ArrayList<Product14> productList = new ArrayList<Product14>();

    private int productId;
    private String productName;
    private double productPrice;
    private String productType;
    private Stock14 stock;

    public Product14(int productId, String productName, double productPrice,
            String productType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice >= 0) {
            this.productPrice = productPrice;
        }
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Stock14 getStock() {
        return stock;
    }

    public void setStock(Stock14 stock) {
        this.stock = stock;
    }

    public static void addProduct(Product14 p) {
        if (p != null && selectProduct(p.getProductId()) == null) {
            productList.add(p);
        }
    }

    public static boolean modifyProduct(int productId, double newPrice) {
        Product14 p = selectProduct(productId);

        if (p == null) {
            return false;
        }

        p.setProductPrice(newPrice);
        return true;
    }

    public static Product14 selectProduct(int productId) {
        for (Product14 p : productList) {
            if (p.getProductId() == productId) {
                return p;
            }
        }

        return null;
    }

    public static ArrayList<Product14> getProductList() {
        return productList;
    }

    public String getInfo() {
        return productName + " (" + productType + ") - Rp"
                + (long) productPrice;
    }
}
