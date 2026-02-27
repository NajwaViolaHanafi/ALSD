package Praktikum03;

public class Mahasiswa19 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public Mahasiswa19() {
    }

    public Mahasiswa19(String nama, String nim, float ipk, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    void cetakInfo()  {
        System.out.println("NIM     :"+ nim);
        System.out.println("Nama    :"+ nama);
        System.out.println("IPK     :"+ ipk);
        System.out.println("Kelas   :"+ kelas);
    }
}