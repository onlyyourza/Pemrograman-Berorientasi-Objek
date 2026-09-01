public class DemoSquare14 {
    public static void main(String[] args) {
        Rectangle14 r1 = new Rectangle14();
        r1.length = 12;
        r1.width = 8;

        r1.displayInfo();
        System.out.println("Area          : " + r1.getArea());
        System.out.println("Circumference : " + r1.getCircumference());
    }
}
