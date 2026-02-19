public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Nera";
        mhs1.nim = "254107020117";   
        mhs1.kelas = "TI-1D";
        mhs1.ipk = 4.00;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIpk(3.70);
        mhs1.tampilkanInformasi();
    }
}