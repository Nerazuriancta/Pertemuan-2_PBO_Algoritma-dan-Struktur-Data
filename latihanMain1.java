public class latihanMain1 {
    public static void main(String[] args) {
        latihan1 mk1 = new latihan1();
        mk1.kodeMK = "ASD01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        latihan1 mk2 = new latihan1("PBO02", "Pemrograman Berorientasi Objek", 3, 6);
        mk2.tampilkanInformasi();
        mk2.tambahJam(2);
        mk2.kurangiJam(10);
    }
}