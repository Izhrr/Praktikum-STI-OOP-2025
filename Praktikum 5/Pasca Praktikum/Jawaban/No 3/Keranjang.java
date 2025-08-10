/**
 * Keranjang.java
 */

 // Author: Izhar Alif Akbar - 18223129

public class Keranjang<T extends Barang> {
    private T t;
    private String type;

    /**
     * Constructor untuk membuat keranjang baru
     * 
     * @param t Barang yang disimpan keranjang
     */
    public Keranjang(T t) {
        this.t = t;
        type = t.getClass().getName();
    }

    /**
     * Mengembalikkan tipe barang
     * 
     * @return tipe barang
     */
    public String getType() {
            return type;

    }

    /**
     * Mengembalikkan barang
     * 
     * @return barang
     */
    public T getBarang() {
            return t;
    }

    public void add(T object) {
        this.t = object;
    }
    /**
     * Mencetak barang dalam format :
     * "<Nama Barang> - <Nilai barang>"
     * Sebagai contoh : "Oppo - HP seharga 20000"
     * 
     * HINT : ingat cara kerja toString!
     */
    public void printBarang() {
        if(this != null){
            System.out.println(t.getName() + " - " + this.t);
            // System.out.printf("%s - %d\n", type, t);
        }
    }

    // public static void main(String[] args){
    //     Keranjang<Handphone> hp1 = new Keranjang<>(new Handphone("Oppo", 100));
    //     hp1.add(new Handphone("Oppo", 100));
    //     hp1.printBarang();
    // }
}

class Barang {
    private String name;

    public Barang(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Baju extends Barang {
    private String color;

    public Baju(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return "Baju berwarna " + this.color;
    }
}

class Handphone extends Barang {
    private int price;

    public Handphone(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return "HP seharga " + this.price;
    }
}