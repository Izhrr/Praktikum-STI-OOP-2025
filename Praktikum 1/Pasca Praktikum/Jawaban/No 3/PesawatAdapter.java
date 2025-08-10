/**
 * PesawatAdapter.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18223129 Izhar Alif Akbar
 */

public class PesawatAdapter extends WargaSipil {
    private Pesawat pesawat;

    public PesawatAdapter(Pesawat pesawat, String namaPemesan) {
        super(namaPemesan);
        this.pesawat=pesawat;
    
    }

    public void urusAdministrasi() {
        pesawat.pesanTiket(namaPemesan);
    }

    public void cobaKabur() {
        pesawat.berangkatKeBandara(namaPemesan);
        pesawat.checkIn(namaPemesan);
        // Implementasi sesuai petunjuk soal
    }
    
    public void berhasilKabur() {
        pesawat.naikPesawat(namaPemesan);
        pesawat.boarding();
        // Implementasi sesuai petunjuk soal
    }
}
