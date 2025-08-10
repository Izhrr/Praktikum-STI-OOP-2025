/**
 * MonsterTarget.java
 */

// Author: Izhar Alif Akbar - 18223129

public interface MonsterTarget {
    /**
     * Monster menyerang balik Hunter
     * 
     * @param hunter Hunter yang akan diserang
     */
    void counterAttack(Hunter hunter);
    
    /**
     * Monster melakukan serangan area pada party Hunter
     * 
     * @param hunters Array Hunter yang akan diserang
     */
    void areaAttack(Hunter[] hunters);
}