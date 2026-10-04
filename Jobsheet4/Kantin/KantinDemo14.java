public class KantinDemo14 {
    public static void main(String[] args) {
        MenuItem14 nasgor = new MenuItem14(
                "MN01", "Nasi Goreng", "Makanan", 15000);
        MenuItem14 esTeh = new MenuItem14(
                "MN02", "Es Teh", "Minuman", 4000);
        MenuItem14 geprek = new MenuItem14(
                "MN03", "Ayam Geprek", "Makanan", 18000);

        Customer14 mafaza = new Customer14("C001", "Mafaza");
        mafaza.setPhoneNumber("081234567890");

        Order14 order1 = new Order14("ORD001", mafaza, nasgor);
        System.out.println("Pesanan dibuka dengan "
                + order1.countItems() + " menu.");

        order1.addItem(esTeh);
        System.out.println("Setelah menambah Es Teh  : "
                + order1.countItems() + " menu, total Rp"
                + (long) order1.calculateTotal());

        boolean hapusEsTeh = order1.removeItem("MN02");
        System.out.println("Menghapus Es Teh (MN02)  : " + hapusEsTeh);

        boolean hapusNasgor = order1.removeItem("MN01");
        System.out.println("Menghapus Nasi Goreng    : " + hapusNasgor
                + " (ditolak, menu terakhir tidak boleh dihapus)");

        order1.addItem(geprek);
        order1.setStatus("PAID");

        System.out.println();
        System.out.println("===== STRUK KANTIN =====");
        System.out.println(order1.getInfo());

        Customer14 rafi = new Customer14("C002", "Rafi");
        Order14 order2 = new Order14("ORD002", rafi, nasgor);

        System.out.println("===== STRUK KANTIN =====");
        System.out.println(order2.getInfo());
    }
}
