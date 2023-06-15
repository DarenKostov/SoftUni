import java.util.*;
import java.util.function.*;

class PredicateForNames{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        BiPredicate<String, Integer> pass= (name, length)->{
            return name.length()<=length;
        };

        

        int maxLength=Integer.parseInt(scanner.nextLine());
        String[] names=scanner.nextLine().split("\\s+");


        for(String name : names){
            if(pass.test(name, maxLength)){
                System.out.println(name);
            }
        }
        
        
    }
}
