public class SimpleWordCountServer {
    private int nWorkers;

    /**
     * Constructor untuk simple word count server
     * 
     * @param nWorkers jumlah maximum threads yang tersedia pada server a.k.a thread
     *                 pool
     */
    SimpleWordCountServer(int nWorkers) {

    }

    /**
     * Ikuti instruksi yang ada di deskripsi soal ya!
     * 1. processRequests akan membuat threads dan memetakan elemen-elemen requests
     * kepada threads tersebut
     * 2. setiap thread kemudian memanggil method countWords
     * 3. main thread (thread yang invoked method ini) akan menunggu semua thread
     * selesai
     * 4. terakhir main thread akan mengembalikan hasil penghitungan kata untuk
     * setiap elemen requests
     * 
     * @param requests array kalimat yang dikirimkan client
     */
    public Integer[] processRequests(String[] requests) throws InterruptedException {

    }

    /**
     * countWords adalah metode yang mengembalikkan jumlah kata dalam suatu kalimat
     * HINT : beberapa fungsi yang berguna :
     * - trim() : menghilangkan trailing / leading white space
     * - isWhiteSpace() : cek apakah suatu karakter merupakan white space (tab,
     * space atau newline)
     * - isEmpty() : cek apakah suatu string kosong ("") atau tidak
     * seluruh fungsi diatas dapat dipakai dengan namaVariabelString.namaFungsi()
     * misalnya :
     * String s1 = "tomoro"
     * s1.isEmpty() -> akan menghasilkan nilai false
     * - charAt(i) : memberikan karakter pada indeks i.
     * Cara pemakaiannya string.charAt(i) dengan i sebagai indeks.
     * 
     * HINT 2 : Coba iterasi perkarakter di string kalian dan gunakan whitespace
     * sebagai patokan akhir kalimat :D
     * 
     * @param request kalimat yang dikirimkan client
     */
    protected int countWords(String request) {

    }
}
