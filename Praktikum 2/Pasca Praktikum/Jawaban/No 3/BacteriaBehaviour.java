/*
    Nama                    : Izhar Alif Akbar
    NIM                     : 18223129
    Hari dan tanggal        : 19 April 2025
    Deskripsi Program       : Melengkapi interface Bacteria Behaviour
*/

/**
 * BacteriaBehaviour.java
 * 
 * Interface untuk mendefinisikan perilaku dasar bakteri.
 */
public interface BacteriaBehaviour {
    String getName();
    int getCurrentPopulation();
    double getGrowthRate();
    boolean hasKanR();
    
    void setCurrentPopulation(int population);
    void setGrowthRate(double growthRate);
    void setKanR(boolean resistant);
    void reproduce(int days, double effectiveModifier);
}
