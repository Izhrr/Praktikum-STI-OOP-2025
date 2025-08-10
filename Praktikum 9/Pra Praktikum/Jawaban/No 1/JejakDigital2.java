import java.util.*;

// Author: Izhar Alif Akbar - 18223129

public class JejakDigital2<A> {
    private static class ItemJejakDigital<T> {
        private final int id;
        private final T activity;

        public ItemJejakDigital(int id, T activity) {
            this.id = id;
            this.activity = activity;
            
        }

        public int id() { // Getter untuk ID
            return id;
        }

        public T activity() { // Getter untuk activity
            return activity;
        }
    }

    private final int maxSize;
    private LinkedList<ItemJejakDigital<A>> listActivities; // List untuk menyimpan Item
    private int nextId = 0; // counter untuk ID aktivitas berikutnya

    /**
     * Konstruktor untuk JejakDigital
     * @param maxSize jumlah maksimal jejak digital yang bisa disimpan di suatu feed (list)
     * TC input maxSize dipastikan selalu angka positif, jadi tidak perlu handle untuk yang nonpositif.
     */
    public JejakDigital2(int maxSize) {
        this.maxSize = maxSize;
        listActivities = new LinkedList<>();
    }

   /**
     * Nambahin jejak (aktivitas) baru ke feed.
     * Jejak baru ini bakal dapet ID unik yang terus nambah,
     * dan jadi yang paling baru (ditaruh di paling depan list).
     * Kalo nambahin ini bikin feed kepenuhan (lebih dari maxSize),
     * jejak digital yang paling lama (di paling belakang list) bakal dihapus.
     * @param dataJejakDigital aktivitas yang mau ditambahin ke feed
     */
    public void addActivity(A dataJejakDigital) {
        ItemJejakDigital<A> newItem = new ItemJejakDigital<>(nextId++, dataJejakDigital);
        listActivities.add(newItem);
        if(listActivities.size() > maxSize){
            listActivities.remove();
        }
    }

    /**
     * Ngasih list string yang udah diformat jadi "[ID] - Aktivitas" (pake []-nya yah),
     * diurutin dari jejak PALING BARU ke PALING LAMA.
     * Cocok buat ditampilin langsung ke user. (usernya adalah grader olympia)
     *
     * @return List of String yang udah rapi dan siap tampil.
     */
    public List<String> recentToOldestJejakDigital() {
        List<String> result = new ArrayList<>();
        for(ItemJejakDigital<A> item : listActivities){
            result.add("[" + item.id() + "] - " + item.activity());
        }
        return result;
    }

    /**
     * Ngasih list string yang udah diformat jadi "[ID] - Aktivitas" (pake []-nya yah),
     * diurutin dari jejak PALING LAMA ke PALING BARU.
     * Cocok buat ditampilin langsung ke user. (usernya adalah grader olympia)
     *
     * @return List of String yang udah rapi dan siap tampil.
     */
    public List<String> oldestToRecentJejakDigital() {
        List<String> result = new ArrayList<>();
        for(int i = listActivities.size() - 1; i >= 0 ; i-- ){
            ItemJejakDigital<A> item = listActivities.get(i);
            result.add("[" + item.id() + "] - " + item.activity());
        }
        return result;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return listActivities.size();
    }

    public List<A> getActivities() {
        List<A> activities = new ArrayList<>();
        for (ItemJejakDigital<A> item : listActivities) {
            activities.add(item.activity());
        }
        return activities;
    }
}