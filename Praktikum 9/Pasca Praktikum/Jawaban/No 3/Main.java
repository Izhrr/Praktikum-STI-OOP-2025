// Author: Izhar Alif Akbar - 18223129

public class Main{
    public static void main(String[] args){
        String text = "12345678";
        int n = 3;
        String textHapus = text.substring(text.length() - n, text.length());
        text = text.substring(0, text.length()-n);

        System.out.println("Text yg dihapus: " + textHapus);
        System.out.println("Sisa text: " + text);
    }
}