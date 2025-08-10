import java.util.Scanner;

// Author: Izhar Alif Akbar - 18223129

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Password pass = new Password(input);

        try{
            boolean isValid = pass.validate();
            System.out.println(isValid);
            System.out.println("Password validated.");
            
        }
        catch(InvalidLengthException e){
            System.out.println(e.getClass().getName() + "! " + e.getMessage());
            System.out.println("Password string error!");
        }
        catch(InvalidPasswordException e){
            System.out.println(e.getClass().getName() + "! " + e.getMessage());
            System.out.println("Password string error!");
        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
            System.out.println("Password string error!");
        }
        finally{
            scan.close();
            System.out.println("Operation finished.");
        }
    }
}