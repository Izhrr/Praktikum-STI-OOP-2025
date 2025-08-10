import java.util.concurrent.atomic.AtomicInteger;

// Author: Izhar Alif Akbar - 18223129

public class Hitung {
    static final int NUM_OF_THREAD = 10;

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Lengkapi method ini untuk mencari bilangan prima dari [0, N]. Wajib menggunakan conccurency!

    // Di dalam method run() dalam runnable sertakan pemanggilan ThreadTracker.mark();
    // Jika tidak, atau jika tidak menggunakan conccurency maka kode akan terus runtime error!

    public int hitungPrima(int N) throws InterruptedException {
        AtomicInteger primeCount = new AtomicInteger(0);
        Thread[] threads = new Thread[NUM_OF_THREAD];
        int chunkSize = N / NUM_OF_THREAD;

        for (int i = 0; i < NUM_OF_THREAD; i++) {
            final int start = i * chunkSize + 1;
            final int end = (i == NUM_OF_THREAD - 1) ? N : (i + 1) * chunkSize;

            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    ThreadTracker.mark();
                    for (int j = start; j <= end; j++) {
                        if (isPrime(j)) {
                            primeCount.getAndIncrement();
                        }
                    }
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < NUM_OF_THREAD; i++) {
            threads[i].join();
        }

        return primeCount.get();
    }
}