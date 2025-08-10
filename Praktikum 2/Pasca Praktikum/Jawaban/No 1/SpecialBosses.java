// Author: Izhar Alif Akbar - 18223129

/**
 * SpecialBosses.java
 */
public interface SpecialBosses {

    /**
     * Melakukan battlecry khusus boss tersebut
     * 
     */
    String battleCry();

    /**
     * Melakukan serangan khusus pada knight
     * 
     * @param knight target
     */
    void specialAttack(Knight knight);
}