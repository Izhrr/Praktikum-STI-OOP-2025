/**
 * Kartu.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author [NIM] [Nama]
 */

public class Kartu {
    // Deklarasi atribut
    private String suit;
    private String rank;
    private int multiplier;
    private static int jumlahKartu;

    /**
     * Konstruktor
     * 
     * @param suit
     * @param rank
     * @param multiplier
     */
    public Kartu(String suit, String rank, int multiplier) {
    }

    /**
     * Konstruktor
     * 
     * @param suit
     * @param rank
     */
    public Kartu(String suit, String rank) {
    }

    /**
     * Getter suit
     * 
     * @return suit
     */
    public String getSuit() {
    }

    /**
     * Getter rank dalam bentuk nilai
     * - king, queen, jack bernilai 10
     * - ace bernilai 11
     * - selainnya bernilai sesuai angka kartu
     * 
     * Gunakan method string1.equals(string2) untuk memastikan nilai dua buah string
     * sama
     * 
     * @return rank
     */
    public int getRank() {
    }

    /**
     * Getter multiplier
     * 
     * @return multiplier
     */
    public int getMultiplier() {
    }

    /**
     * @return total nilai kartu (rank * multiplier)
     */
    public int getKartuValue() {
    }

    /**
     * Getter jumlahKartu
     * 
     * @return jumlahKartu yang ada
     */
    public static int getJumlahKartu() {
    }

    /**
     * Method untuk meningkatkan rank kartu, contohnya:
     * - king akan menjadi ace
     * - ace akan menjadi 2
     * - 10 akan menjadi jack
     */
    public void upgradeKartu() {
    }
}