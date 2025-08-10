import java.util.Scanner;

// Author: Izhar Alif Akbar - 18223129

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String namaCimol1 = scan.next();
        int hargaCimol1 = scan.nextInt();
        int stokCimol1 = scan.nextInt();
        CimolBojot cimol1 = new CimolBojot(namaCimol1, hargaCimol1, stokCimol1);
        
        String namaCimol2 = scan.next();
        int hargaCimol2 = scan.nextInt();
        int stokCimol2 = scan.nextInt();
        CimolBojot cimol2 = new CimolBojot(namaCimol2, hargaCimol2, stokCimol2);
        
        String namaCimol3 = scan.next();
        int hargaCimol3 = scan.nextInt();
        int stokCimol3 = scan.nextInt();
        CimolBojot cimol3 = new CimolBojot(namaCimol3, hargaCimol3, stokCimol3);

        int kasAwal = scan.nextInt();
        Toko toko = new Toko(kasAwal);

        toko.addCimolBojot(cimol1);
        toko.addCimolBojot(cimol2);
        toko.addCimolBojot(cimol3);

        String cimolJual = scan.next();
        int quantityCimolJual = scan.nextInt();

        System.out.println(toko.sellCimolBojot(cimolJual, quantityCimolJual));
        System.out.println("Kas kasir sekarang: " + toko.getKas());


        scan.close();
    }
}
