package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah19[] arrayofMatakuliah19 = new Matakuliah19[jumlah];

        String kode, nama;
        int sks, jumlahJam;

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode  : ");
            kode = sc.nextLine();
            System.out.print("Nama  : ");
            nama = sc.nextLine();
            System.out.print("Sks   : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam : ");
            jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------");

            arrayofMatakuliah19[i] = new Matakuliah19("", "", 0, 0);
            arrayofMatakuliah19[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah19[i].cetakInfo();
            System.out.println("-----------------------------------------------");
        }
    }
}