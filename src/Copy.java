import java.io.*;
import java.io.PrintWriter;
import java.util.*;

public class Copy {
    public static void main(String[] args) {

        String inputFileName ;
        String outputFileName;

        inputFileName= args[0];
        outputFileName = args[1] ;

        System.out.println(inputFileName);
        System.out.println(outputFileName);

        File inputFile;
        Scanner in =null;
        PrintWriter out = null;

        try{
            inputFile = new File(inputFileName);
            in = new Scanner(inputFile);
            out = new PrintWriter(outputFileName);
        }
        catch ( FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            while (in.hasNextLine()) {              //NullPointerException still there in line 32,34,38
                String value = in.nextLine();
                out.printf("%s%n", value);
            }

            in.close();
            out.close();
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}