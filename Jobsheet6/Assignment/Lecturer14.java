public class Lecturer14 extends Person14 {
    private String nip;
    private String expertise;

    public Lecturer14() {
        super();
        this.nip = "-";
        this.expertise = "-";
    }

    public Lecturer14(String name, String email, String phoneNumber,
            String nip, String expertise) {
        super(name, email, phoneNumber);
        this.nip = nip;
        this.expertise = expertise;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIP          : " + nip);
        System.out.println("Expertise    : " + expertise);
    }

    public void teach() {
        System.out.println(name + " (NIP " + nip + ") is teaching "
                + expertise + ".");
    }
}
