import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Author: Izhar Alif Akbar - 18223129

public class Mahasiswa {
    private String nim;
    private String nama;
    private HashMap<String, String> nilai;

    static public ArrayList<String> registeredNim = new ArrayList<>();

    /*
     * Konstruktor objek Mahasiswa
     *
     * Bila NIM sudah ada di dalam daftar registeredNim, maka throw Error
     * NimAlreadyExistsException
     * Hint: - Instatiasi HashMap menggunakan new HashMap<String, String>()
     * - Cara mengecek ada suatu objek ada di dalam ArrayList adalah,
     * arr.contains(obj)
     */
    public Mahasiswa(String nim, String nama) throws NimAlreadyExistsException {
        for(int i = 0; i < registeredNim.size() ; i++){
            if(registeredNim.get(i) == nim){
                throw new NimAlreadyExistsException();
            }
        }

        this.nim = nim;
        this.nama = nama;
        nilai = new HashMap<String, String>();
        registeredNim.add(nim);
    }

    /*
     * Menambahkan nilai matakuliah baru ke daftar nilai Mahasiswa, nilai akan
     * diubah ke indeks kemudian masuk ke daftar nilai
     *
     * Bila nilai yang diberikan kurang dari 0 atau lebih dari 100, maka throw Error
     * InvalidScoreException
     * Bila kode matkul sudah ada di daftar nilai Mahasiswa, maka throw
     * DuplicateSubjectException dengan format "{kode} already in grades!"
     * Hint: Pengecekan key dilakukan dengan menggunakan method containsKey(Object
     * key) pada HashMap
     * Pengecekan value dilakukan dengan menggunakan method containsValue(Object
     * value) pada HashMap
     */
    public void addGrade(String kodeMatkul, Double nilai) throws InvalidScoreException, DuplicateSubjectException {
        if(nilai < 0 || nilai > 100){
            throw new InvalidScoreException();
        }
        if(this.nilai.containsKey(kodeMatkul)){
            throw new DuplicateSubjectException(kodeMatkul + " already in grades!");
        }
        if(nilai > 90){
            this.nilai.put(kodeMatkul, "A");
        }
        else if(nilai > 70){
            this.nilai.put(kodeMatkul, "B");
        }
        else if(nilai > 50){
            this.nilai.put(kodeMatkul, "C");
        }
        else if(nilai > 40){
            this.nilai.put(kodeMatkul, "D");
        }
        else{
            this.nilai.put(kodeMatkul, "E");
        }
    }

    /* Getter untuk NIM Mahasiswa */
    public String getNim() {
        return nim;
    }

    /* Getter untuk nama Mahasiswa */
    public String getNama() {
        return nama;
    }

    /* Getter untuk daftar nilai Mahasiswa */
    public Map<String, String> getNilai() {
        return nilai;
    }
}

class NimAlreadyExistsException extends Exception {
    public String getMessage() {
        return "NIM is already registered!";
        // Implementasi custom message NimAlreadyExistsException
        // Return pesan multak berisi: "NIM is already registered!"
    }
}

class InvalidScoreException extends Exception {
    public String getMessage() {
        return "Score cannot be below 0 or above 100!";
        // Implementasi custom message InvalidScoreException
        // Return pesan multak berisi: "Score cannot be below 0 or above 100!"
    }
}

class DuplicateSubjectException extends Exception {
    public DuplicateSubjectException(String message) {
        super(message);
        // Implementasi DuplicateSubjectException
    }
}