// Author: Izhar Alif Akbar - 18223129

public class Hexaesar {
    
    public static String encrypt(String plaintext, int key) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            int value;
            
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                value = c - 'a' + 10;
            } else if (c >= 'A' && c <= 'F') {
                value = c - 'A' + 10;
            } else {
                result.append(c);
                continue;
            }
            
            value = (value + key) % 16;
            
            if (value < 10) {
                result.append((char) (value + '0'));
            } else {
                result.append((char) (value - 10 + 'a'));
            }
        }
        
        return result.toString();
    }


    public static String decrypt(String encrypted, int key) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            int value;
            
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                value = c - 'a' + 10;
            } else if (c >= 'A' && c <= 'F') {
                value = c - 'A' + 10;
            } else {
                result.append(c);
                continue;
            }
            
            value = (value - key) % 16;
            if (value < 0) {
                value += 16;
            }
            
            if (value < 10) {
                result.append((char) (value + '0'));
            } else {
                result.append((char) (value - 10 + 'a'));
            }
        }
        
        return result.toString();
    }

    public static int encrypt(int plaintext, int key) {
        String hexValue = HexCalculator.toHex(plaintext);
        
        String encryptedHex = encrypt(hexValue, key);
        
        return HexCalculator.toDecimal(encryptedHex);
    }

    
    public static int decrypt(int encrypted, int key) {
        String hexValue = HexCalculator.toHex(encrypted);
        
        String decryptedHex = decrypt(hexValue, key);
        
        return HexCalculator.toDecimal(decryptedHex);
    }
}