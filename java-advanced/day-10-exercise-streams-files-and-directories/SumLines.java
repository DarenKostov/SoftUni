import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class SumLines{
    public static void main(String[] args) throws IOException {

        String path="./resources/input.txt";

        FileReader fileReader=new FileReader(path);
        Scanner scanner = new Scanner(fileReader);


        while(scanner.hasNext()){
            int sum=0;
            for(char in : scanner.nextLine().toCharArray()){
                sum+=in;
            }
            System.out.println(sum);
        }
    }
}
