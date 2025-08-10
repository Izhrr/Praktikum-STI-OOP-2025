/**
 * Deque.java
 * Nama: [Silakan diisi]
 * NIM: [Silakan diisi]
 */

/**
 * Kelas Deque merupakan implementasi struktur data double-ended queue
 * menggunakan double linked list.
 * Mendukung operasi penambahan dan penghapusan elemen di kedua ujung.
 */
public class Deque<E> {

    /**
     * Kelas Node merepresentasikan satu elemen dalam Deque.
     * Menyimpan data serta reference ke node berikutnya dan sebelumnya.
     */
    private class Node {
        E data;
        Node next;
        Node prev;

        Node(E data) {
            // Lengkapi konstruktornya
        }
    }

    private Node head; // Menunjuk ke elemen pertama
    private Node tail; // Menunjuk ke elemen terakhir
    private int size;  // Menyimpan jumlah elemen dalam deque

    /**
     * Konstruktor untuk menginisialisasi deque kosong.
     */
    public Deque() {
        // Lengkapi konstruktornya
    }

    /**
     * Mengecek apakah deque kosong.
     * @return true jika kosong, false jika tidak
     */
    public boolean isEmpty() {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Mengembalikan jumlah elemen dalam deque.
     * @return jumlah elemen
     */
    public int getSize() {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Menambahkan elemen ke depan deque.
     * @param element elemen yang ingin ditambahkan
     */
    public void addFirst(E element) {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Menambahkan elemen ke belakang deque.
     * @param element elemen yang ingin ditambahkan
     */
    public void addLast(E element) {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Menghapus dan mengembalikan elemen dari depan deque.
     * Jika deque kosong, print "Deque kosong. Tidak bisa menghapus elemen".
     * @return elemen yang dihapus, atau null jika kosong
     */
    public E removeFirst() {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Menghapus dan mengembalikan elemen dari belakang deque.
     * Jika deque kosong, print "Deque kosong. Tidak bisa menghapus elemen".
     * @return elemen yang dihapus, atau null jika kosong
     */
    public E removeLast() {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Mengambil elemen pertama tanpa menghapusnya.
     * @return elemen pertama, atau null jika kosong
     */
    public E getHead() {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Mengambil elemen terakhir tanpa menghapusnya.
     * @return elemen terakhir, atau null jika kosong
     */
    public E getTail() {
        // Silakan tulis kodenya di bawah ini
    }

    /**
     * Menampilkan isi deque dalam format [elemen1, elemen2, ...]
     */
    public void display() {
        // Silakan tulis kodenya di bawah ini
    }
}
