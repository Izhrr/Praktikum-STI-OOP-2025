/**
* ArraySum.java 
* @author 18223129 Izhar Alif AKbar
*/

/**
 * Jangan lupa tambahkan kata kunci yang dibutuhkan
 */ 

public class ArraySum extends Thread {
    // nWorkers menyatakan jumlah maksimum threads yang tersedia
    private int nWorkers;
    // array untuk menampung array masukan
    private Integer[] arr;
    /**
     * Tambahkan atribut kelas yang dibutuhkan
     */ 


    /**
     * Konstruktor
     * Inisialisasi atribut kelas
     */
    ArraySum(int nWorkers, Integer[] arr) {
        this.nWorkers = nWorkers;
        this.arr = arr;
    }

    /**
     * Implementasi
     * method sum akan membuat sejumlah thread dan memetakan array masukan secara merata ke semua threads yang dapat dibuat
     */
    public int sum() throws InterruptedException {
        Thread[] threads = new Thread[nWorkers];
        int[] subtotal = new int[nWorkers];
        
        int n = arr.length;
        if (n == 0) return 0;

        for (int i = 0; i < nWorkers; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = threadIndex; j < arr.length; j += nWorkers) {
                        subtotal[threadIndex] += arr[j];

                        //Cek Iterasi
                        System.out.println("ThreadIndex " + threadIndex + " : " + subtotal[threadIndex]);
                    }
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < nWorkers; i++) {
            threads[i].join();
        }

        //Cek Hasil
        for (int val : subtotal){
            System.out.println(val);
        }

        int total = 0;
        for (int val : subtotal) {
            total += val;
        }

        return total;
    }

    /**
     * Implementasi
     * method partialSum akan melakukan penjumlahan elemen-elemen array pada index `start` sampai `end-1`
     */
    protected int partialSum(int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += arr[i];
        }

        return sum;
    }
}