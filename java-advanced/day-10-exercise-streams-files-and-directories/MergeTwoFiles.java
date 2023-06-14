import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class MergeTwoFiles{
    public static void main(String[] args) throws IOException {

        String inPath1="./resources/inputOne.txt";
        String inPath2="./resources/inputTwo.txt";
        String outPath="./resources/output.txt";

        PrintWriter printer=new PrintWriter(outPath);
        Scanner reader1=new Scanner(new FileReader(inPath1));
        Scanner reader2=new Scanner(new FileReader(inPath2));

        while(reader1.hasNext()){
            printer.println(reader1.nextLine());
        }
        while(reader2.hasNext()){
            printer.println(reader2.nextLine());
        }

        
        reader1.close();
        reader2.close();
        printer.close();
    }
}
