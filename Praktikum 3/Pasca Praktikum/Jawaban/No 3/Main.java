import java.util.Scanner;

// Author: Izhar Alif Akbar - 18223129

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mode = scanner.nextInt();
        
        switch (mode) {
            case 1: 
                String plaintext = scanner.next();
                int key = scanner.nextInt();
                System.out.println(Hexaesar.encrypt(plaintext, key));
                break;
                
            case 2: 
                String ciphertext = scanner.next();
                key = scanner.nextInt();
                System.out.println(Hexaesar.decrypt(ciphertext, key));
                break;
                
            case 3: 
                int plaintextInt = scanner.nextInt();
                key = scanner.nextInt();
                System.out.println(Hexaesar.encrypt(plaintextInt, key));
                break;
                
            case 4:
                int ciphertextInt = scanner.nextInt();
                key = scanner.nextInt();
                System.out.println(Hexaesar.decrypt(ciphertextInt, key));
                break;
                
            default:
                System.out.println("Invalid mode. Please enter a number between 1 and 4.");
                break;
        }

        scanner.close();
    }
}