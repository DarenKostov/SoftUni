import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.PrintWriter;

class LineNumbers{
    public static void main(String[] args) throws IOException {

        String inPath="./resources/inputLineNumbers.txt";
        String outPath="./resources/output.txt";

        FileReader fileReader=new FileReader(inPath);
        PrintWriter printer = new PrintWriter(outPath);
        Scanner reader = new Scanner(fileReader);

        int i=0;
        while(reader.hasNext()){
            i++;

            String newLine=i+". "+reader.nextLine();
            
            System.out.println(newLine);
            printer.println(newLine);
        }
        
        reader.close();
        printer.close();

    }
}
