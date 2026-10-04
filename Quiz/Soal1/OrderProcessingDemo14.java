package Soal1;

import java.time.LocalDate;

public class OrderProcessingDemo14 {
    public static void main(String[] args) {
        // 1. Data pelanggan
        Customer14 mafaza = new Customer14(
                1, "Mafaza Husnadani", "Jl. Soekarno Hatta, Malang", "081234567890");
        Customer14 rafi = new Customer14(
                2, "Rafi Ardiansyah", "Jl. Veteran, Malang", "085612340987");

        Customer14.addCustomer(mafaza);
        Customer14.addCustomer(rafi);

        // 2. Data produk dan stoknya
        Product14 keyboard = new Product14(101, "Keyboard Mekanik", 450000, "Aksesoris");
        Product14 mouse = new Product14(102, "Mouse Wireless", 175000, "Aksesoris");
        Product14 monitor = new Product14(103, "Monitor 24 inch", 1850000, "Elektronik");

        Product14.addProduct(keyboard);
        Product14.addProduct(mouse);
        Product14.addProduct(monitor);

        // Relasi 1 ke 1: setiap produk dicatat oleh satu data stok
        new Stock14(keyboard, 10, 1);
        new Stock14(mouse, 25, 1);
        new Stock14(monitor, 3, 2);

        System.out.println("========================================");
        System.out.println("       DAFTAR PRODUK DAN STOK AWAL      ");
        System.out.println("========================================");

        for (Product14 p : Product14.getProductList()) {
            System.out.println(p.getInfo() + " | " + p.getStock().getInfo());
        }

        System.out.println();

        // 3. Order pertama
        Order14 order1 = new Order14(1001, mafaza, LocalDate.of(2026, 9, 22));
        order1.createOrder();
        order1.addItem(keyboard, 2);
        order1.addItem(mouse, 1);

        // 4. Order kedua milik pelanggan yang sama
        Order14 order2 = new Order14(1002, mafaza, LocalDate.of(2026, 9, 22));
        order2.createOrder();
        order2.addItem(monitor, 1);

        // 5. Order milik pelanggan lain
        Order14 order3 = new Order14(1003, rafi, LocalDate.of(2026, 9, 23));
        order3.createOrder();
        order3.addItem(mouse, 3);

        // Percobaan menambah item melebihi stok yang tersedia
        boolean gagal = order3.addItem(monitor, 10);
        System.out.println("Menambah 10 unit Monitor (stok hanya 2) : " + gagal
                + " (ditolak oleh Stock14.isAvailable())");
        System.out.println();

        // 6. Tampilkan seluruh order
        System.out.println("========================================");
        System.out.println("             DAFTAR ORDER               ");
        System.out.println("========================================");

        for (Customer14 c : Customer14.getCustomerList()) {
            System.out.println(">> Pelanggan: " + c.getCustomerName()
                    + " memiliki " + c.getOrders().size() + " order");
            System.out.println();

            for (Order14 o : c.getOrders()) {
                System.out.println(o.getInfo());
                System.out.println("----------------------------------------");
            }
        }

        // 7. Uji operasi statis dan perubahan stok
        System.out.println("========================================");
        System.out.println("        UJI OPERASI CRUD DAN STOK       ");
        System.out.println("========================================");

        Product14.modifyProduct(102, 165000);
        System.out.println("Harga mouse setelah modifyProduct() : Rp"
                + (long) mouse.getProductPrice());

        Customer14.editCustomer(2, "Rafi Ardiansyah", "Jl. Ijen, Malang", "085612340987");
        System.out.println("Alamat Rafi setelah editCustomer()  : " + rafi.getAddress());

        System.out.println("Stok setelah semua order            :");

        for (Product14 p : Product14.getProductList()) {
            System.out.println("  - " + p.getProductName() + " : "
                    + p.getStock().getQuantity() + " unit");
        }

        System.out.println("deleteCustomer(99) (ID tidak ada)   : "
                + Customer14.deleteCustomer(99));
    }
}
