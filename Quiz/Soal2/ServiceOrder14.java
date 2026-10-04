package Soal2;

public class ServiceOrder14 {
    private String orderId;
    private Vehicle14 vehicle;
    private Service14 service;
    private Employee14 mechanic;

    public ServiceOrder14(String orderId, Vehicle14 vehicle,
            Service14 service, Employee14 mechanic) {
        this.orderId = orderId;
        this.vehicle = vehicle;
        this.service = service;
        this.mechanic = mechanic;

        if (mechanic != null) {
            mechanic.addHandledOrder();
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Vehicle14 getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle14 vehicle) {
        this.vehicle = vehicle;
    }

    public Service14 getService() {
        return service;
    }

    public void setService(Service14 service) {
        this.service = service;
    }

    public Employee14 getMechanic() {
        return mechanic;
    }

    public void setMechanic(Employee14 mechanic) {
        this.mechanic = mechanic;
    }

    public double getServiceFee() {
        return vehicle.getServiceFee();
    }

    public double calculateTotalCost() {
        return service.getServicePrice() + vehicle.getServiceFee();
    }

    public String getInfo() {
        String info = "";
        info += "No. Order      : " + orderId + "\n";
        info += "Pelanggan      : " + vehicle.getOwner().getName() + "\n";
        info += "No. Telepon    : " + vehicle.getOwner().getPhoneNumber() + "\n";
        info += "Kendaraan      : " + vehicle.getInfo() + "\n";
        info += "Servis Dipilih : " + service.getServiceName() + "\n";
        info += "Biaya Servis   : Rp" + (long) service.getServicePrice() + "\n";
        info += "Biaya Jasa     : Rp" + (long) getServiceFee()
                + " (" + vehicle.getVehicleType() + ")\n";
        info += "Mekanik        : " + mechanic.getInfo() + "\n";
        info += "TOTAL ESTIMASI : Rp" + (long) calculateTotalCost() + "\n";

        return info;
    }
}
