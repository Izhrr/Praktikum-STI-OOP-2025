import java.util.ArrayList;

// Author: Izhar Alif Akbar - 18223129

public class BahasaC extends Bahasa {
    public BahasaC(ArrayList<String> files) {
        super(files);
        extention = ".c";
    }

    public void compile() throws BahasaError {
        /* Tambahkan error checking disini */
        for (String file : this.files) {
            if (!file.endsWith(this.extention)) {
                throw new WrongExtentionException(this.extention, file);
            }
        }
        System.out.println("gcc -o " + removeExtention(files.get(0)) + " " + String.join(" ", files));
    }

    public void grade(String inputFilename, String outputFilename) throws BahasaError {
        /* Tambahkan error checking disini */
        if (!inputFilename.endsWith(".in")) {
            throw new WrongExtentionException(".in", inputFilename);
        }
        if (!outputFilename.endsWith(".out")) {
            throw new WrongExtentionException(".out", outputFilename);
        }
        if (!removeExtention(inputFilename).equals(removeExtention(outputFilename))) {
            throw new TestcaseMismatchException(inputFilename, outputFilename);
        }
        System.out.println("./" + removeExtention(files.get(0)) + " < " + inputFilename + " > " + outputFilename);
    }
}