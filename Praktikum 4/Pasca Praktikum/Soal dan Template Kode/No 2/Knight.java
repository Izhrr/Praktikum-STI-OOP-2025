/**
 * Knight.java
 */
public class Knight extends Player {
    private static final int maxHP = 150;
    private static final int maxMana = 50;
    private int sharpness;

    /**
     * Constructor untuk membuat knight baru
     * Nama player adalah "Knight"
     * nilai awal sharpness adalah 5
     */
    public Knight() {

    }

    /**
     * Menjalankan basic attack knight
     * 1. Cetak "The knight swung his sword!"
     * 2. HP musuh dikurangi sharpness dari knight
     * 
     * @param enemy Musuh yang akan diserang
     */
    @Override
    public void basicAttack(Enemy enemy) {

    }

    /**
     * Menjalankan ultimate attack knight
     * 1. Cetak "I will not falter!"
     * 2. HP musuh dikurangi sharpness dikali 10
     * 
     * @param enemy Musuh yang akan diserang
     */
    @Override
    public void ultimateAttack(Enemy enemy) {

    }

    /**
     * Mencetak status knight pada saat ini
     * Sistem akan mencetak : "<nama> - HP : <current HP> / Mana : <current mana>"
     * Lalu sistem akan mencetak : "Sharpness : <sharpness>"
     */
    @Override
    public void printStatus() {

    }

    /**
     * Enchant pedang knight
     * Apabila mana knight kurang dari 10, cetak "Not enough mana!"
     * Apabila mana mencukupi :
     * 1. cetak "Enchant Sword!"
     * 2. sharpness menjadi 4 kali sharpness awal
     * 3. mana dikurangi 10
     */
    public void enchantSword() {

    }
}
