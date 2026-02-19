public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Nerazuriancta";
        mhs1.nim = "254107020117";   
        mhs1.kelas = "TI-1D";
        mhs1.ipk = 4.00;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIpk(3.90);
        mhs1.tampilkanInformasi();

        Mahasiswa21 mhs2 = new Mahasiswa21("Ayunda", "254107020118",3.90, "TI-1D");
        mhs2.updateIpk(4.00);
        mhs2.tampilkanInformasi();

        Mahasiswa21 mhs = new Mahasiswa21("Sarah Geluh", "254107020119", 3.90, "TI-1D");
        mhs.tampilkanInformasi();
    }
}