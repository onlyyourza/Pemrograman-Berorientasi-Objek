package Soal2;

import java.util.ArrayList;

public class BengkelMajuDemo14 {
    public static void main(String[] args) {
        // 1. Data pelanggan
        Customer14 mafaza = new Customer14("Mafaza Husnadani", "081234567890");
        Customer14 rafi = new Customer14("Rafi Ardiansyah", "085612340987");

        // 2. Data kendaraan (2 mobil + 2 motor)
        Vehicle14 avanza = new Vehicle14(
                "N 1234 AB", "Toyota", "Avanza", Vehicle14.TYPE_CAR);
        Vehicle14 beat = new Vehicle14(
                "N 5678 CD", "Honda", "Beat", Vehicle14.TYPE_MOTORCYCLE);
        Vehicle14 brio = new Vehicle14(
                "N 9012 EF", "Honda", "Brio", Vehicle14.TYPE_CAR);
        Vehicle14 vario = new Vehicle14(
                "N 3456 GH", "Honda", "Vario 160", Vehicle14.TYPE_MOTORCYCLE);

        // Satu pelanggan boleh punya banyak kendaraan
        // satu kendaraan hanya milik satu pelanggan.
        mafaza.addVehicle(avanza);
        mafaza.addVehicle(beat);
        mafaza.addVehicle(brio);
        rafi.addVehicle(vario);

        // 3. Daftar layanan bengkel
        Service14 gantiOli = new Service14("Ganti Oli Mesin", 120000);
        Service14 tuneUp = new Service14("Tune Up Mesin", 250000);
        Service14 servisRem = new Service14("Servis Rem", 90000);
        Service14 servisRutin = new Service14("Servis Rutin", 75000);

        // 4. Data karyawan
        Employee14 budi = new Employee14("EMP01", "Budi Santoso", "Mekanik Mobil");
        Employee14 sari = new Employee14("EMP02", "Sari Wulandari", "Mekanik Motor");

        // 5. Transaksi servis
        ArrayList<ServiceOrder14> orders = new ArrayList<ServiceOrder14>();
        orders.add(new ServiceOrder14("SO001", avanza, tuneUp, budi));
        orders.add(new ServiceOrder14("SO002", beat, gantiOli, sari));
        orders.add(new ServiceOrder14("SO003", brio, servisRem, budi));
        orders.add(new ServiceOrder14("SO004", vario, servisRutin, sari));

        // 6. Tampilkan data pelanggan dan kendaraannya
        System.out.println("========================================");
        System.out.println("      BENGKEL MAJU - DATA PELANGGAN     ");
        System.out.println("========================================");

        ArrayList<Customer14> customers = new ArrayList<Customer14>();
        customers.add(mafaza);
        customers.add(rafi);

        for (Customer14 c : customers) {
            System.out.println("Nama Pelanggan : " + c.getName());
            System.out.println("No. Telepon    : " + c.getPhoneNumber());
            System.out.println("Daftar Kendaraan:");

            for (Vehicle14 v : c.getVehicles()) {
                System.out.println("  - " + v.getInfo());
            }

            System.out.println();
        }

        // 7. Tampilkan seluruh informasi servis
        System.out.println("========================================");
        System.out.println("     DAFTAR ESTIMASI BIAYA SERVIS       ");
        System.out.println("========================================");

        double grandTotal = 0;

        for (ServiceOrder14 order : orders) {
            System.out.println(order.getInfo());
            System.out.println("----------------------------------------");
            grandTotal += order.calculateTotalCost();
        }

        System.out.println("TOTAL SELURUH ESTIMASI : Rp" + (long) grandTotal);
        System.out.println();

        // 8. Rekap pekerjaan mekanik
        System.out.println("========================================");
        System.out.println("        REKAP PEKERJAAN MEKANIK         ");
        System.out.println("========================================");
        System.out.println(budi.getInfo() + " | Order ditangani: "
                + budi.getHandledOrders());
        System.out.println(sari.getInfo() + " | Order ditangani: "
                + sari.getHandledOrders());
    }
}
