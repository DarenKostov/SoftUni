import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.*;

class AMinerTask{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();

        while(!input.equals("stop")){
        
            materials.putIfAbsent(input, 0);
            materials.put(input, Integer.parseInt(scanner.nextLine())+materials.get(input));
            input=scanner.nextLine();
        
        }


        for(Map.Entry<String, Integer> entry : materials.entrySet()){
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
        
    }
}
