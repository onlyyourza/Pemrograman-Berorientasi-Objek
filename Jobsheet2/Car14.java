public class Car14 {
    public String brand;
    public String model;
    public String color;
    public String plateNumber;
    public int year;
    public int gear;

    public int upGear(int gear) {
        this.gear = gear;
        gear++;
        return gear;
    }

    public int downGear(int gear) {
        this.gear = gear;
        gear--;
        return gear;
    }

    public void displayInfo() {
        System.out.println("Brand       : " + brand);
        System.out.println("Model       : " + model);
        System.out.println("Color       : " + color);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Year        : " + year);
    }
}
