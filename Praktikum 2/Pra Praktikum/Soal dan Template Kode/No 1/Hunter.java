/**
 * Hunter.java
 */
public abstract class Hunter implements Comparable<Hunter> {
    private String name;
    private int health;
    private int attackPower;
    private boolean isStunned;
    private static Hunter[] party;
    private static int partySize;
    private static final int MAX_PARTY_SIZE = 4;

    /**
     * Constructor untuk membuat Hunter baru
     * 
     * @param name Nama Hunter
     * @param health Health points Hunter
     * @param attackPower Kekuatan serangan dasar Hunter
     */
    public Hunter(String name, int health, int attackPower) {}

    /**
     * Mendapatkan nama hunter
     * 
     * @return nama hunter
     */
    public String getName() {}

    /**
     * Mendapatkan health hunter
     * 
     * @return health hunter
     */
    public int getHealth() {}

    /**
     * Mengatur health hunter
     * 
     * @param health nilai health baru
     */
    public void setHealth(int health) {}

    /**
     * Mendapatkan attack power hunter
     * 
     * @return attack power hunter
     */
    public int getAttackPower() {}

    /**
     * Mengatur attack power hunter
     * 
     * @param attackPower nilai attack power baru
     */
    public void setAttackPower(int attackPower) {}

    /**
     * Mendapatkan status stun hunter
     * 
     * @return true jika hunter stunned, false jika tidak
     */
    public boolean isStunned() {}

    /**
     * Mengatur status stun hunter
     * 
     * @param stunned status stun baru
     */
    public void setStunned(boolean stunned) {}

    /**
     * Menambahkan Hunter ke party
     * 
     * @param hunter Hunter yang akan ditambahkan
     * @return true jika berhasil ditambahkan, false jika party penuh
     */
    public static boolean addToParty(Hunter hunter) {}

    /**
     * Menghapus Hunter dari party
     * 
     * @param hunter Hunter yang akan dihapus
     * @return true jika hunter ada dalam party dan berhasil dihapus dari party
     */
    public static boolean removeFromParty(Hunter hunter) {}

    /**
     * Mencari monster terlemah (health terendah) untuk diserang
     * 
     * @param monsters Array monster yang akan dicari
     * @return Monster dengan health terendah, atau null jika array kosong
     */
    public static Monster findWeakestMonster(Monster[] monsters) {}

    /**
     * Semua hunter dalam party akan menyerang monster secara berurutan
     * 
     * @param monster Monster yang akan diserang
     * 
     * Output:
     * - "The party has successfully defeated [Nama Monster]!" jika monster dikalahkan
     * - "[Nama Monster] still has [health] health remaining!" jika monster masih hidup
     */
    public static void partyHunt(Monster monster) {}

    /**
     * Membandingkan dua Hunter berdasarkan attack power-nya
     * 
     * @param other Hunter lain yang akan dibandingkan
     * @return nilai negatif jika this < other, 0 jika sama, nilai positif jika this > other
     */
    @Override
    public int compareTo(Hunter other) {}

    /**
     * Representasi string dari Hunter
     * 
     * @return String yang merepresentasikan Hunter
     */
    @Override
    public String toString() {
        return String.format("%s [Health: %d, Attack: %d, %s]", 
                             name, health, attackPower, isStunned ? "Stunned" : "Active");
    }
}