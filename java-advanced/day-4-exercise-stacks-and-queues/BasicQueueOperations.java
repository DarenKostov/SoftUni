import java.util.*;
import java.util.stream.Collectors;

class BasicQueueOperations{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] operations = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> numsQueue= new ArrayDeque<>();

    
        for(int i=0; i<operations[0]; i++){
            numsQueue.offer(nums[i]);
        }
        for(int i=0; i<operations[1]; i++){
            numsQueue.poll();
        }

        if(numsQueue.contains(operations[2])){
            System.out.println("true");
        }else if(numsQueue.isEmpty()){
            System.out.println("0");
        }else{

            int smallest=9999999;
            for(int num : numsQueue){
                smallest=Math.min(num, smallest);
            }        
            System.out.println(smallest);
        }


    }
}
