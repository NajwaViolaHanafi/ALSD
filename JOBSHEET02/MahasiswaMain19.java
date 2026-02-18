package JOBSHEET02;

class MahasiswaMain19 {
    public static void main(String[] args) {

        Mahasiswa19 mhs1 = new Mahasiswa19();
        mhs1.nama = "Najwa Viola Hanafi";
        mhs1.nim = "254107060002";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(4.00);
        mhs1.tampilkanInformasi();

        Mahasiswa19 mhs2 = new Mahasiswa19("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}