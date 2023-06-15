import java.util.*;
import java.util.function.*;

class ReverseAndExclude{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        


        BiConsumer<int[], Integer> specialPrint= (array, num)->{
            for(int i=array.length-1; i>=0; i--){
                if(array[i]%num==0){
                    continue;
                }
                System.out.print(array[i]+" ");
            }
            System.out.println();
        
        };


        int[] nums=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int num=Integer.parseInt(scanner.nextLine());
        specialPrint.accept(nums, num);

        
        
    }
}
