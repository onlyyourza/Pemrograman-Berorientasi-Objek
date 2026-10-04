import java.time.LocalDate;

public class Konsultasi14 {
    private LocalDate tanggal;
    private Pegawai14 dokter;
    private Pegawai14 perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai14 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai14 dokter) {
        this.dokter = dokter;
    }

    public Pegawai14 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai14 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";

        return info;
    }
}
