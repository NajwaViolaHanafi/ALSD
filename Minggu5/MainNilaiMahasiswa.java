package Minggu5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {

        int nilaiUTS[] = {78,85,90,76,92,88,80,82};
        int nilaiUAS[] = {82,88,87,79,95,85,83,84};

        NilaiMahasiswa nm = new NilaiMahasiswa(nilaiUTS, nilaiUAS);

        int utsMax = nm.cariMaks(nilaiUTS, 0, nilaiUTS.length-1);
        int utsMin = nm.cariMin(nilaiUTS, 0, nilaiUTS.length-1);
        double rataUAS = nm.rataUAS();

        System.out.println("Nilai UTS Tertinggi : " + utsMax);
        System.out.println("Nilai UTS Terendah  : " + utsMin);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
}