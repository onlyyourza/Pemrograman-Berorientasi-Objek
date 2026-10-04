public class Student14 extends Person14 {
    private String nim;
    private String major;

    public Student14() {
        super();
        this.nim = "-";
        this.major = "-";
    }

    public Student14(String name, String email, String phoneNumber,
            String nim, String major) {
        super(name, email, phoneNumber);
        this.nim = nim;
        this.major = major;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM          : " + nim);
        System.out.println("Major        : " + major);
    }

    public void study() {
        System.out.println(name + " (NIM " + nim + ") is studying "
                + major + ".");
    }
}
