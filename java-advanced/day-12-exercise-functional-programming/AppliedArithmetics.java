import java.util.*;
import java.util.function.*;

class AppliedArithmetics{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        
        int[] numsIn=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<Integer> nums=new ArrayList<>();

        for(int num : numsIn){
            nums.add(num);
        }

    

        Consumer<List<Integer>> add=(in)->{
            for(int i=0; i<in.size(); i++){
                in.set(i, in.get(i)+1);
            }
        };
        Consumer<List<Integer>> sub=(in)->{
            for(int i=0; i<in.size(); i++){
                in.set(i, in.get(i)-1);
            }
        };
        Consumer<List<Integer>> mult=(in)->{
            for(int i=0; i<in.size(); i++){
                in.set(i, in.get(i)*2);
            }
        };
        Consumer<List<Integer>> print=(in)->{
            for(int i=0; i<in.size(); i++){
                System.out.print(in.get(i)+" ");
            }
            System.out.println();
        };


        while(true){
            String input=scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            switch(input){
                case "add":
                    add.accept(nums);
                    break;
                case "subtract":
                    sub.accept(nums);
                    break;
                case "multiply":
                    mult.accept(nums);
                    break;
                case "print":
                    print.accept(nums);
                    break;
            
            }
        }
            

    }
}
