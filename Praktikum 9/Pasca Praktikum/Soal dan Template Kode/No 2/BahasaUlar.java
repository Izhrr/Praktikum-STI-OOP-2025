import java.util.ArrayList;

public class BahasaUlar extends Bahasa {
    public BahasaUlar(ArrayList<String> files) {
        super(files);
        extention = ".piton";
    }

    public void compile() throws BahasaError {
        /* Tambahkan error checking disini */

        System.out.println();
    }

    public void grade(String inputFilename, String outputFilename) throws BahasaError {
        /* Tambahkan error checking disini */
        
        System.out.println("piton " + removeExtention(files.get(0)) + " < " + inputFilename + " > " + outputFilename);
    }
}
