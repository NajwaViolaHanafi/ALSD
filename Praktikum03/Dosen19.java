package Praktikum03;

public class Dosen19 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen19() {
    }

    public Dosen19(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String tampilJenisKelamin(){
        return jenisKelamin ? "Wanita" : "Pria";
    }
}
