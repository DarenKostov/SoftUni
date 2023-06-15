import java.util.*;
import java.util.function.*;

class KnightsOfHonor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Consumer<String[]> print = (in)->{
            for(String out : in){
                System.out.println("Sir "+out);
            }
        };


        String[] people=scanner.nextLine().split("\\s+");
        print.accept(people);

    }
}
