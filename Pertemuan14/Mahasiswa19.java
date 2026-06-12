package Pertemuan14;

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa19() {

    }

    public Mahasiswa19(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println(
            "NIM: " + nim +
            " Nama: " + nama +
            " Kelas: " + kelas +
            " IPK: " + ipk
        );
    }
}