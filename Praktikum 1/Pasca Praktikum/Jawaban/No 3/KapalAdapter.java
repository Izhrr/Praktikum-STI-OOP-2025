/**
 * KapalAdapter.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18223129 Izhar Alif Akbar
 */

public class KapalAdapter extends WargaSipil {
    private Kapal kapal;

    public KapalAdapter(Kapal kapal, String namaPemesan) {
        super(namaPemesan);
        this.kapal = kapal;
    }

    public void urusAdministrasi() {
        kapal.pesanTiket(namaPemesan);
        kapal.pilihKamar(namaPemesan);
    }

    public void cobaKabur() {
        kapal.berangkatKePelabuhan(namaPemesan);
        kapal.verifikasiTiket(namaPemesan);
        // Implementasi sesuai petunjuk soal
    }
    
    public void berhasilKabur() {
        kapal.naikKapal(namaPemesan);
        kapal.berlayar();
        // Implementasi sesuai petunjuk soal
    }
}
