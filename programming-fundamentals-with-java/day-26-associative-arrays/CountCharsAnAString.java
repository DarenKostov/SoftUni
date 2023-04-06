import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.*;

class CountCharsAnAString{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine().replace(" ", "");;
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for(int i=0; i<input.length(); i++){
            if(charMap.get(input.charAt(i))==null)
    			charMap.put(input.charAt(i), 1);
            else
    			charMap.put(input.charAt(i), charMap.get(input.charAt(i))+1);
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
        }
        
    }
}
