public class MotorDemo14 {
    public static void main(String[] args) {
        Motor14 motor1 = new Motor14();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor14 motor2 = new Motor14();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();

        Motor14 motor3 = new Motor14();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();

        Motor14 motor4 = new Motor14();
        motor4.setPlatNomor("L 7777 ZZ");
        motor4.setIsMesinOn(true);
        motor4.setKecepatan(150);
        motor4.setKecepatan(-20);
        motor4.setKecepatan(100);
        motor4.displayStatus();
    }
}
