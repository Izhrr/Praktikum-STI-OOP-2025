/**
 * Kartu.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18223129 Izhar Alif Akbar
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
        this.suit = suit;
        this.rank = rank;
        this.multiplier = multiplier;
        jumlahKartu++;
    }

    /**
     * Konstruktor
     * 
     * @param suit
     * @param rank
     */
    public Kartu(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.multiplier = 1;
        jumlahKartu++;
    }

    /**
     * Getter suit
     * 
     * @return suit
     */
    public String getSuit() {
        return suit;
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
        if(rank.equals("jack") || rank.equals("queen") ||rank.equals("king") ||rank.equals("10")){
            return 10;
        }
        else if(rank.equals("ace")){
            return 11;
        }
        else{
            return rank.charAt(0) - '0';
        }
    }

    /**
     * Getter multiplier
     * 
     * @return multiplier
     */
    public int getMultiplier() {
        return multiplier;
    }

    /**
     * @return total nilai kartu (rank * multiplier)
     */
    public int getKartuValue() {
        return getRank() * getMultiplier();
    }

    /**
     * Getter jumlahKartu
     * 
     * @return jumlahKartu yang ada
     */
    public static int getJumlahKartu() {
        return jumlahKartu;
    }

    /**
     * Method untuk meningkatkan rank kartu, contohnya:
     * - king akan menjadi ace
     * - ace akan menjadi 2
     * - 10 akan menjadi jack
     */
    public void upgradeKartu() {
        if (rank.equals("2")) {
            rank = "3";
        } else if (rank.equals("3")) {
            rank = "4";
        } else if (rank.equals("4")) {
            rank = "5";
        } else if (rank.equals("5")) {
            rank = "6";
        } else if (rank.equals("6")) {
            rank = "7";
        } else if (rank.equals("7")) {
            rank = "8";
        } else if (rank.equals("8")) {
            rank = "9";
        } else if (rank.equals("9")) {
            rank = "10";
        } else if (rank.equals("10")) {
            rank = "jack";
        } else if (rank.equals("jack")) {
            rank = "queen";
        } else if (rank.equals("queen")) {
            rank = "king";
        } else if (rank.equals("king")) {
            rank = "ace";
        } else if (rank.equals("ace")) {
            rank = "2";
        }
    }
}