/**
 * BowgunHunter.java
 */
public class BowgunHunter extends Hunter implements WeaponMaster {
    private int ammoCount;
    private static final int MAX_AMMO = 15;
    private static final int RELOAD_PENALTY = 5;
    
    /**
     * Constructor untuk membuat BowgunHunter baru
     * 
     * @param name Nama Hunter
     * @param health Health points Hunter
     * @param attackPower Kekuatan serangan dasar Hunter
     */
    public BowgunHunter(String name, int health, int attackPower) {}
    
    /**
     * Mengisi ulang amunisi, dengan penalty pada attack power
     * 
     * Efek:
     * - Mengisi ulang ammoCount ke nilai MAX_AMMO (15)
     * - Mengurangi attackPower sebesar RELOAD_PENALTY (5)
     * - Memastikan attackPower tidak kurang dari 1 (minimum)
     */
    public void reload() {}
    
    /**
     * Melakukan serangan khusus dengan Bowgun
     * 
     * @param monster Monster yang akan diserang
     * 
     * Efek:
     * - Jika Hunter sedang stunned, tidak dapat melakukan serangan
     * - Jika ammoCount > 0:
     *   - Mengurangi ammoCount
     *   - Mengurangi health monster sebesar attackPower * 1.5
     *   - Memicu checkEnrage() pada monster
     *   - Monster melakukan counterAttack jika masih hidup
     * - Jika ammoCount = 0:
     *   - Memanggil metode reload() untuk mengisi ulang amunisi dengan penalty
     * 
     * - "[Nama Hunter] is stunned and cannot attack!" jika hunter stunned
     * - "[Nama Monster] has been defeated!" jika monster mati setelah serangan
     * - "[Nama Hunter] is out of ammo!" jika kehabisan ammo
     */
    @Override
    public void specialAttack(Monster monster) {}
    
    /**
     * Menajamkan senjata, meningkatkan attack power sebesar 15%
     */
    @Override
    public void sharpenWeapon() {}
    
    /**
     * Mendapatkan jumlah amunisi yang tersisa
     * 
     * @return jumlah amunisi
     */
    public int getAmmoCount() {}
    
    /**
     * Representasi string dari BowgunHunter
     * 
     * @return String yang merepresentasikan BowgunHunter
     */
    @Override
    public String toString() {
        return super.toString() + " [Bowgun] [Ammo: " + ammoCount + "/" + MAX_AMMO + "]";
    }
}