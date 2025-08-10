import java.util.*;

/**
 * Kelas mpv (Media Player Video) merepresentasikan sebuah aplikasi pemutar
 * video sederhana.
 * Aplikasi ini dapat mengelola database video dan menambahkan subtitle untuk
 * setiap video.
 * Menggunakan konsep Collections untuk penyimpanan data dan Nested Classes
 * untuk enkapsulasi.
 */
public class mpv {
    private Map<Integer, Video> videoDatabase;
    private int nextVideoId;

    /**
     * Konstruktor untuk membuat objek mpv baru.
     * Menginisialisasi database video kosong dan mengatur ID video pertama dimulai
     * dari 1.
     */
    public mpv() {
    }

    /**
     * Kelas static nested Video merepresentasikan sebuah file video dengan
     * metadata.
     * Setiap video memiliki ID unik, judul, nama file, durasi, dan kumpulan
     * subtitle.
     */
    public static class Video {
        private int id;
        private String title;
        private String filename;
        private int durationSeconds; // dalam detik
        private Set<Subtitle> subtitles;

        /**
         * Konstruktor untuk membuat objek Video baru.
         *
         * @param id              ID unik untuk video ini
         * @param title           Judul video
         * @param filename        Nama file video (harus berformat .mp4, .mkv, atau
         *                        .avi)
         * @param durationSeconds Durasi video dalam detik
         */
        public Video(int id, String title, String filename, int durationSeconds) {
        }

        /**
         * Mengembalikan ID video.
         *
         * @return int ID video
         */
        public int getId() {
        }

        /**
         * Mengembalikan judul video.
         *
         * @return String judul video
         */
        public String getTitle() {
        }

        /**
         * Mengembalikan nama file video.
         *
         * @return String nama file video
         */
        public String getFilename() {
        }

        /**
         * Mengembalikan durasi video dalam detik.
         *
         * @return int durasi video dalam detik
         */
        public int getDuration() {
        }

        /**
         * Mengembalikan Set berisi semua subtitle yang tersedia untuk video ini.
         *
         * @return Set<Subtitle> kumpulan subtitle video
         */
        public Set<Subtitle> getSubtitles() {
        }

        /**
         * Menambahkan subtitle baru untuk video ini.
         * Bahasa subtitle harus unik (case-insensitive) dan tidak boleh kosong.
         * Exception yang dilemparkan jika terjadi kesalahan:
         * - InvalidSubtitleException jika bahasa kosong atau null, message: "Language
         * tidak boleh kosong."
         * - DuplicateSubtitleException jika subtitle untuk bahasa tersebut sudah ada,
         * message: "Subtitle untuk bahasa {language} sudah ada."
         *
         * @param language Bahasa subtitle (misalnya "English", "Indonesian")
         * @throws InvalidSubtitleException   jika bahasa kosong atau null
         * @throws DuplicateSubtitleException jika subtitle untuk bahasa tersebut sudah
         *                                    ada
         */
        public void addSubtitle(String language) throws InvalidSubtitleException, DuplicateSubtitleException {
        }

        /**
         * Memeriksa apakah video ini memiliki subtitle untuk bahasa tertentu.
         * Pemeriksaan dilakukan secara case-insensitive.
         *
         * @param language Bahasa yang ingin diperiksa
         * @return boolean true jika subtitle tersedia, false jika tidak
         */
        public boolean hasSubtitle(String language) {
        }

        /**
         * Mengembalikan daftar semua bahasa subtitle yang tersedia untuk video ini.
         *
         * @return List<String> daftar bahasa subtitle yang tersedia
         */
        public List<String> getAvailableLanguages() {
        }
    }

    /**
     * Kelas static nested Subtitle merepresentasikan subtitle untuk sebuah video.
     * Setiap subtitle memiliki informasi bahasa yang digunakan.
     */
    public static class Subtitle {
        private String language;

        /**
         * Konstruktor untuk membuat objek Subtitle baru.
         *
         * @param language Bahasa subtitle
         */
        public Subtitle(String language) {
        }

        /**
         * Mengembalikan bahasa subtitle.
         *
         * @return String bahasa subtitle
         */
        public String getLanguage() {
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Subtitle subtitle = (Subtitle) obj;
            return Objects.equals(language.toLowerCase(), subtitle.language.toLowerCase());
        }

        @Override
        public int hashCode() {
            return Objects.hash(language.toLowerCase());
        }

        @Override
        public String toString() {
            return language;
        }
    }

    // ================== CUSTOM EXCEPTIONS ==================

    // Buatlah kelas dan constructor untuk setiap exception yang diperlukan

    /**
     * Exception yang dilempar ketika format video tidak valid atau parameter video
     * tidak sesuai.
     */

