// Author: Izhar Alif Akbar - 18223129

public class MagicCalculator {
    /**
     * Menjalankan metode calculate untuk MagicCalculator
     * lihat deskripsi soal untuk cara kerja metode calculate
     * 
     * @param array Number
     */
    public void calculate(Number[] arr) {
        System.out.println("=== MULAI KALKULASI ===");
        
        for (int i = 0; i < arr.length; i++) {
            Number num = arr[i];
            if (num instanceof Integer) {
                int intValue = (Integer) num;
                System.out.println(intValue + " adalah tipe integer");
                System.out.println(Integer.MAX_VALUE);
                System.out.println(Integer.MIN_VALUE);
            } else if (num instanceof Byte) {
                byte byteValue = (Byte) num;
                System.out.println(byteValue + " adalah tipe byte");
                System.out.println(Byte.MAX_VALUE);
                System.out.println(Byte.MIN_VALUE);
            } else if (num instanceof Double) {
                double doubleValue = (Double) num;
                System.out.println(doubleValue + " adalah tipe double");
                System.out.println(Double.MAX_VALUE);
                System.out.println(Double.MIN_VALUE);
                System.out.println(Double.isInfinite(doubleValue));
            } else if (num instanceof Float) {
                float floatValue = (Float) num;
                System.out.println(floatValue + " adalah tipe float");
                System.out.println(Float.MAX_VALUE);
                System.out.println(Float.MIN_VALUE);
                System.out.println(Float.isInfinite(floatValue));
            } else if (num instanceof Short) {
                short shortValue = (Short) num;
                System.out.println(shortValue + " adalah tipe short");
                System.out.println(Short.MAX_VALUE);
                System.out.println(Short.MIN_VALUE);
            } else if (num instanceof Long) {
                long longValue = (Long) num;
                System.out.println(longValue + " adalah tipe long");
                System.out.println(Long.MAX_VALUE);
                System.out.println(Long.MIN_VALUE);
            }
        }
        System.out.println("=== KALKULASI SELESAI ===");
    }
}