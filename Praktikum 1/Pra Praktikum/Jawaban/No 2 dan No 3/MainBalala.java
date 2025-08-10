import java.util.Scanner;

// Author: Izhar Alif Akbar - 18223129

public class MainBalala {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String suit1 = scan.next();
        String rank1 = scan.next();
        int multiplier1 = scan.nextInt();
        Kartu kartu1 = new Kartu(suit1, rank1, multiplier1);

        String suit2 = scan.next();
        String rank2 = scan.next();
        int multiplier2 = scan.nextInt();
        Kartu kartu2 = new Kartu(suit2, rank2, multiplier2);

        String suit3 = scan.next();
        String rank3 = scan.next();
        int multiplier3 = scan.nextInt();
        Kartu kartu3 = new Kartu(suit3, rank3, multiplier3);
        
        String suit4 = scan.next();
        String rank4 = scan.next();
        int multiplier4 = scan.nextInt();
        Kartu kartu4 = new Kartu(suit4, rank4, multiplier4);

        String suit5 = scan.next();
        String rank5 = scan.next();
        int multiplier5 = scan.nextInt();
        Kartu kartu5 = new Kartu(suit5, rank5, multiplier5);

        int jokerType = scan.nextInt();
        int targetValue = scan.nextInt();

        Blind blind = new Blind(kartu1, kartu2, kartu3, kartu4, kartu5, jokerType, targetValue);

        System.out.println("Kartu pertama punya suit " + kartu1.getSuit() + " dengan rank " + kartu1.getRank() + " dan multiplier " + kartu1.getMultiplier());
        System.out.println("Kartu kedua punya suit " + kartu2.getSuit() + " dengan rank " + kartu2.getRank() + " dan multiplier " + kartu2.getMultiplier());
        System.out.println("Kartu ketiga punya suit " + kartu3.getSuit() + " dengan rank " + kartu3.getRank() + " dan multiplier " + kartu3.getMultiplier());
        System.out.println("Kartu keempat punya suit " + kartu4.getSuit() + " dengan rank " + kartu4.getRank() + " dan multiplier " + kartu4.getMultiplier());
        System.out.println("Kartu kelima punya suit " + kartu5.getSuit() + " dengan rank " + kartu5.getRank() + " dan multiplier " + kartu5.getMultiplier());

        System.out.println("Skor akhir : " + blind.calculateTotalScore());
        if(blind.isWin()){
            System.out.println("MENANG!");
        }
        else{
            System.out.println("KALAH!");
        }

        scan.close();
    }
}
