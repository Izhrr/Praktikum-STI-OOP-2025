/**
 * Deque.java
 * Nama: Izhar Alif Akbar
 * NIM: 18223129
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
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head; // Menunjuk ke elemen pertama
    private Node tail; // Menunjuk ke elemen terakhir
    private int size;  // Menyimpan jumlah elemen dalam deque

    /**
     * Konstruktor untuk menginisialisasi deque kosong.
     */
    public Deque() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Mengecek apakah deque kosong.
     * @return true jika kosong, false jika tidak
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Mengembalikan jumlah elemen dalam deque.
     * @return jumlah elemen
     */
    public int getSize() {
        return size;
    }

    /**
     * Menambahkan elemen ke depan deque.
     * @param element elemen yang ingin ditambahkan
     */
    public void addFirst(E element) {
        Node newNode = new Node(element);
        if (isEmpty()){
            head = newNode;
            tail = head;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    /**
     * Menambahkan elemen ke belakang deque.
     * @param element elemen yang ingin ditambahkan
     */
    public void addLast(E element) {
        Node newNode = new Node(element);
        if(isEmpty()){
            head = newNode;
            tail = head;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * Menghapus dan mengembalikan elemen dari depan deque.
     * Jika deque kosong, print "Deque kosong. Tidak bisa menghapus elemen".
     * @return elemen yang dihapus, atau null jika kosong
     */
    public E removeFirst() {
        if(isEmpty()){
            System.out.println("Deque kosong. Tidak bisa menghapus elemen.");
            return null;
        }
        else{
            E removedData = head.data;
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
                head.prev = null;
            }
            size--;
            return removedData;
            
        }
    }

    /**
     * Menghapus dan mengembalikan elemen dari belakang deque.
     * Jika deque kosong, print "Deque kosong. Tidak bisa menghapus elemen".
     * @return elemen yang dihapus, atau null jika kosong
     */
    public E removeLast() {
        if(isEmpty()){
            System.out.println("Deque kosong. Tidak bisa menghapus elemen.");
            return null;
        }
        else{
            E removedData = tail.data;
            if(tail == head){
                head = tail = null;
            }
            else{
                tail = tail.prev;
                tail.next = null;
            }
            size--;
            return removedData;
        }
    }

    /**
     * Mengambil elemen pertama tanpa menghapusnya.
     * @return elemen pertama, atau null jika kosong
     */
    public E getHead() {
        if(isEmpty()){
            return null;
        }
        else{
            return head.data;
        }
    }

    /**
     * Mengambil elemen terakhir tanpa menghapusnya.
     * @return elemen terakhir, atau null jika kosong
     */
    public E getTail() {
        if(isEmpty()){
            return null;
        }
        else{
            return tail.data;
        }
    }

    /**
     * Menampilkan isi deque dalam format [elemen1, elemen2, ...]
     */
    public void display() {
        if(isEmpty()){
            System.out.println("[]");
        }
        else{
            Node current = head;
            System.out.print("[");
            while(current != null){
                System.out.print(current.data);
                if(current.next != null){
                    System.out.print(", ");
                }
                current = current.next;
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        // Buat deque baru bertipe Integer
        Deque<Integer> deque = new Deque<>();

        System.out.println("Apakah deque kosong? " + deque.isEmpty()); // true

        // Tambahkan elemen
        deque.addFirst(10);   // [10]
        deque.addLast(20);    // [10, 20]
        deque.addFirst(5);    // [5, 10, 20]
        deque.addLast(25);    // [5, 10, 20, 25]

        // Tampilkan isi deque
        System.out.print("Isi deque: ");
        deque.display(); // [5, 10, 20, 25]

        // Tampilkan head dan tail
        System.out.println("Elemen pertama (head): " + deque.getHead()); // 5
        System.out.println("Elemen terakhir (tail): " + deque.getTail()); // 25

        // Hapus elemen dari depan dan belakang
        System.out.println("Menghapus dari depan: " + deque.removeFirst()); // 5
        System.out.println("Menghapus dari belakang: " + deque.removeLast()); // 25

        // Tampilkan isi deque setelah penghapusan
        System.out.print("Isi deque setelah remove: ");
        deque.display(); // [10, 20]

        // Tampilkan ukuran deque
        System.out.println("Ukuran deque sekarang: " + deque.getSize()); // 2

        // Hapus semua elemen
        deque.removeFirst(); // 10
        deque.removeFirst(); // 20

        // Coba hapus dari deque kosong
        deque.removeFirst(); // Deque kosong. Tidak bisa menghapus elemen

        // Cek lagi apakah deque kosong
        System.out.println("Apakah deque kosong? " + deque.isEmpty()); // true
    }
}