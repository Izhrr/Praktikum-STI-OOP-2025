/*
    Nama                    : Izhar Alif Akbar
    NIM                     : 18223129
    Hari dan tanggal        : 19 April 2025
    Deskripsi Program       : Implementasi Class PetriDishManager
*/

/**
 * PetriDishManager.java
 * 
 * Kelas untuk mengelola koloni bakteri dan simulasi inkubasi.
 */
public class PetriDishManager {
    private String cultureCondition;
    private boolean kanamycinPresence;
    private BacteriaBehaviour[] colony;
    private int colonySize;
    private static final int MAX_COLONY_SIZE = 4;

    /**
     * Konstruktor untuk inisialisasi petri dish dengan kondisi awal.
     */
    public PetriDishManager(String cultureCondition, boolean kanamycinPresence) {
        this.cultureCondition = cultureCondition;
        this.kanamycinPresence = kanamycinPresence;
        if(colony == null){
            colony = new BacteriaBehaviour[MAX_COLONY_SIZE];
            colonySize = 0;
        }
    }

    /**
     * Set kondisi kultur.
     * @param condition "Rich", "Limited", atau "Toxic"
     */
    public void setCultureCondition(String condition) {
        if(condition.equals("Rich") || condition.equals("Limited") || condition.equals("Toxic")){
            cultureCondition = condition;
        }
    }

    /**
     * Mendapat kondisi kultur.
     * @return kondisi kultur
     */
    public String getCultureCondition() {
        return cultureCondition;
    }

    /**
     * Set kehadiran Kanamycin.
     * @param present true jika Kanamycin ada, false jika tidak
     */
    public void setKanamycinPresence(boolean present) {
        kanamycinPresence = present;
    }

    /**
     * Mendapat kehadiran Kanamycin.
     * @return true jika Kanamycin ada pada medium, false jika tidak
     */
    public boolean isKanamycinPresent() {
        return kanamycinPresence;
    }

    /**
     * Menambahkan bakteri ke koloni.
     * @param b bakteri yang akan ditambahkan
     * @return true jika berhasil, false jika koloni sudah penuh
     */
    public boolean addBacteria(BacteriaBehaviour b) {
        if(colonySize < MAX_COLONY_SIZE){
            colony[colonySize] = b;
            colonySize++;
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Mendapatkan array koloni.
     * @return array koloni
     */
    public BacteriaBehaviour[] getColony() {
        return colony;
    }

    /**
     * Mendapatkan ukuran koloni.
     * @return ukuran koloni
     */
    public int getColonySize() {
        return colonySize;
    }

    /**
     * Simulasi inkubasi selama 'days' hari.
     * effectiveModifier:
     *   - "Rich"    : 1.0
     *   - "Limited" : 0.8
     *   - "Toxic"   : 0.6
     * Jika kanamicyinPresent true dan bakteri tidak resisten (hasKanR == false), maka 
     * effectiveModifier dikalikan 0.7.
     * Hint: Gunakan method reproduce() dari interface BacteriaBehavior.
     * @param days jumlah hari inkubasi
     */
    public void incubate(int days) {
        for (int i = 0; i < colonySize; i++) {
            BacteriaBehaviour bacteria = colony[i];
            double modifier;
    
            if (cultureCondition.equals("Rich")) {
                modifier = 1.0;
            } else if (cultureCondition.equals("Limited")) {
                modifier = 0.8;
            } else if (cultureCondition.equals("Toxic")) {
                modifier = 0.6;
            } else {
                modifier = 1.0;
            }
    
            if (kanamycinPresence && !bacteria.hasKanR()) {
                modifier *= 0.7;
            }
    
            bacteria.reproduce(days, modifier);
        }
    }

    /**
     * Mendapatkan representasi detail informasi dari Cawan Petri.
     */
    public String toString() {
        String result = "Culture condition: " + cultureCondition + "\n";
        result += "Kanamycin presence: " + kanamycinPresence + "\n";
        result += "Colony size: " + colonySize + "\n";
        for (int i = 0; i < colonySize; i++) {
            result += colony[i].toString() + "\n";
        }
        return result;
    }

}
