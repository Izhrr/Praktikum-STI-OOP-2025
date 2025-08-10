import java.util.*;
import java.util.function.BinaryOperator;

// Author: Izhar Alif Akbar - 18223129

public class Fold {
    /**
     * Menggabungkan seluruh elemen dalam daftar menjadi satu nilai dengan menerapkan operasi BinaryOperator secara berurutan.
     *
     * Metode ini menggunakan elemen pertama dalam daftar sebagai nilai awal,
     * lalu menerapkan operator secara berurutan dari kiri ke kanan untuk menggabungkan seluruh elemen
     *
     *
     * @param <T>       tipe data elemen dalam daftar
     * @param list      daftar elemen yang akan digabungkan; PASTI tidak null atau kosong
     * @param operator  BinaryOperator yang mendefinisikan bagaimana dua elemen digabungkan, 
     *                  dapat digunakan sebagai fungsi dengan memanggil operator.apply(param1, param2)
     * @return          hasil akhir setelah seluruh elemen digabungkan
     */
    public static <T> T reduce(List<T> list, BinaryOperator<T> operator) {
        T x = list.get(0);
        for(int i = 1 ; i < list.size() ; i++){
            x = operator.apply(x,list.get(i));
        }
        return x;
    }

}