    /**
     * Exception yang dilempar ketika video dengan ID tertentu tidak ditemukan dalam
     * database.
     */

    /**
     * Exception yang dilempar ketika mencoba menambahkan video dengan nama file
     * yang sudah ada.
     */

    /**
     * Exception yang dilempar ketika bahasa subtitle tidak valid (kosong atau
     * null).
     */

    /**
     * Exception yang dilempar ketika mencoba menambahkan subtitle dengan bahasa
     * yang sudah ada.
     */

    // ================== MPV METHODS ==================

    /**
     * Menambahkan video baru ke database.
     * Video akan diberikan ID unik secara otomatis dan disimpan dalam HashMap.
     * Kesalahan beserta exception yang akan dilemparkan jika terjadi masalah:
     * - Judul kosong: InvalidVideoFormatException dengan message "Title cannot be
     * empty."
     * - Format file tidak didukung: InvalidVideoFormatException dengan message
     * "Invalid video format. Supported: .mp4, .mkv, .avi."
     * - Durasi tidak valid: InvalidVideoFormatException dengan message "Duration
     * must be positive."
     * - File dengan nama yang sama sudah ada: DuplicateVideoException dengan
     * message "Video with filename {filename} already exists."
     * Hint: Gunakan method endsWith() untuk memeriksa format file.
     *
     * @param title           Judul video (tidak boleh kosong)
     * @param filename        Nama file video (harus berformat .mp4, .mkv, atau
     *                        .avi)
     * @param durationSeconds Durasi video dalam detik (harus positif)
     * @throws InvalidVideoFormatException jika title kosong, format file tidak
     *                                     didukung, atau durationSeconds tidak
     *                                     valid
     * @throws DuplicateVideoException     jika file dengan nama yang sama sudah ada
     */
    public void addVideo(String title, String filename, int durationSeconds)
            throws InvalidVideoFormatException, DuplicateVideoException {
    }

    /**
     * Mengambil video berdasarkan ID.
     * Jika video dengan ID tersebut tidak ditemukan, akan dilemparkan
     * VideoNotFoundException dengan message "Video not found with ID: {videoId}".
     *
     * @param videoId ID video yang ingin diambil
     * @return Video objek video yang sesuai dengan ID
     * @throws VideoNotFoundException jika video dengan ID tersebut tidak ditemukan
     */
    public Video getVideo(int videoId) throws VideoNotFoundException {
    }

    /**
     * Menambahkan subtitle ke video tertentu.
     *
     * @param videoId  ID video yang akan ditambahkan subtitle
     * @param language Bahasa subtitle yang akan ditambahkan
     * @throws VideoNotFoundException     jika video dengan ID tersebut tidak
     *                                    ditemukan
     * @throws InvalidSubtitleException   jika bahasa subtitle tidak valid
     * @throws DuplicateSubtitleException jika subtitle untuk bahasa tersebut sudah
     *                                    ada
     */
    public void addSubtitleToVideo(int videoId, String language)
            throws VideoNotFoundException, InvalidSubtitleException, DuplicateSubtitleException {
    }

    /**
     * Memeriksa apakah video memiliki subtitle untuk bahasa tertentu.
     *
     * @param videoId  ID video yang akan diperiksa
     * @param language Bahasa subtitle yang ingin diperiksa
     * @return boolean true jika video memiliki subtitle untuk bahasa tersebut
     * @throws VideoNotFoundException jika video dengan ID tersebut tidak ditemukan
     */
    public boolean videoHasSubtitle(int videoId, String language) throws VideoNotFoundException {
    }

    /**
     * Mengambil daftar semua bahasa subtitle yang tersedia untuk video tertentu.
     *
     * @param videoId ID video yang akan diperiksa subtitle-nya
     * @return List<String> daftar bahasa subtitle yang tersedia
     * @throws VideoNotFoundException jika video dengan ID tersebut tidak ditemukan
     */
    public List<String> getVideoSubtitleLanguages(int videoId) throws VideoNotFoundException {
    }

    /**
     * Mengambil koleksi semua video yang ada dalam database.
     *
     * @return Collection<Video> koleksi semua video
     */
    public Collection<Video> getAllVideos() {
    }

    /**
     * Mengembalikan jumlah total video dalam database.
     *
     * @return int jumlah video
     */
    public int getTotalVideos() {
    }

    /**
     * Mengambil daftar video berdasarkan format file tertentu.
     * Pencarian dilakukan secara case-insensitive.
     *
     * @param format Format file yang dicari (misalnya "mp4", "mkv", "avi")
     * @return List<Video> daftar video dengan format yang sesuai
     */
    public List<Video> getVideosByFormat(String format) {
    }
}