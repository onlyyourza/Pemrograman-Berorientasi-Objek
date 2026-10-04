public class Dosen14 extends Pegawai14 {
    public String nidn;

    public Dosen14() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP          : " + super.nip + "\n";
        info += "Nama         : " + super.nama + "\n";
        info += "Gaji         : " + super.gaji + "\n";
        info += "NIDN         : " + this.nidn + "\n";
        return info;
    }
}
