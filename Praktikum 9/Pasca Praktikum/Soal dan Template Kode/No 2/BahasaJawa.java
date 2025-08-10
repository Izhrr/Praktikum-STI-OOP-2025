import java.util.ArrayList;

public class BahasaJawa extends Bahasa {
    public BahasaJawa(ArrayList<String> files) {
        super(files);
        extention = ".jawa";
    }

    public void compile() throws BahasaError {
        /* Tambahkan error checking disini */

        System.out.println("jawac " + String.join(" ", files));
    }

    public void grade(String inputFilename, String outputFilename) throws BahasaError {
        /* Tambahkan error checking disini */
        
        System.out.println("jawa " + removeExtention(files.get(0)) + " < " + inputFilename + " > " + outputFilename);
    }
}
