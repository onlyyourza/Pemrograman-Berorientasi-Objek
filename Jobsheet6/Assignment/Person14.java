public class Person14 {
    protected String name;
    protected String email;
    protected String phoneNumber;

    public Person14() {
        this.name = "-";
        this.email = "-";
        this.phoneNumber = "-";
    }

    public Person14(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Name         : " + name);
        System.out.println("Email        : " + email);
        System.out.println("Phone Number : " + phoneNumber);
    }
}
