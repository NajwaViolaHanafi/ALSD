package Pertemuan14;

public class BinaryTree19 {
    Node19 root;

    public BinaryTree19() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // =========================
    // ADD ITERATIF
    // =========================
    public void add(Mahasiswa19 mahasiswa) {
        Node19 newNode = new Node19(mahasiswa);

        if (isEmpty()) {
            root = newNode;
        } else {
            Node19 current = root;
            Node19 parent;

            while (true) {
                parent = current;

                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }

                } else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // =========================
    // ADD REKURSIF
    // =========================
    public void addRekursif(Mahasiswa19 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }
    private Node19 addRekursif(Node19 current, Mahasiswa19 mahasiswa) {

        if (current == null) {
            return new Node19(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        }
        else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }
    // =========================
    // CARI IPK TERKECIL
    // =========================
    void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node19 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilkanInformasi();
    }
    void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node19 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilkanInformasi();
    }
    // =========================
    // TAMPILKAN IPK DI ATAS BATAS
    // =========================
    void tampilMahasiswaIPKdiAtas(Node19 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilkanInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }

    // =========================
    // FIND
    // =========================
    boolean find(double ipk) {
        Node19 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                return true;

            } else if (ipk < current.mahasiswa.ipk) {
                current = current.left;

            } else {
                current = current.right;
            }
        }

        return false;
    }

    // =========================
    // PRE ORDER
    // =========================
    void traversePreOrder(Node19 node) {
        if (node != null) {
            node.mahasiswa.tampilkanInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // =========================
    // IN ORDER
    // =========================
    void traverseInOrder(Node19 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilkanInformasi();
            traverseInOrder(node.right);
        }
    }

    // =========================
    // POST ORDER
    // =========================
    void traversePostOrder(Node19 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilkanInformasi();
        }
    }

    // =========================
    // GET SUCCESSOR
    // =========================
    Node19 getSuccessor(Node19 del) {
        Node19 successorParent = del;
        Node19 successor = del;
        Node19 current = del.right;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    // =========================
    // DELETE
    // =========================
    void delete(double ipk) {

        if (isEmpty()) {
            System.out.println("Binary Tree kosong");
            return;
        }

        Node19 parent = root;
        Node19 current = root;
        boolean isLeftChild = false;

        while (current != null && current.mahasiswa.ipk != ipk) {

            parent = current;

            if (ipk < current.mahasiswa.ipk) {
                isLeftChild = true;
                current = current.left;

            } else {
                isLeftChild = false;
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        // tidak punya anak
        if (current.left == null && current.right == null) {

            if (current == root) {
                root = null;

            } else if (isLeftChild) {
                parent.left = null;

            } else {
                parent.right = null;
            }
        }

        // hanya punya anak kanan
        else if (current.left == null) {

            if (current == root) {
                root = current.right;

            } else if (isLeftChild) {
                parent.left = current.right;

            } else {
                parent.right = current.right;
            }
        }

        // hanya punya anak kiri
        else if (current.right == null) {

            if (current == root) {
                root = current.left;

            } else if (isLeftChild) {
                parent.left = current.left;

            } else {
                parent.right = current.left;
            }
        }

        // punya dua anak
        else {

            Node19 successor = getSuccessor(current);

            if (current == root) {
                root = successor;

            } else if (isLeftChild) {
                parent.left = successor;

            } else {
                parent.right = successor;
            }

            successor.left = current.left;
        }
    }
}