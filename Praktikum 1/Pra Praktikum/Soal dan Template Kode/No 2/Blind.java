/**
 * Blind.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author [NIM] [Nama]
 */

public class Blind {
    // Deklarasi atribut
    private Kartu kartu1, kartu2, kartu3, kartu4, kartu5;
    private int targetValue;
    private int jokerType;

    /**
     * Konstruktor
     * 
     * @param kartu1-kartu5
     * @param jokerType,    tipe joker yang dimiliki
     * @param targetValue,  total nilai yang harus dicapai pada blind ini
     */
    public Blind(Kartu kartu1, Kartu kartu2, Kartu kartu3, Kartu kartu4, Kartu kartu5, int jokerType, int targetValue) {
    }

    /**
     * Getter
     * 
     * @param n
     * @return kartu ke-n, bila angka tidak valid kembalikan kartu ke-5
     */
    public Kartu getKartu(int n) {
    }

    /**
     * Getter
     * 
     * @return jokerType
     */
    public int getJokerType() {
    }

    /**
     * Mengembalikan nilai multiplier dari tipe joker
     * Joker 1 -> 10x
     * Joker 2 -> 5x
     * Joker 3 -> 3x
     * Selainnya tidak ada multiplier
     * 
     * @return multiplier
     */
    public int getJokerMultiplier() {
    }

    /**
     * Mengembalikan total nilai kartu yang dimiliki, termasuk penkalian multiplier
     * pada akhir penjumlahan
     * 
     * @return totalScore
     */
    public int calculateTotalScore() {
    }

    /**
     * Mengembalikan true bila skor total melebihi atau sama dengan target
     * 
     * @return isWin
     */
    public boolean isWin() {
    }
}