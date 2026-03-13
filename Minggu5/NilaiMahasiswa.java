package Minggu5;

public class NilaiMahasiswa {
    int nilaiUTS[];
    int nilaiUAS[];

    NilaiMahasiswa(int uts[], int uas[]){
        nilaiUTS = uts;
        nilaiUAS = uas;
    }
    int cariMaks(int arr[], int l, int r){
        if(l == r){
            return arr[l];
        }

        int mid = (l + r) / 2;
        int lmax = cariMaks(arr, l, mid);
        int rmax = cariMaks(arr, mid+1, r);

        return Math.max(lmax, rmax);
    }
    int cariMin(int arr[], int l, int r){
        if(l == r){
            return arr[l];
        }

        int mid = (l + r) / 2;
        int lmin = cariMin(arr, l, mid);
        int rmin = cariMin(arr, mid+1, r);

        return Math.min(lmin, rmin);
    }
    double rataUAS(){
        int total = 0;

        for(int i = 0; i < nilaiUAS.length; i++){
            total = total + nilaiUAS[i];
        }

        return (double) total / nilaiUAS.length;
    }
}