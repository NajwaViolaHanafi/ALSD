package Praktikum03;

import java.util.Scanner;
public class DosenDemo19 {
    public DosenDemo19(String kode, String nama, Boolean jenisKelamin, int usia) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mata kuliah yang ingin diinput: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        Dosen19[] arrayofDosen19 = new Dosen19[jumlahDosen];
        for(int i = 0; i < jumlahDosen; i++){
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true: Wanita/false: Laki-laki): ");
            Boolean jenisKelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia: ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayofDosen19[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        System.out.println("--------------------------------------");
    }

        DataDosen19 dataDosen = new DataDosen19();
        System.out.println("=== Semua Data Dosen ===");
        dataDosen.dataSemuaDosen(arrayofDosen19);

        System.out.println("=== Jumlah Dosen Per Jenis Kelamin ===");
        dataDosen.jumlahDosenPerjenisKelamin(arrayofDosen19);

        System.out.println("=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayofDosen19);

        System.out.println("=== Dosen Tertua ===");
        dataDosen.infoDosenPalingTua(arrayofDosen19);

        System.out.println("=== Dosen Termuda ===");
        dataDosen.infoDosenPalingMuda(arrayofDosen19);
    }
}