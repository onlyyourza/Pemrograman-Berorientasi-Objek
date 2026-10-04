public class Janitor14 extends Person14 {
    private String assignedArea;
    private String shift;

    public Janitor14() {
        super();
        this.assignedArea = "-";
        this.shift = "-";
    }

    public Janitor14(String name, String email, String phoneNumber,
            String assignedArea, String shift) {
        super(name, email, phoneNumber);
        this.assignedArea = assignedArea;
        this.shift = shift;
    }

    public void setAssignedArea(String assignedArea) {
        this.assignedArea = assignedArea;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Area         : " + assignedArea);
        System.out.println("Shift        : " + shift);
    }

    public void cleanArea() {
        System.out.println(name + " is cleaning " + assignedArea
                + " (" + shift + " shift).");
    }
}
