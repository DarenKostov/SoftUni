import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class CountCharacterTypes{
    public static void main(String[] args) throws IOException {

        String path="./resources/input.txt";

        FileReader fileReader=new FileReader(path);
        Scanner scanner = new Scanner(fileReader);

        int vowels=0;
        int punctuation=0;
        int misc=0;
        
        while(scanner.hasNext()){
            int sum=0;
            for(char in : scanner.nextLine().toCharArray()){
                if(in==' ')
                    continue;

                switch(in){
                    case 'a', 'e', 'i', 'o', 'u':
                        vowels++;
                        break;
                    case '!', '.', ',', '?':
                        punctuation++;
                        break;
                    default:
                        misc++;
                        break;
                
                }
            
            }
        }

        System.out.printf("Vowels: %d\nOther symbols: %d\nPunctuation: %d\n", vowels, misc, punctuation);
    }
}
