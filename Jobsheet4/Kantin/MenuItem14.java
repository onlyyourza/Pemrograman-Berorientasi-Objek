public class MenuItem14 {
    private String itemCode;
    private String name;
    private String category;
    private double price;

    public MenuItem14(String itemCode, String name, String category, double price) {
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return "\t" + name + " [" + category + "] Rp" + (long) price + "\n";
    }
}
