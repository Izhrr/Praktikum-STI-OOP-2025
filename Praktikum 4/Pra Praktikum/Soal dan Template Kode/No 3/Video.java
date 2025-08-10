public class Video extends Content {
    private String title; 
    private String fileName;
    private int duration;
    
    /** 
     * KONSTRUKTOR - Menciptakan objek Video baru
     * 
     * @param title: judul video
     * @param fileName: nama file video
     * @param duration: durasi video dalam detik
     */
    public Video(String title, String fileName, int duration) {}

    /** 
     * Metode yang akan mengubah judul video.
     * 
     * @params newTitle: judul baru video.
     */
    public void changeTitle(String newTitle) {}

    /** 
     * Metode yang akan mengubah nama file video.
     * 
     * @params newFileName: nama file baru video.
     */
    public void changeFileName(String newFileName) {}

    /** 
     * Metode yang akan mengubah durasi video.
     * 
     * @params newDuration: durasi baru video.
     */
    public void changeDuration(int newDuration) {}

    /** Mengembalikan judul dari Video */
    public String getTitle() {}

    /** Mengembalikan nama file dari Video */
    public String getFileName() {}

    /** Mengembalikan durasi dari Video */
    public int getDuration() {}

    /** 
     * Metode untuk membandingkan apakah konten ini dan konten C bernilai sama. 
     * 
     * Nilai sama dikatakan bila kedua konten bertipe sama DAN 
     *                                 memiliki nilai yang sama untuk SELURUH atribut.
     * 
     * @param c Konten yang ingin dibandingkan.
     * @return TRUE bila sama, FALSE bila tidak
     */
    public boolean isSame(Content c) {}
}
