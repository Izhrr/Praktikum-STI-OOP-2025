import java.util.Scanner;
import java.util.Map;
import java.util.TreeSet;

// Author: Izhar Alif Akbar - 18223129

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();

        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0 ; i < n ; i++){
            String line = scan.nextLine();
            String[] command = line.split(" ");

            if(command[0].equals("add")){
                int x = Integer.parseInt(command[1]);
                treeSet.add(x);
            }
            else if(command[0].equals("remove")){
                int x = Integer.parseInt(command[1]);
                if(treeSet.contains(x)){
                    treeSet.remove(x);
                }
                else{
                    System.out.println("Element " + x + " is not in The TreeSet");
                }
            }
            else if(command[0].equals("first")){
                if(treeSet.isEmpty()){
                    System.out.println("EMPTY");
                }
                else{
                    System.out.println(treeSet.first());
                }
            }
            else if(command[0].equals("last")){
                if(treeSet.isEmpty()){
                    System.out.println("EMPTY");
                }
                else{
                    System.out.println(treeSet.last());
                }
            }
        }
        scan.close();
    }
}
