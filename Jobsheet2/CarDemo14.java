public class CarDemo14 {
    public static void main(String[] args) {
        Car14 c1 = new Car14();
        c1.brand = "Toyota";
        c1.model = "Avanza";
        c1.color = "Hitam";
        c1.plateNumber = "N 1234 AB";
        c1.year = 2020;
        c1.gear = 3;
        c1.displayInfo();

        System.out.println("Gear: " + c1.gear);
        System.out.println("Naik Gear: " + c1.upGear(c1.gear));
        System.out.println("Turun Gear: " + c1.downGear(c1.gear));
    }
}
