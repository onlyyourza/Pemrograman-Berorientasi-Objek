import java.time.LocalDate;

public class RumahSakitDemo14 {
    public static void main(String[] args) {
        Pegawai14 ani = new Pegawai14("1234", "dr. Ani");
        Pegawai14 bagus = new Pegawai14("4567", "dr. Bagus");

        Pegawai14 desi = new Pegawai14("1234", "Ns. Desi");
        Pegawai14 eka = new Pegawai14("4567", "Ns. Eka");

        Pasien14 pasien1 = new Pasien14("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien14 pasien2 = new Pasien14("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
