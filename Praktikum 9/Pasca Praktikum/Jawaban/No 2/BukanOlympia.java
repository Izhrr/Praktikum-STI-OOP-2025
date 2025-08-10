import java.util.ArrayList;
import java.util.Scanner;

// Author: Izhar Alif Akbar - 18223129

public class BukanOlympia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String namaBahasa = scanner.next();
            int jumlahFile = scanner.nextInt();
            ArrayList<String> files = new ArrayList<>();
            for (int i = 0; i < jumlahFile; i++) {
                files.add(scanner.next());
            }

            Bahasa bahasa = BahasaFactory.getBahasaRunner(namaBahasa, files);
            bahasa.compile();

            if (scanner.hasNextInt()) {
                int jumlahTestcase = scanner.nextInt();
                for (int i = 0; i < jumlahTestcase; i++) {
                    String inputFilename = scanner.next();
                    String outputFilename = scanner.next();
                    try {
                        bahasa.grade(inputFilename, outputFilename);
                    } catch (BahasaError e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        } catch (BahasaError e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}