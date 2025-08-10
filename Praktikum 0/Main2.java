import java.util.Scanner;

/**
 * Main.java
 * 
 * @author 18223129 Izhar Alif Akbar
 */

 public class Main {

    public static int getCardValue(char rank) {
        if (rank == 'T') return 10;
        else if (rank == 'J') return 11;
        else if (rank == 'Q') return 12;
        else if (rank == 'K') return 13;
        else if (rank == 'A') return 1;
        else if (rank >= '2' && rank <= '9') return rank - '0';
        else return -1;
    }
    
    /**
     * Mengecek apabila kartu memiliki nilai 10, J, Q, K, A
     * 
     * @param cards
     * @return true apabila kartu memiliki 10 sampai As, false sebaliknya
     */
    public static boolean isRoyal(String[] cards) {
        int orderCard = 0;
        int orderTrue = getCardValue('T') + getCardValue('J') + getCardValue('Q') + getCardValue('K') + getCardValue('A');
        for(int i = 0; i < 5; i++){
            orderCard += getCardValue((cards[i]).charAt(1));
        }

        return (isFlush(cards) && (orderCard == orderTrue));
    }

    /**
     * Mengecek apabila kartu dapat membentuk Full House
     * 
     * @param cards
     * @return true apabila kartu dapat membentuk Full House, false sebaliknya
     */
    public static boolean isFullHouse(String[] cards) {
        if(isFlush(cards)){
            return false;
        }
        else{
            int[] count = new int[14];
            for (int i = 0; i < 5; i++) {
                int value = getCardValue(cards[i].charAt(1));
                count[value]++;
            }

            boolean hasThree = false, hasTwo = false;
            for (int i = 0; i <14; i++) {
                if (count[i] == 3) hasThree = true;
                if (count[i] == 2) hasTwo = true;
            }
            return hasThree && hasTwo;
        }
    }

    /**
     * Mengecek apabila kartu dapat membentuk Flush
     * 
     * @param cards
     * @return true apabila kartu dapat membentuk Flush, false sebaliknya
     */
    public static boolean isFlush(String[] cards) {
        boolean paketSama = true;
        int i = 0;
        while(paketSama && i < 4){
            if((cards[i]).charAt(0) != (cards[i+1]).charAt(0)){
                paketSama = false;
            };
            i++;
        };
        return paketSama;
    }

    /**
     * Mengembalikan rangking dari set yang dimiliki dengan rangking berikut:
     * - Royal Flush: 3
     * - Full House: 2
     * - Flush: 1
     * - High Card: 0
     * 
     * @param cards
     * @return rangking
     */
    public static int getSetRanking(String[] cards) {
        if(isRoyal(cards)){
            return 3;
        }
        else if(isFullHouse(cards)){
            return 2;
        }
        else if(isFlush(cards)){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        String[] cardsTuanBil = new String[5];
        String[] cardsTuanMask = new String[5];

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            cardsTuanBil[i] = scan.nextLine();
        }
        for(int i = 0; i < 5; i++){
            cardsTuanMask[i] = scan.nextLine();
        }

        scan.close();

        if(getSetRanking(cardsTuanBil) > getSetRanking(cardsTuanMask)){
            System.out.println("Tuan Bil");
            System.out.println(getSetRanking(cardsTuanBil));
        }
        else if(getSetRanking(cardsTuanBil) < getSetRanking(cardsTuanMask)){
            System.out.println("Tuan Mask");
            System.out.println(getSetRanking(cardsTuanMask));
        }
        else{
            System.out.println("Seri");
            System.out.println(getSetRanking(cardsTuanBil));
        }

    }
}