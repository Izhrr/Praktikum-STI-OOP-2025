/**
 * Handphone.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author [NIM] [Nama]
 */

public abstract class Handphone {
    private String nama; // sama dengan merk
    private Integer harga;
    private Integer ram;

    public Handphone(String nama, Integer harga, Integer ram) {
        // Inisialisasi handphone dengan property terkait
    }

    public String getNama() {
    }

    public void setNama(String nama) {
    }

    public Integer getHarga() {
    }

    public void setHarga(Integer harga) {
    }

    public Integer getRam() {
    }

    public void setRam(Integer ram) {
    }

    public void printSpec() {
        // Mencetak spec dari handphone
        // spec dari handphone dicetak dalam format(diakhiri newline, tanpa spasi di
        // awal):
        // [nama] - Harga [harga], RAM [ram]
    }

    public Boolean isBetterThan(Handphone otherHP) {
        // Mereturn true apabila RAM HP ini > RAM HP lain,
        // bila RAM sama, return true apabila Harga HP ini < Harga HP lain
        // return false dalam kasus lain
    }

    // Melakukan penawaran terhadap HP terkait
    public abstract Boolean tawar(Integer hargaTawaran);

    // Mencetak apa yang membuat HP terkait spesial
    public abstract void printSpeciality();
}