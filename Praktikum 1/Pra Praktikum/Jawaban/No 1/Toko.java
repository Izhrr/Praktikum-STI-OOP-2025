/**
 * Toko.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18223129 Izhar Alif Akbar
 */


 public class Toko {
    // Deklarasi atribut
    private CimolBojot[] cimolBojotArray;
    private int kas;
    private static final int MAX_CIMOL = 3;
    private int cimolCount;

    public Toko(int initialKas) {
       this.kas = initialKas;
       this.cimolBojotArray = new CimolBojot[MAX_CIMOL];
       this.cimolCount = 0;
    }

    public int getKas() {
        return kas;
    }

    public void addCimolBojot(CimolBojot cimolBojot) {
        if(cimolCount <= MAX_CIMOL){
            this.cimolBojotArray[cimolCount] = cimolBojot;
            cimolCount++;
        }
    }

    public int findCimolBojotIndexByName(String namaMenu) {
        for (int i = 0; i < cimolCount; i++) {
            if (cimolBojotArray[i].getNamaMenu().equals(namaMenu)) {
                return i;
            }
        }
        return -1;
    }

    public String sellCimolBojot(String namaMenu, int quantity) {
        int index = findCimolBojotIndexByName(namaMenu);
        if (index == -1) {
            return "Kita gak jual itu kaka";
        }

        CimolBojot cimolBojot = cimolBojotArray[index];
        if (!cimolBojot.isHaveEnoughStok(quantity)) {
            return "Waduh stoknya gak cukup";
        }

        cimolBojot.reduceStok(quantity);
        int totalHarga = cimolBojot.getHarga() * quantity;
        kas += totalHarga;

        return "Berhasil menjual cimol " + namaMenu + " sebanyak " + quantity +
               "\nSekarang sisa: " + cimolBojot.getStok();
    }

    
}
