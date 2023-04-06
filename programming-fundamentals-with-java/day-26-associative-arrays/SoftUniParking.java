import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.*;

class SoftUniParking{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, String> plates = new LinkedHashMap<>();
        int N=Integer.parseInt(scanner.nextLine());
            
        for(int i=0; i<N; i++){
            String[] input=scanner.nextLine().split(" ");

            if(input[0].equals("register")){

                if(plates.get(input[1])!=null){
                    System.out.printf("ERROR: already registered with plate number %s\n", plates.get(input[1]));
                    continue;
                }
                plates.put(input[1], input[2]);
                System.out.printf("%s registered %s successfully\n", input[1], input[2]);
            }else{
                if(plates.get(input[1])==null){
                    System.out.printf("ERROR: user %s not found\n", input[1]);
                    continue;
                }
                plates.remove(input[1]);
                System.out.printf("%s unregistered successfully\n", input[1]);
            
            }
            
        }
        
        for(Map.Entry<String, String> entry : plates.entrySet())
                System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
       
    }
}
