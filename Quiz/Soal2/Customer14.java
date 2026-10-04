package Soal2;

import java.util.ArrayList;

public class Customer14 {
    private String name;
    private String phoneNumber;
    private ArrayList<Vehicle14> vehicles;

    public Customer14(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<Vehicle14>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Vehicle14> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle14 vehicle) {
        if (vehicle == null) {
            return;
        }

        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            vehicle.setOwner(this);
        }
    }

    public int countVehicles() {
        return vehicles.size();
    }

    public String getInfo() {
        return name + " (" + phoneNumber + ") - "
                + countVehicles() + " kendaraan";
    }
}
