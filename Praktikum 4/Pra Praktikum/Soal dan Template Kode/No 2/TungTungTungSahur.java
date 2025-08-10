/**
 * TungTungTungSahur.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author [NIM] [Nama]
 */

import java.util.ArrayList;
import java.util.List;

public class TungTungTungSahur {
    private List<ICommandAction> recipeSteps = new ArrayList<>();
    private List<ICommandAction> completedSteps = new ArrayList<>();
    
    /**
     * Menambahkan langkah baru ke dalam daftar langkah-langkah memasak
     * 
     * @param action Langkah memasak (Command) yang akan ditambahkan
     */
    public void addStep(ICommandAction action) {
    }
    
    /**
     * Melaksanakan langkah memasak berikutnya dari daftar
     * Setelah dieksekusi, langkah tersebut dipindahkan dari recipeSteps ke
     * completedSteps untuk memungkinkan proses pembatalan
     * 
     * Keluarkan "No cooking steps remaining" apabila tidak ada elemen
     * pada recipeSteps
     */
    public void cook() {
    }
    
    /**
     * Membatalkan langkah memasak terakhir yang telah dilaksanakan
     * Langkah tersebut dipindahkan kembali dari completedSteps ke awal
     * recipeSteps untuk dapat dijalankan kembali jika diinginkan
     * 
     * Keluarkan "No cooking steps to cancel" apabila tidak ada elemen
     * pada completedSteps
     */
    public void cancel() {
    }
    
    /**
     * Melaksanakan semua langkah memasak secara berurutan
     * Metode ini mengeksekusi semua langkah yang tersisa dalam daftar recipeSteps
     */
    public void cookAll() {
    }
    
    /**
     * Membatalkan semua langkah memasak yang telah dilaksanakan
     * Metode ini membatalkan semua langkah dalam daftar completedSteps, dalam
     * urutan terbalik (LIFO - Last In First Out)
     */
    public void cancelAll() {
    }
}