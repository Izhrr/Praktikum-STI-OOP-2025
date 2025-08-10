import java.util.ArrayList;

/**
 * ComplexWordCountServer.java 
 * @author 18223129 Izhar Alif Akbar
 */

public class ComplexWordCountServer extends Thread {

    private int nWorkers;
    private ArrayList<String> array;

    int[] res = new int[26]; // hasil akhir penggabungan semua thread
    private static ArrayList<int[]> allResults;

    // konstruktor utama
    ComplexWordCountServer(int nWorkers, ArrayList<String> array) {
        this.nWorkers = nWorkers;
        this.array = array;
    }

    // fungsi pembantu hitung karakter
    protected int[] characterCountHelper(String str) {
        int[] charCount = new int[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCount[c - 'a']++;
            }
        }
        return charCount;
    }

    public void countSpecialString() throws InterruptedException {
        // reset hasil gabungan
        for (int i = 0; i < 26; i++) res[i] = 0;

        allResults = new ArrayList<>();

        // Batasi jumlah thread sebanyak nWorkers atau jumlah string
        int totalData = array.size();
        int chunkSize = (int) Math.ceil((double) totalData / nWorkers);
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < nWorkers; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, totalData);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] local = new int[26];
                    for (int j = start; j < end; j++) {
                        int[] temp = characterCountHelper(array.get(j));
                        for (int k = 0; k < 26; k++) {
                            local[k] += temp[k];
                        }
                    }
                    synchronized (allResults) {
                        allResults.add(local);
                    }
                }
            });

            threads.add(thread);
            thread.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        // Gabungkan semua hasil ke res
        for (int[] result : allResults) {
            for (int i = 0; i < 26; i++) {
                res[i] += result[i];
            }
        }
    }

    @Override
    public String toString() {
        int[] remaining = res.clone();

        int oneCount = Math.min(remaining['o' - 'a'], Math.min(remaining['n' - 'a'], remaining['e' - 'a']));
        // Kurangi huruf yang dipakai untuk one
        remaining['o' - 'a'] -= oneCount;
        remaining['n' - 'a'] -= oneCount;
        remaining['e' - 'a'] -= oneCount;

        int twoCount = Math.min(remaining['t' - 'a'], Math.min(remaining['w' - 'a'], remaining['o' - 'a']));
        remaining['t' - 'a'] -= twoCount;
        remaining['w' - 'a'] -= twoCount;
        remaining['o' - 'a'] -= twoCount;

        int eCountForThree = remaining['e' - 'a'] / 2;
        int threeCount = Math.min(
            Math.min(remaining['t' - 'a'], remaining['h' - 'a']),
            Math.min(remaining['r' - 'a'], eCountForThree)
        );

        return "one : " + oneCount + ", two : " + twoCount + ", three : " + threeCount + "\n";
    }
}
