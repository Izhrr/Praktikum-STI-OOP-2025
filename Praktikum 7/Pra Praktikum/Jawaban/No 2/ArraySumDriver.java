/* Untuk mengaktifkan assertion, jalankan driver dengan flag -ea
   Contoh:
   $ javac ArraySum.java ArraySumDriver.java
   $ java -ea ArraySumDriver
 */
public class ArraySumDriver {
    public static void main(String[] args) throws InterruptedException {
       int nWorkers = 3;
       Integer[] arr = {1,3,5,7 ,9};

       ArraySum arraySum = new ArraySum(nWorkers, arr);

       Integer expectedArraySum = 25;
       Integer actualArraySum = arraySum.sum();

       assert expectedArraySum == actualArraySum;

      System.out.println("Excpected: " + expectedArraySum);
      System.out.println("Actual: " + actualArraySum);

       System.out.println("Yeay! Program berhasil :D");
    }
}
