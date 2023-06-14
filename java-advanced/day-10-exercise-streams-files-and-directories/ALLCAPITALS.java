import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class ALLCAPITALS{
    public static void main(String[] args) throws IOException {

        String path="./resources/input.txt";

        FileReader fileReader=new FileReader(path);
        Scanner scanner = new Scanner(fileReader);


        while(scanner.hasNext()){
            System.out.println(scanner.nextLine().toUpperCase());
        }

    }
}
