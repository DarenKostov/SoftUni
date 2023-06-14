import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

class WordCount{
    public static void main(String[] args) throws IOException {

        String inPath1="./resources/words.txt";
        String inPath2="./resources/text.txt";
        String outPath="./resources/output.txt";

        PrintWriter printer=new PrintWriter(outPath);
        Scanner reader1=new Scanner(new FileReader(inPath1));
        Scanner reader2=new Scanner(new FileReader(inPath2));

        
        Map<String, Integer> words=new LinkedHashMap<>();

        String[] input=reader1.nextLine().split(" ");
        for(String in : input){
            words.put(in, 0);
        }


        input=reader2.nextLine().replace(",", "").replace(".", "").split(" ");

        for(String in : input){
            if(words.containsKey(in)){
                words.put(in, words.get(in)+1);
            }
            
        }

        for(Map.Entry<String, Integer> in : words.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new)).entrySet()){
            
            printer.println(in.getKey()+" - "+in.getValue());
        }

        
        


        
        reader1.close();
        reader2.close();
        printer.close();
    }
}
