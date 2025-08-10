/**
 * Enemy.java
 */
public class Enemy {
    private String name;
    private int attack;
    private int currHP;
    private int maxHP;

    /**
     * Constructor untuk membuat enemy baru
     * currHP akan sama dengan maxHP ketika inisiasi enemy baru
     * 
     * @param name   Nama enemy
     * @param maxHP  HP maksimum enemy
     * @param attack Kekuatan attack enemy
     */
    public Enemy(String name, int maxHP, int attack) {

    }

    /**
     * Mendapatkan nama enemy
     * 
     * @return nama enemy
     */
    public String getName() {

    }

    /**
     * Mendapatkan HP enemy pada saat ini
     * 
     * @return current HP enemy
     */
    public int getHP() {

    }

    /**
     * Mengatur HP enemy
     * Bila nilai HP yang diberikan lebih besar daripada maxHP maka currHP akan
     * menjadi maxHP
     * Bila nilai HP lebih kecil daripada nol maka currHP adalah 0
     * 
     * @param HP nilai HP baru
     */
    public void setHP(int HP) {

    }

    /**
     * Menyerang seorang player
     * Mengurangi HP player dengan kekuatan attack enemy
     * 
     * @param Player attacked player
     */
    public void attack(Player player) {

    }

    /**
     * Mencetak status enemy pada saat ini
     * Sistem akan mencetak : "<nama enemy> - HP : <current HP enemy> / Attack :
     * <attack enemy>"
     * Contoh : "Jimbo - HP : 25 / Attack : 50"
     */
    public void printStatus() {

    }
}