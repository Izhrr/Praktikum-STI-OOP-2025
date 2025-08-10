/**
 * DelayedOutput.java 
 * Tujuan: Print output berdasarkan waktu yang ditentukan
 * @author 18223129 Izhar Alif Akbar
 */

public class DelayedOutput extends Thread{
    private int delayMillisec; String output;
    public DelayedOutput(int delayMillisec, String output){
        this.delayMillisec = delayMillisec;
        this.output = output;
        
    }

    @Override
    public void run(){
        try{
            Thread.sleep(delayMillisec);
            System.out.println(output);
        }
        catch(Exception e){

        }
    }

    public static void printDelayed(int delayMillisec, String output) {
        new Thread(new DelayedOutput(delayMillisec, output)).start();
      // TODO print output setelah di delay selama delayMillisec
      // PENTING: gunakan threading agar tidak blocking
    }

    public static void main(String [] args){
        System.out.println("Test 3");
        printDelayed(1000, "Test 1");
        printDelayed(500, "Test 2");
        
    }
}