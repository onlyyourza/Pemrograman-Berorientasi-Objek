package Soal1;

public class OrderItem14 {
    private int quantity;
    private double unitPrice;
    private Product14 product;

    public OrderItem14(Product14 product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = product.getProductPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        }
    }

    public Product14 getProduct() {
        return product;
    }

    public void setProduct(Product14 product) {
        this.product = product;
    }

    public double calculateSubtotal() {
        return unitPrice * quantity;
    }

    public String getInfo() {
        return product.getProductName() + " x" + quantity + " @Rp"
                + (long) unitPrice + " = Rp" + (long) calculateSubtotal();
    }
}
