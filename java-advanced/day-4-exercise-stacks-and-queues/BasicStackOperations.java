import java.util.*;
import java.util.stream.Collectors;

class BasicStackOperations{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] operations = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> numsStack= new ArrayDeque<>();

    
        for(int i=0; i<operations[0]; i++){
            numsStack.push(nums[i]);
        }
        for(int i=0; i<operations[1]; i++){
            numsStack.pop();
        }

        if(numsStack.contains(operations[2])){
            System.out.println("true");
        }else if(numsStack.isEmpty()){
            System.out.println("0");
        }else{

            int smallest=9999999;
            for(int num : numsStack){
                smallest=Math.min(num, smallest);
            }        
            System.out.println(smallest);
        }


    }
}
