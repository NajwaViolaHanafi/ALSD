package Pertemuan14;

public class BinaryTreeArray19 {
    Mahasiswa19[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray19() {
        this.dataMahasiswa = new Mahasiswa19[10];
        idxLast = -1;
    }
    void populateData(Mahasiswa19 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    void add(Mahasiswa19 data) {

        if (idxLast == -1) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }
        int i = 0;
        while (i < dataMahasiswa.length) {
            if (dataMahasiswa[i] == null) {
                dataMahasiswa[i] = data;
                if (i > idxLast) {
                    idxLast = i;
                }
                return;
            }
            if (data.ipk < dataMahasiswa[i].ipk) {
                i = 2 * i + 1; 
            } else {
                i = 2 * i + 2;
            }
        }
        System.out.println("Binary Tree Array penuh");
    }
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilkanInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilkanInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}