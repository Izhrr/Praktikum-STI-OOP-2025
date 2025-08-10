import java.util.HashMap;

// Author: Izhar Alif Akbar - 18223129

public class Main {
    public static void main(String[] args) {
        // Membuat HashMap
        HashMap<String, String> map = new HashMap<>();

        // Menambahkan pasangan key-value
        map.put("101", "Alice");
        map.put("102", "Bob");
        map.put("103", "Charlie");

        // Mengakses value berdasarkan key
        System.out.println("Value untuk key '101': " + map.get("101")); // Output: Alice

        // Mengecek apakah key atau value ada
        System.out.println("Apakah key '102' ada? " + map.containsKey("102")); // Output: true
        System.out.println("Apakah value 'Charlie' ada? " + map.containsValue("Charlie")); // Output: true

        // Menghapus pasangan key-value
        map.remove("102");

        // Menampilkan semua pasangan key-value
        System.out.println("Isi HashMap: " + map);
    }
}