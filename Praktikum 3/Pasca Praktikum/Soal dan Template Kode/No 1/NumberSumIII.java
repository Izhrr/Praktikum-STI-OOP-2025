public class NumberSumIII {

    public Number[] numberSumIII(Number[] numbers) {
        Number[] result = new Number[numbers.length]; // array keluaran
        int index = 0;

        // buat sesuai dengan soal dan gunakan fungsi add, subtract, multiply untuk memudahkan

        // mengisi array result yang tersisa dengan null
        while (index < numbers.length) {
            result[index++] = null;
        }
        
        return result;
    } 

    private static Number add(Number a, Number b) {} // lakukan operasi penjumlahan sesuai tipe data
    private static Number subtract(Number a, Number b) {} // lakukan operasi pengurangan sesuai tipe data
    private static Number multiply(Number a, Number b) {} // lakukan operasi perkalian sesuai tipe data
}
