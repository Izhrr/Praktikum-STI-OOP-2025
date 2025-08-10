import java.util.ArrayList;

public class ComplexWordCountServer2 extends Thread{
    private int nWorkers;

    // masukkan arraylist of string dipastikan berupa alfabet lowercase saja
    private ArrayList<String> array;

    // hasil pada method countSpecialString akan disimpan pada res
    int[] res = new int[26];

    ComplexWordCountServer2(int nWorkers, ArrayList<String> array) {
        this.nWorkers = nWorkers;
        this.array = array;

        
        // Inisialisasi attributes
    }

    public void countSpecialString() throws InterruptedException {
        int size = array.size();
        Thread[] threads = new Thread[nWorkers];
        int[][] localResults = new int[nWorkers][26];

        for (int i = 0; i < nWorkers; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = threadIndex; j < size; j += nWorkers) {
                        String str = array.get(j);
                        int[] localCount = characterCountHelper(str);
                        for (int k = 0; k < 26; k++) {
                            localResults[threadIndex][k] += localCount[k];
                        }
                    }
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < nWorkers; i++) {
            threads[i].join();
        }

        // Gabungkan hasil semua thread ke res
        for (int i = 0; i < nWorkers; i++) {
            for (int j = 0; j < 26; j++) {
                res[j] += localResults[i][j];
            }
        }
    }


    protected int[] characterCountHelper(String str) {
        int[] counts = new int[26];
        for(char c : str.toCharArray()){
            counts[c -'a']++;
        }
        
        return counts;
        // Menghitung berapa banyak occurence dari suatu karakter pada suatu string
        // lalu dipetakan pada suatu array of integer

        // HINT : untuk memetakan suatu karakter ke array of integer, anda bisa melakukan arr[c-'a']
        // sehingga apabila variable c merupakan karakter 'a', value dari c-'a' menjadi 0, begitupun
        // dengan karakter alfabet lainnya
    }

    public String toString() {
        int[] temp = res.clone();
        int oneCount = 0, twoCount = 0, threeCount = 0;

        // Kata "one" -> o, n, e
        while (temp['o' - 'a'] > 0 && temp['n' - 'a'] > 0 && temp['e' - 'a'] > 0) {
            oneCount++;
            temp['o' - 'a']--;
            temp['n' - 'a']--;
            temp['e' - 'a']--;
        }

        // Kata "two" -> t, w, o
        while (temp['t' - 'a'] > 0 && temp['w' - 'a'] > 0 && temp['o' - 'a'] > 0) {
            twoCount++;
            temp['t' - 'a']--;
            temp['w' - 'a']--;
            temp['o' - 'a']--;
        }

        // Kata "three" -> t, h, r, e, e
        while (temp['t' - 'a'] > 0 && temp['h' - 'a'] > 0 && temp['r' - 'a'] > 0 &&
            temp['e' - 'a'] >= 2) {
            threeCount++;
            temp['t' - 'a']--;
            temp['h' - 'a']--;
            temp['r' - 'a']--;
            temp['e' - 'a'] -= 2;
        }

        return String.format("one : %d, two : %d, three : %d\n", oneCount, twoCount, threeCount);
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("oneonen");
        arr.add("two");
        arr.add("threeeethr");

        ComplexWordCountServer server = new ComplexWordCountServer(2, arr);
        server.countSpecialString();
        System.out.print(server.toString());
    }
}
