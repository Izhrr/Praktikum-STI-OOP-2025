// Author: Izhar Alif Akbar - 18223129

public class MaskPII {
    private String maskEmail(String email) {
        email = email.toLowerCase();
        int atIndex = email.indexOf("@");
        String name = email.substring(0, atIndex);
        String domain = email.substring(atIndex);
        
        String maskedName = name.charAt(0) + "*****" + name.charAt(name.length() - 1);
        
        return maskedName + domain;
    }

    private String maskPhoneNumber(String phoneNumber) {
        String digits = phoneNumber.replaceAll("[^0-9]", "");
        int length = digits.length();
        String localNumber = digits.substring(length - 10);
        String countryCode = digits.substring(0, length - 10);
        
        String maskedLocal = "***-***-" + localNumber.substring(6);
        
        if (countryCode.length() == 0) return maskedLocal;
        
        String maskedCountry = "+";
        for (int i = 0; i < countryCode.length(); i++) {
            maskedCountry += "*";
        }
        maskedCountry += "-" + maskedLocal;
        
        return maskedCountry;
    }

    public String maskPII(String pii) {
        if (pii.contains("@")) {
            return maskEmail(pii);
        } else {
            return maskPhoneNumber(pii);
        }
        // dilakukan pengecekan String pii
        // jika pii merupakan email, panggil method maskEmail
        // jika pii merupakan phone number, panggil method maskPhoneNumber

    }
}