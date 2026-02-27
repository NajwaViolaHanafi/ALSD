package Praktikum03;

class Mahasiswa {
    String nama;
    String nim;

    // Constructor tanpa parameter
    Mahasiswa() {
        nama = "Tidak diketahui";
        nim = "-";
    }

    // Constructor dengan parameter
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
}