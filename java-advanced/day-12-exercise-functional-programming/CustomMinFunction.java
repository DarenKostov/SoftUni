import java.util.*;
import java.util.function.*;

class CustomMinFunction{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] nums=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function <int[], Integer> getMin= (array)->{
            int min=9999999;
            for(int i : array){
                min=Math.min(min, i);
            }
            return min;
        
        };

        System.out.println(getMin.apply(nums));
        
        
    }
}
