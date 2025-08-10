import java.util.*;

public class Techbrosgram {
    // Menyimpan seluruh Bro yang terdaftar (key = nama bro)
    private Map<String, Bro> bros;

    // Menyimpan seluruh post yang terbuat (key = ID post)
    private Map<Integer, Post> posts;

    // Counter yang terus bertambah (increment) sebagai ID tiap post baru
    private int postCounter;

    /**
     * Konstruktor kelas Techbrosgram.
     * Inisialisasi struktur data yang dibutuhkan.
     * Nilai awal dari postCounter adalah 1.
     */
    public Techbrosgram() {}

    /**
     * Daftarkan Bro baru ke dalam sistem.
     * Jika nama Bro sudah ada, tidak perlu melakukan apa-apa.
     *
     * @param name nama Bro yang ingin didaftarkan
     */
    public void registerBros(String name) {}

    /**
     * Membuat Post baru oleh seorang Bro.
     * Jika nama Bro tidak valid (belum terdaftar), tidak perlu melakukan apa-apa.
     *
     * @param brosName nama Bro yang membuat Post
     * @param content  isi dari Post
     * 
     * Hint: gunakan postCounter sebagai ID unik untuk Post baru.
     *       Simpan Post baru ke dalam map posts di kelas ini,
     *       dan tambahkan Post tersebut ke dalam list posts milik Bro yang bersangkutan.
     */
    public void createPost(String brosName, String content) {}

    /**
     * Memberi like pada Post tertentu oleh seorang Bro.
     * Tidak bisa like Post milik sendiri. Jika nama bro atau ID post tidak valid, tidak perlu melakukan apa-apa.
     *
     * @param likerBroName nama Bro yang memberi like
     * @param postId        ID Post yang ingin dilike
     */
    public void likePost(String likerBroName, int postId) {}

    /**
     * Menampilkan seluruh Post yang ada terurut menurun dari Post dengan like terbanyak hingga paling sedikit.
     *
     * Format tampilan tiap post:
     * [<postId>] <konten> oleh <namaBro> - Likes: <jumlahLike>
     * 
     * Contoh:
     * [1] Hello World oleh XX____CoolMaster____XX - Likes: 3
     * [3] Kiat Bisnis Nasi Goreng Tanpa Nasi oleh JepBejos - Likes: 2
     * [2] Belajar Salto di Kolam Lele oleh ProgrammerMalasNgoding - Likes: 5
     * 
     * Hint: Anda bisa menggunakan metode .size() pada Set untuk mendapatkan jumlah entri yang ada di dalamnya.
     * 
     */
    public void displayPopularPosts() {
        // List<Post> sorted = new ArrayList<>(posts.values());
        // sorted.sort((a, b) -> Integer.compare(b.likes.size(), a.likes.size())); 

        // Algoritma untuk mengurutkan Post berdasarkan jumlah like sudah disediakan di atas
        // Kode di atas akan menyalin isi posts (value) ke dalam list bernama sorted, lalu mengurutkannya dengan fungsi lambda. 
        // Kode tersebut akan menghasilkan sebuah List yang terurut menurun berdasarkan jumlah likenya, 
        // Anda hanya perlu menampilkan hasilnya sesuai format yang diminta.

        // HARAP BACA KOMENTAR DI ATAS DENGAN TELITI SEBELUM MELANJUTKAN
        // HARAP BACA KOMENTAR DI ATAS DENGAN TELITI SEBELUM MELANJUTKAN
        // HARAP BACA KOMENTAR DI ATAS DENGAN TELITI SEBELUM MELANJUTKAN
        // HARAP BACA KOMENTAR DI ATAS DENGAN TELITI SEBELUM MELANJUTKAN
    }

    /**
     * Inner class yang merepresentasikan seorang Bro.
     * Menyimpan nama bro dan seluruh post yang pernah dibuatnya.
     */
    private static class Bro {
        String name;
        List<Post> posts;

        /**
         * Konstruktor kelas Bro.
         * Inisialisasi nama Bro dan list posts yang kosong.
         *
         * @param name nama Bro
         */
        Bro(String name) {}
    }

    /**
     * Inner class yang merepresentasikan sebuah Post.
     * Menyimpan ID, konten, pembuat (bro), dan set Bro yang telah menyukai post tersebut.
     */
    private static class Post {
        int id;
        String content;
        Bro author;
        Set<Bro> likes;

        /**
         * Konstruktor kelas Post.
         *
         * @param id      ID unik post
         * @param content isi post
         * @param author  Bro yang membuat post
         * 
         * Inisialisasi likes sebagai set kosong.
         */
        Post(int id, String content, Bro author) {}
    }
}