import java.util.*;
import java.util.function.*;

class CustomComparator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        

        Comparator<Integer> comparator=(num1, num2)->{
            if(num1%2==0 && num2%2!=0){
                return -1;
            }
            if(num1%2!=0 && num2%2==0){
                return 1;
            }


            return num1.compareTo(num2);
        
        };

    
        Integer[] nums=Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);

        Arrays.sort(nums, comparator);
        

        for(int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();





    }
}
