import java.util.Scanner;

// Author: Izhar Alif Akbar - 18223129

public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();

        int mult = scan.nextInt();
        int booster = scan.nextInt();

        scan.close();

        if(booster == 1){
            mult *= 2;
        }
        else if(booster == 2){
            mult *= 3;
        }
        
        int ans = (n1 + n2 + n3 + n4 + n5) * mult;
        System.out.println(ans);
        
    }
}
