import java.util.*;
import java.util.stream.Collectors;


class ReverseNumbersWithAStack{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        List<Integer> numsL= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        
        ArrayDeque<Integer> numsStack= new ArrayDeque<>();

        for(Integer num : numsL){
            numsStack.push(num);
        }
        for(Integer num : numsStack){
            System.out.print(num+" ");
        }
        System.out.println();

    }
}
