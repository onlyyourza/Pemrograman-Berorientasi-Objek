package Soal2;

public class Vehicle14 {
    public static final String TYPE_CAR = "Mobil";
    public static final String TYPE_MOTORCYCLE = "Motor";

    private String plateNumber;
    private String brand;
    private String model;
    private String vehicleType;
    private Customer14 owner;

    public Vehicle14(String plateNumber, String brand, String model,
            String vehicleType) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Customer14 getOwner() {
        return owner;
    }

    public void setOwner(Customer14 owner) {
        this.owner = owner;
    }

    public boolean isCar() {
        return TYPE_CAR.equalsIgnoreCase(vehicleType);
    }

    public double getServiceFee() {
        if (isCar()) {
            return 50000;
        }

        return 20000;
    }

    public String getInfo() {
        return vehicleType + " " + brand + " " + model
                + " (" + plateNumber + ")";
    }
}
