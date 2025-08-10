import java.util.*;

// Author: Izhar Alif Akbar - 18223129

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0 ; i  < n ; i++){
            String line = scan.nextLine();
            String[] command = line.split(" ");
            if(command[0].equals("tambah")){
                stack.push(command[1]);
                System.out.println("sudah menambahkan "+ command[1]);
            }
            else if(command[0].equals("beli")){
                if(stack.isEmpty()){
                    System.out.println("maaf stock habis");
                }
                else{
                    String beli = stack.pop();
                    System.out.println("telah membeli " + beli);
                }
            }
            else if(command[0].equals("lihat")){
                if(stack.isEmpty()){
                    System.out.println("maaf stock habis");
                }
                else{
                    System.out.println("print paling atas adalah " + stack.peek());
                }
            }
            else if(command[0].equals("habis?")){
                if(stack.isEmpty()){
                    System.out.println("ya, habis");
                }
                else{
                    System.out.println("masih ada kok");
                }
            }
        }
        scan.close();
    }
}