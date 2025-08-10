import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue; 

public class Spotipai {
    private List<Song> daftarLagu; // pustaka lagu yang tersedia
    private Queue<Song> queue;     // Antrian lagu
    private Song nowPlaying;       // Lagu yang sedang diputar

    public Spotipai() {
        // tulis constructor untuk menginisialisasi daftarLagu, queue, dan nowPlaying
    }

    public static class Song {
        private String title;
        private String artist;
        private int duration; // in seconds

        public Song(String title, String artist, int duration) {
            // tulis constructor untuk menginisialisasi title, artist, dan duration
        }

        public String getTitle() {
            // isi di sini
        }

        public String getArtist() {
            // isi di sini
        }

        public int getDuration() {
            // isi di sini
        }

        @Override
        public String toString() { 
            // tulis representasi string dari lagu dengan format "'[judul]' oleh [artis] ([durasi] detik)"
            // contoh "'Mangu' oleh Fourtwnty (240 detik)"
    
        }

        @Override
        public boolean equals(Object o) {
            // implementasi equals method dengan membandingkan title, artist, dan duration.
            // untuk check apakah object merupakan class Song, gunakan method getClass() untuk mendapatkan class dari object tersebut.
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, artist, duration);
        }
    }

    /**
     * Menambahkan lagu ke dalam library.
     * Jika lagu yang ditambahkan tidak valid (null), cetak "Masukan tidak valid."
     * Tambahkan lagu ke daftarLagu, lalu cetak pesan "Ditambahkan ke pustaka: [lagu]"
     */
    public void addSongToLibrary(Song song) {
        
    }

    /**
     * Memainkan atau mengantri lagu.
     * Jika input tidak valid (null), cetak "Masukan tidak valid."
     * Jika lagu tidak ada di daftar lagu, cetak "[lagu] tidak ditemukan di pustaka. Tolong tambahkan dulu ke pustaka."
     * Jika berhasil, tambahkan lagu ke queue dan cetak "Ditambahkan ke antrian: [lagu]".
     * Putar lagu selanjutnya jika tidak ada lagu yang sedang dimainkan.
     */
    public void playOrQueueSong(Song song) {

    }

    /**
     * Memainkan lagu selanjutnya dari antrian.
     * Mainkan lagu dari antrian jika ada, lalu cetak "Sekarang memutar: [lagu]".
     * JIka antrian ada, dan sedang ada lagu yang sedang dimainkan, cetak "Selesai memutar: [lagu]. Antrian kosong. Pemutaran dihentikan.",
     * jika antrian kosong dan tidak ada lagu yang sedang dimainkan, cetak "Antrian kosong. Tidak ada yang diputar."
     * 
     */
    public void playNext() {
        // isi di sini
    }

    /**
     * Menunjukkan isi antrian lagu.
     * Jika antrian kosong, cetak "Antrian kosong."
     * Jika ada lagu dalam antrian, cetak daftar lagu dan pisahkan antara satu lagu dengan yang lainnya pada baris berbeda. tulis dengan format:
     * 1. [lagu]
     * 2. [lagu]
     * dst.
     * 
     */
    public void showQueue() {
        // isi di sini
    }

    /**
     * Hapus lagu tertentu dari antrian.
     * Jika input tidak valid (null), cetak "Masukan tidak valid."
     * Jika lagu tidak ada di antrian, cetak "[lagu] tidak ditemukan di antrian."
     * Jika berhasil, hapus lagu dari antrian dan cetak "Menghapus [lagu] dari antrian".
     */
    public void removeFromQueue(Song song) {

    }

    /**
     * Memberhentikan lagu yang sedang dimainkan.
     * Jika ada lagu yang sedang dimainkan, cetak "Berhenti memutar: [lagu]".
     * Jika tidak ada lagu yang sedang dimainkan, cetak "Tidak ada lagu yang sedang diputar."
     */
    public void stopSong() {

    }

    /**
     * Menunjukkan lagu yang sedang diputar.
     * Jika ada lagu yang sedang diputar, cetak "Sedang memutar: [lagu]".
     * Jika tidak ada lagu yang sedang diputar, cetak "Tidak ada lagu yang sedang diputar."
     */
    public void showNowPlaying() {

    }

    /**
     * Menampilkan semua lagu yang ada di pustaka.
     * Jika kosong, cetak "Tidak ada lagu di dalam pustaka."
     * Jika ada, cetak daftar lagu dengan format:
     * "- [lagu]"
     * "- [lagu]"
     * dst.
     */
    public void showAllSongsInLibrary() {

    }

    /**
     * Hapus sebuah lagu dari pustaka. Asumsikan bahwa pustaka lagu bersifat unik.
     * Jika input tidak valid (null), cetak "Masukan tidak valid."
     * Jika lagu tidak ada di pustaka, cetak "[lagu] tidak ditemukan di pustaka."
     * Jika berhasil, hapus lagu dari pustaka dan cetak "Menghapus [lagu] dari pustaka."
     * Jika lagu yang dihapus adalah lagu yang sedang diputar, hentikan pemutaran lagu tersebut dan cetak "[lagu] sedang diputar. Dihentikan."
     */
    public void removeSongFromLibrary(Song song) {

    }

}