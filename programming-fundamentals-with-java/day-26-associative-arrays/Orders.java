import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.*;

class Orders{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        LinkedHashMap<String, Integer> ProductAmount = new LinkedHashMap<>();
        LinkedHashMap<String, Double> ProductPrice = new LinkedHashMap<>();

        for(String[] input=scanner.nextLine().split(" "); !input[0].equals("buy"); input=scanner.nextLine().split(" ")){
                                   
            ProductAmount.putIfAbsent(input[0], 0);
            ProductAmount.put(input[0], ProductAmount.get(input[0])+Integer.parseInt(input[2]));
            ProductPrice.put(input[0], Double.parseDouble(input[1]));

        }

        for(Map.Entry<String, Integer> entry : ProductAmount.entrySet()){
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()*ProductPrice.get(entry.getKey()));
        }

        
    }
}
