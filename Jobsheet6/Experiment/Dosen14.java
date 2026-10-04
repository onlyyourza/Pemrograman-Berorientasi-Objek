public class Dosen14 extends Pegawai14 {
    public String nidn;

    public Dosen14() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public Dosen14(String nip, String nama, double gaji,
            String nidn) {
        System.out.print("Objek dari class Dosen dibuat "
                + "dengan constructor berparameter");
    }

    public String getInfo() {
        return "NIDN         : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}
