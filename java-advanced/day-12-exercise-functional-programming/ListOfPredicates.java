import java.util.*;
import java.util.function.*;

class ListOfPredicates{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        BiPredicate<Integer, int[]> canDevide= (num, array)->{
            for(int element : array){
                if(num%element!=0){
                    return false;
                }
            
            }
            return true;
        };


        
        int N=Integer.parseInt(scanner.nextLine());
        int[] nums=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        for(int i=1; i<N+1; i++){
            if(canDevide.test(i, nums)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        
    }
}
