package Soal1;

public class Stock14 {
    private int quantity;
    private int shopNo;
    private Product14 product;

    public Stock14(Product14 product, int quantity, int shopNo) {
        this.product = product;
        this.quantity = quantity;
        this.shopNo = shopNo;

        if (product != null) {
            product.setStock(this);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public Product14 getProduct() {
        return product;
    }

    public void setProduct(Product14 product) {
        this.product = product;
    }

    public void addStock(int qty) {
        if (qty > 0) {
            this.quantity += qty;
        }
    }

    public void modifyStock(int qty) {
        setQuantity(qty);
    }

    public boolean isAvailable(int qty) {
        return qty > 0 && this.quantity >= qty;
    }

    public boolean reduceStock(int qty) {
        if (!isAvailable(qty)) {
            return false;
        }

        this.quantity -= qty;
        return true;
    }

    public String getInfo() {
        return "Toko " + shopNo + " - sisa stok " + quantity + " unit";
    }
}
