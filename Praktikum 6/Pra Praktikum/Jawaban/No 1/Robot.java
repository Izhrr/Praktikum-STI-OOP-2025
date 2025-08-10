// Author: Izhar Alif Akbar - 18223129

public class Robot {
    /**
     * Tambahkan atribut kelas disini
     */
    private int x;
    private int y;
    
    public Robot() {
        x = 0;
        y = 0;
        /**
         * Konstruktor
         * Jangan lupa inisialisasi atribut kelas
         */
    }

    public void walk(int x, int y) throws Exception {
        int tempX = this.x + x;
        int tempY = this.y + y;

        if(tempX > 5 || tempY > 5){
            throw new Exception("Malas berjalan");
        }

        this.x = tempX;
        this.y = tempY;

        System.out.println("Yawes Otw aing (" + this.x + ", " + this.y + ")");
        /**
         * Implementasi sesuai soal
         */
    }

    public void talk(String language) throws Exception {
        if(language.equalsIgnoreCase("Indonesia") || language.equalsIgnoreCase("Inggris")){
            System.out.println("Jago aing bisa " + language);
        }
        else{
            throw new Exception("Minimal belajar " + language + " dulu daripada nyuruh aing doang");
        }
        /**
         * Implementasi sesuai soal
         */
    }

    public void receiveCommand(String command) throws Exception {
        if(command.equalsIgnoreCase("talk") || command.equalsIgnoreCase("walk")){
        }
        else{
            throw new Exception("Nyuruh-nyuruh aing mulu ih. " + command + " tidak dikenal");
        }
        /**
         * Implementasi sesuai soal
         */
    }
}