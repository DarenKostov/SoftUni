import java.util.*;
import java.util.function.*;

class FindTheSmallestElement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] nums=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function <int[], Integer> getMinIndex= (array)->{
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int i=0; i<array.length; i++){
                if(min>=array[i]){
                    min=array[i];
                    index=i;
                }
            }
            return index;

        };

        System.out.println(getMinIndex.apply(nums));



    }
}
