package Soal2;

public class Employee14 {
    private String employeeId;
    private String name;
    private String position;
    private int handledOrders;

    public Employee14(String employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.handledOrders = 0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHandledOrders() {
        return handledOrders;
    }

    public void addHandledOrder() {
        this.handledOrders++;
    }

    public String getInfo() {
        return name + " (" + employeeId + ") - " + position;
    }
}
