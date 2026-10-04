package Soal2;

public class Service14 {
    private String serviceName;
    private double servicePrice;

    public Service14(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        if (servicePrice >= 0) {
            this.servicePrice = servicePrice;
        }
    }

    public String getInfo() {
        return serviceName + " - Rp" + (long) servicePrice;
    }
}
