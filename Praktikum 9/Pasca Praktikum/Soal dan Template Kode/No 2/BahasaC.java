import java.util.ArrayList;

public class BahasaC extends Bahasa {
    public BahasaC(ArrayList<String> files) {
        super(files);
        extention = ".c";
    }

    public void compile() throws BahasaError {
        /* Tambahkan error checking disini */

        System.out.println("gcc -o " + removeExtention(files.get(0)) + " " + String.join(" ", files));
    }

    public void grade(String inputFilename, String outputFilename) throws BahasaError {
        /* Tambahkan error checking disini */

        System.out.println("./" + removeExtention(files.get(0)) + " < " + inputFilename + " > " + outputFilename);
    }
}
