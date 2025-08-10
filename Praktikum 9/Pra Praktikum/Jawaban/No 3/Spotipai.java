import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue; 

// Author: Izhar Alif Akbar - 18223129

public class Spotipai {
    private List<Song> daftarLagu; // pustaka lagu yang tersedia
    private Queue<Song> queue;     // Antrian lagu
    private Song nowPlaying;       // Lagu yang sedang diputar

    public Spotipai() {
        daftarLagu = new ArrayList<>();
        queue = new LinkedList<>();
        nowPlaying = null;
    }

    public static class Song {
        private String title;
        private String artist;
        private int duration; // in seconds

        public Song(String title, String artist, int duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getDuration() {
            return duration;
        }

        @Override
        public String toString() { 
            return String.format("'%s' oleh %s (%d detik)", title, artist, duration);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Song song = (Song) o;
            return duration == song.duration &&
                Objects.equals(title, song.title) &&
                Objects.equals(artist, song.artist);
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
        if(song == null){
            System.out.println("Masukan tidak valid.");
        }
        else{
            daftarLagu.add(song);
            System.out.println("Ditambahkan ke pustaka: " + song);
        }
    }

    /**
     * Memainkan atau mengantri lagu.
     * Jika input tidak valid (null), cetak "Masukan tidak valid."
     * Jika lagu tidak ada di daftar lagu, cetak "[lagu] tidak ditemukan di pustaka. Tolong tambahkan dulu ke pustaka."
     * Jika berhasil, tambahkan lagu ke queue dan cetak "Ditambahkan ke antrian: [lagu]".
     * Putar lagu selanjutnya jika tidak ada lagu yang sedang dimainkan.
     */
    public void playOrQueueSong(Song song) {
        if(song == null){
            System.out.println("Masukan tidak valid.");
        }
        else if(!daftarLagu.contains(song)){
            System.out.println(song + " tidak ditemukan di pustaka. Tolong tambahkan dulu ke pustaka.");
        }
        else{
            queue.add(song);
            System.out.println("Ditambahkan ke antrian: " + song);
            if(nowPlaying == null){
                playNext();
            }
        }
    }

    /**
     * Memainkan lagu selanjutnya dari antrian.
     * Mainkan lagu dari antrian jika ada, lalu cetak "Sekarang memutar: [lagu]".
     * Jika antrian kosong dan sedang ada lagu yang sedang dimainkan, cetak "Selesai memutar: [lagu]. Antrian kosong. Pemutaran dihentikan."
     * Jika antrian kosong dan tidak ada lagu yang sedang dimainkan, cetak "Antrian kosong. Tidak ada yang diputar."
     */
    public void playNext() {
        if (queue.isEmpty()) {
            if (nowPlaying != null) {
                System.out.println("Selesai memutar: " + nowPlaying + ". Antrian kosong. Pemutaran dihentikan.");
                nowPlaying = null;
            } else {
                System.out.println("Antrian kosong. Tidak ada yang diputar.");
            }
            return;
        }
        nowPlaying = queue.poll();
        System.out.println("Sekarang memutar: " + nowPlaying);
    }

    /**
     * Menunjukkan isi antrian lagu.
     * Jika antrian kosong, cetak "Antrian kosong."
     * Jika ada lagu dalam antrian, cetak daftar lagu dan pisahkan antara satu lagu dengan yang lainnya pada baris berbeda.
     */
    public void showQueue() {
        if(queue.isEmpty()){
            System.out.println("Antrian kosong.");
        }
        else{
            int i = 1;
            for(Song song : queue){
                System.out.println(i + ". " + song);
                i++;
            }
        }
    }

    /**
     * Hapus lagu tertentu dari antrian.
     * Jika input tidak valid (null), cetak "Masukan tidak valid."
     * Jika lagu tidak ada di antrian, cetak "[lagu] tidak ditemukan di antrian."
     * Jika berhasil, hapus lagu dari antrian dan cetak "Menghapus [lagu] dari antrian".
     */
    public void removeFromQueue(Song song) {
        if(song == null){
            System.out.println("Masukan tidak valid.");
        }
        else if(!queue.contains(song)){
            System.out.println(song + " tidak ditemukan di antrian.");
        }
        else{
            queue.remove(song);
            System.out.println("Menghapus " + song + " dari antrian");
        }
    }

    /**
     * Memberhentikan lagu yang sedang dimainkan.
     * Jika ada lagu yang sedang dimainkan, cetak "Berhenti memutar: [lagu]".
     * Jika tidak ada lagu yang sedang dimainkan, cetak "Tidak ada lagu yang sedang diputar."
     */
    public void stopSong() {
        if(nowPlaying != null){
            System.out.println("Berhenti memutar: " + nowPlaying);
            nowPlaying = null;
        }
        else{
            System.out.println("Tidak ada lagu yang sedang diputar.");
        }
    }

    /**
     * Menunjukkan lagu yang sedang diputar.
     * Jika ada lagu yang sedang diputar, cetak "Sedang memutar: [lagu]".
     * Jika tidak ada lagu yang sedang diputar, cetak "Tidak ada lagu yang sedang diputar."
     */
    public void showNowPlaying() {
        if(nowPlaying != null){
            System.out.println("Sedang memutar: " + nowPlaying);
        }
        else{
            System.out.println("Tidak ada lagu yang sedang diputar.");
        }
    }

    /**
     * Menampilkan semua lagu yang ada di pustaka.
     * Jika kosong, cetak "Tidak ada lagu di dalam pustaka."
     * Jika ada, cetak daftar lagu dengan format: "- [lagu]"
     */
    public void showAllSongsInLibrary() {
        if(daftarLagu.isEmpty()){
            System.out.println("Tidak ada lagu di dalam pustaka.");
        }
        else{
            for(Song song : daftarLagu){
                System.out.println("- " + song);
            }
        }
    }

    /**
     * Hapus sebuah lagu dari pustaka. Asumsikan bahwa pustaka lagu bersifat unik.
     * Jika input tidak valid (null), cetak "Masukan tidak valid."
     * Jika lagu tidak ada di pustaka, cetak "[lagu] tidak ditemukan di pustaka."
     * Jika berhasil, hapus lagu dari pustaka dan cetak "Menghapus [lagu] dari pustaka."
     * Jika lagu yang dihapus adalah lagu yang sedang diputar, hentikan pemutaran lagu tersebut dan cetak "[lagu] sedang diputar. Dihentikan."
     */
    public void removeSongFromLibrary(Song song) {
        if(song == null){
            System.out.println("Masukan tidak valid.");
        }
        else if(!daftarLagu.contains(song)){
            System.out.println(song + " tidak ditemukan di pustaka.");
        }
        else{
            if(song.equals(nowPlaying)){
                System.out.println(song + " sedang diputar. Dihentikan.");
                nowPlaying = null;
            }
            // Hapus lagu dari antrian juga jika ada
            queue.remove(song);
            daftarLagu.remove(song);
            // Cetak pesan penghapusan hanya jika bukan lagu yang sedang diputar
            if(!song.equals(nowPlaying)){
                System.out.println("Menghapus " + song + " dari pustaka.");
            }
        }
    }
}