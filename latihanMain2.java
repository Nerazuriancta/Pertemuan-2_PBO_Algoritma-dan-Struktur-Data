public class latihanMain2 {
    public static void main(String[] args) {
        latihan2 dsn1 = new latihan2();
        dsn1.idDosen = "D001";
        dsn1.nama = "Pak Budi";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Basis Data";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa kerja          : "+dsn1.hitungMasaKerja(2026)+" tahun");
        dsn1.ubahKeahlian("Pemrograman Java");

        
        latihan2 dsn2 = new latihan2("D002", "Bu Sari", true, 2018, "Jaringan");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja          : "+dsn2.hitungMasaKerja(2026)+ " tahun");
    }
}
