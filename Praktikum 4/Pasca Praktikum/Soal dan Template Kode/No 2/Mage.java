/**
 * Mage.java
 */
public class Mage extends Player {
    private static final int maxHP = 100;
    private static final int maxMana = 200;
    private String ultimate;

    /**
     * Constructor untuk membuat knight baru
     * Nama player adalah "Mage"
     * 
     * @param ultimate Jenis ultimate yang dimiliki mage
     */
    public Mage(String ultimate) {

    }

    /**
     * Menjalankan basic attack mage
     * 1. Cetak "Fireball Launched!"
     * 2. HP musuh dikurangi 20
     * 3. Mana mage berkurang 10
     * 
     * @param enemy Musuh yang akan diserang
     */
    @Override
    public void basicAttack(Enemy enemy) {

    }

    /**
     * Menjalankan ultimate attack mage
     * Hanya ada 2 jenis ultimate yang valid : "Storm" dan "Lighting"
     * Selain 2 opsi tersebut, sistem akan mencetak "Spell doesn't exist!"
     * Apabila mage memiliki ultimate "Storm" :
     * 1. Cetak "STORM INCOMING!"
     * 2. Kurangi HP musuh sebanyak 50
     * 3. Kurangi mana mage sebanyak 25
     * 
     * Apabila mage memiliki ultimate "Lighting :
     * 1. Cetak "LIGHTING STRIKE!"
     * 2. Kurangi HP musuh sebanyak 30
     * 3. Kurangi mana mage sebanyak 15
     * 
     * @param enemy Musuh yang akan diserang
     */
    @Override
    public void ultimateAttack(Enemy enemy) {

    }

    /**
     * Mencetak status mage pada saat ini
     * Sistem akan mencetak : "<nama> - HP : <current HP> / Mana : <current mana>"
     * Lalu sistem akan mencetak : "Ultimate : <ultimate>"
     */
    @Override
    public void printStatus() {

    }

}
