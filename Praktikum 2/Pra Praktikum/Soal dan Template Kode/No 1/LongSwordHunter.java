/**
 * LongSwordHunter.java
 */
public class LongSwordHunter extends Hunter implements WeaponMaster {
    private int spiritGauge;
    private static final double SPIRIT_MULTIPLIER = 1.1;
    
    /**
     * Constructor untuk membuat LongSwordHunter baru
     * 
     * @param name Nama Hunter
     * @param health Health points Hunter
     * @param attackPower Kekuatan serangan dasar Hunter
     */
    public LongSwordHunter(String name, int health, int attackPower) {}
    
    /**
     * Meningkatkan spiritGauge hingga maksimal 3
     * 
     * Efek:
     * - Meningkatkan nilai spiritGauge sebesar 1 jika belum mencapai nilai maksimum (3)
     * - Tidak melakukan apa-apa jika spiritGauge sudah mencapai nilai maksimum
     */
    public void increaseSpiritGauge() {}
    
    /**
     * Melakukan serangan khusus dengan bonus damage berdasarkan Spirit Gauge
     * 
     * @param monster Monster yang akan diserang
     * 
     * Efek:
     * - Jika Hunter sedang stunned, tidak dapat melakukan serangan
     * - Mengurangi health monster sebesar attackPower * (1 + spiritGauge * SPIRIT_MULTIPLIER)
     * - Memicu checkEnrage() pada monster
     * - Meningkatkan spiritGauge setelah serangan
     * - Monster melakukan counterAttack jika masih hidup
     * 
     * Output:
     * - "[Nama Hunter] is stunned and cannot attack!" jika hunter terkena stun
     * - "[Nama Monster] has been defeated!" jika monster mati setelah serangan
     */
    @Override
    public void specialAttack(Monster monster) {}
    
    /**
     * Menajamkan senjata, meningkatkan attack power sebesar 10%
     */
    @Override
    public void sharpenWeapon() {}
    
    /**
     * Mendapatkan nilai Spirit Gauge
     * 
     * @return level Spirit Gauge
     */
    public int getSpiritGauge() {}
    
    /**
     * Representasi string dari LongSwordHunter
     * 
     * @return String yang merepresentasikan LongSwordHunter
     */
    @Override
    public String toString() {
        return super.toString() + " [Long Sword] [Spirit: " + spiritGauge + "]";
    }
}